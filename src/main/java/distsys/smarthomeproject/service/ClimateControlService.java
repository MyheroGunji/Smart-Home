package distsys.smarthomeproject.service;

import generated.grpc.climatecontrolservice.ClimateControlServiceGrpc;
import generated.grpc.climatecontrolservice.RoomLocation;
import generated.grpc.climatecontrolservice.Temperature;
import io.grpc.stub.StreamObserver;

public class ClimateControlService extends ClimateControlServiceGrpc.ClimateControlServiceImplBase {
    @Override
    public void monitorTemperature(RoomLocation request, StreamObserver<Temperature> responseObserver) {
        super.monitorTemperature( request, responseObserver );
    }

    @Override
    public void currentTemperature(RoomLocation request, StreamObserver<Temperature> responseObserver) {
        super.currentTemperature( request, responseObserver );
    }

    @Override
    public StreamObserver<Temperature> averageTemperature(StreamObserver<Temperature> responseObserver) {
        return super.averageTemperature( responseObserver );
    }
}
