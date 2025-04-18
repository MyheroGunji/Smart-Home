package org.example.config;

import generated.grpc.climatecontrolservice.ClimateControlServiceGrpc;
import generated.grpc.securitycameraservice.SecurityCameraServiceGrpc;
import generated.grpc.smartlightning.SmartLightingGrpc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.grpc.client.GrpcChannelFactory;

@Configuration
public class StubConfig {

    @Bean
    ClimateControlServiceGrpc.ClimateControlServiceBlockingStub climateControlServiceBlockingStub(GrpcChannelFactory channelFactory){
        return ClimateControlServiceGrpc.newBlockingStub( channelFactory.createChannel( "service1" ) );
    }

    @Bean
    ClimateControlServiceGrpc.ClimateControlServiceStub climateControlServiceStub(GrpcChannelFactory channelFactory){
        return ClimateControlServiceGrpc.newStub( channelFactory.createChannel( "service1" ) );
    }

    @Bean
    SmartLightingGrpc.SmartLightingBlockingStub smartLightingBlockingStub(GrpcChannelFactory channelFactory) {
        return SmartLightingGrpc.newBlockingStub(channelFactory.createChannel("lightingService"));
    }

    @Bean
    SecurityCameraServiceGrpc.SecurityCameraServiceBlockingStub securityCameraServiceBlockingStub(GrpcChannelFactory channelFactory) {
        return SecurityCameraServiceGrpc.newBlockingStub(channelFactory.createChannel("cameraService"));
    }



}
