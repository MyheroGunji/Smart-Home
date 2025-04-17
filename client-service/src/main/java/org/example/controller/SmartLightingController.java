package org.example.controller;

import generated.grpc.smartlightning.LightRequest;
import generated.grpc.smartlightning.SmartLightingGrpc;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lighting")
@Slf4j
public class SmartLightingController {

    @Resource
    SmartLightingGrpc.SmartLightingBlockingStub smartLightingBlockingStub;

    @GetMapping("")
    public String lightingHome() {
        return "SmartLightingController is working!";
    }

    // Test: localhost:8000/api/lighting/on?room=Kitchen
    @PostMapping("/on")
    public String turnOnLight(@RequestParam String room) {
        log.info("Turning on light in room: {}", room);
        LightRequest request = LightRequest.newBuilder().setRoom(room).build();
        String status = smartLightingBlockingStub.turnOnLight(request).getStatus();
        return "Light ON → " + status;
    }

    // Test: localhost:8000/api/lighting/off?room=Kitchen
    @PostMapping("/off")
    public String turnOffLight(@RequestParam String room) {
        log.info("Turning off light in room: {}", room);
        LightRequest request = LightRequest.newBuilder().setRoom(room).build();
        String status = smartLightingBlockingStub.turnOffLight(request).getStatus();
        return "Light OFF → " + status;
    }
}
