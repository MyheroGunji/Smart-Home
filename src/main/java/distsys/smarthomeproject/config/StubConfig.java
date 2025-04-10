package distsys.smarthomeproject.config;

import generated.grpc.climatecontrolservice.ClimateControlServiceGrpc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.grpc.client.GrpcChannelFactory;

@Configuration
public class StubConfig {

    @Bean
    ClimateControlServiceGrpc.ClimateControlServiceBlockingStub climateControlServiceBlockingStub(GrpcChannelFactory channelFactory){
        return ClimateControlServiceGrpc.newBlockingStub( channelFactory.createChannel( "service1" ) );
    }
}
