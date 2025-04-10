package distsys.smarthomeproject.service;

import generated.grpc.securitycameraservice.*;
import io.grpc.stub.StreamObserver;

public class SecurityCameraService extends SecurityCameraServiceGrpc.SecurityCameraServiceImplBase {
    @Override
    public StreamObserver<CameraControl> streamLiveCamera(StreamObserver<CameraFeed> responseObserver) {
        return super.streamLiveCamera( responseObserver );
    }

    @Override
    public void sendMotionAlert(MotionEvent request, StreamObserver<MotionAck> responseObserver) {
        super.sendMotionAlert( request, responseObserver );
    }

    @Override
    public void receiveCameraSnapshots(SnapshotRequest request, StreamObserver<SnapshotImage> responseObserver) {
        super.receiveCameraSnapshots( request, responseObserver );
    }

    @Override
    public StreamObserver<CameraLogEntry> uploadCameraLog(StreamObserver<UploadResult> responseObserver) {
        return super.uploadCameraLog( responseObserver );
    }
}
