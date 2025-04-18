package org.example.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;

@Component
public class ApiKeyFilter extends OncePerRequestFilter {

    @Value("${api.key}")
    private String expectedApiKey;


    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {
        String apiKey = request.getHeader("X-API-KEY");

        // For debug - output expectedApiKey (デバッグ用に expectedApiKey を出力)
        System.out.println("Expected API Key: " + expectedApiKey);
        System.out.println("Received API Key: " + apiKey);

        if (expectedApiKey.equals(apiKey)) {
            // Spring Security に「認証済み」と教える
            UsernamePasswordAuthenticationToken auth =
                    new UsernamePasswordAuthenticationToken("api-key-user", null,
                            List.of(new SimpleGrantedAuthority("ROLE_API_USER")));
            SecurityContextHolder.getContext().setAuthentication(auth);

            filterChain.doFilter(request, response); // OK -> next
        } else {
            System.out.println("Invalid API Key"); // For debug
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // 401
            response.getWriter().write("Invalid API Key");
        }
    }
}
