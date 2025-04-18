package org.example.controller;

import generated.grpc.climatecontrolservice.ClimateControlServiceGrpc;
import generated.grpc.climatecontrolservice.RoomLocation;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class ClimateController {
    @Resource
    ClimateControlServiceGrpc.ClimateControlServiceBlockingStub climateControlServiceBlockingStub ;
    @Resource
    ClimateControlServiceGrpc.ClimateControlServiceStub climateControlServiceStub;

    @GetMapping("/climate")
    public String getClimate(){
        log.info("get climate from service");
        RoomLocation location = RoomLocation.newBuilder().setRoomName( "1" ).build();
        double climate = climateControlServiceBlockingStub.currentTemperature( location ).getValue();
        return climate + "";
    }

    @GetMapping("/another")
    public String geta(){
        RoomLocation location = RoomLocation.newBuilder().setRoomName( "1" ).build();
      //  climateControlServiceStub.monitorTemperature(  );
        return"";
    }

    @GetMapping("/test")
    public String getTest(){
        return "test";
    }

}
