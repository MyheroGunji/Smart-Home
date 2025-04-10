package distsys.smarthomeproject.service;

import generated.grpc.smartlightning.LightRequest;
import generated.grpc.smartlightning.LightResponse;
import generated.grpc.smartlightning.SmartLightingGrpc;
import io.grpc.stub.StreamObserver;

public class SmartLighting extends SmartLightingGrpc.SmartLightingImplBase {
    @Override
    public void turnOnLight(LightRequest request, StreamObserver<LightResponse> responseObserver) {
        super.turnOnLight( request, responseObserver );
    }

    @Override
    public void turnOffLight(LightRequest request, StreamObserver<LightResponse> responseObserver) {
        super.turnOffLight( request, responseObserver );
    }
}
