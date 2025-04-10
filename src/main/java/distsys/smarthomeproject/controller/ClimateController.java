package distsys.smarthomeproject.controller;

import generated.grpc.climatecontrolservice.ClimateControlServiceGrpc;
import generated.grpc.climatecontrolservice.RoomLocation;
import jakarta.annotation.Resource;
import org.springframework.grpc.client.ImportGrpcClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ClimateController {
    @Resource
    ClimateControlServiceGrpc.ClimateControlServiceBlockingStub climateControlServiceBlockingStub ;

    @GetMapping("/climate")
    public String getClimate(){
        RoomLocation location = RoomLocation.newBuilder().setRoomName( "1" ).build();
        double climate = climateControlServiceBlockingStub.currentTemperature( location ).getValue();
        return climate + "";
    }

    @GetMapping("/test")
    public String getTest(){
        return "test";
    }
}
