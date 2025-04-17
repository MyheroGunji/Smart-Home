package org.example.service;

import com.google.protobuf.ByteString;
import generated.grpc.securitycameraservice.*;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@GrpcService
public class SecurityCameraService extends SecurityCameraServiceGrpc.SecurityCameraServiceImplBase {
    @Override
    // BiDi RPC
    /* Receives camera operations (zoom, pan, etc.) from the client,
    processes them on the server side, and returns the results (camera image) to the client. */

    public StreamObserver<CameraControl> streamLiveCamera(StreamObserver<CameraFeed> responseObserver) {
        // 新しいStreamObserverを返す
        // return new StreamObserver
        return new StreamObserver<CameraControl>() {
            @Override
            public void onNext(CameraControl control) {
                // クライアントからのコマンドを処理（例：ズーム、パンなど）
                // process command from client (ex: zooming or pan)
                System.out.println("Received control command: " + control.getCommand());
                // 仮の映像データを返す（実際にはカメラ操作の結果を返す）
                // return the dummy video data
                CameraFeed feed = CameraFeed.newBuilder()
                        .setVideoChunk(ByteString.copyFromUtf8("dummy_video_data"))
                        .setStatus("OK")
                        .build();

                responseObserver.onNext(feed);  // Return the camera feed to client カメラ映像をクライアントに返す
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in stream: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // When stream is done, print the message
                System.out.println("Stream completed");
                responseObserver.onCompleted();
            }
        };
    }

    // Unary RPC
    @Override
    public void sendMotionAlert(MotionEvent request, StreamObserver<MotionAck> responseObserver) {
        System.out.println("Motion alert received from camera: " + request.getCameraId());
        System.out.println("Motion type: " + request.getMotionType());
        System.out.println("Timestamp: " + request.getTimestamp());

        MotionAck ack = MotionAck.newBuilder()
                .setMessage("Motion received successfully")
                .setReceivedAt( Instant.now().toString())
                .build();

        responseObserver.onNext(ack);
        responseObserver.onCompleted();
    }

    // Server Streaming
    @Override
    public void receiveCameraSnapshots(SnapshotRequest request, StreamObserver<SnapshotImage> responseObserver) {
        int count = request.getCount();
        String cameraId = request.getCameraId();  // 必要なら使えるように保持

        for (int i = 0; i < count; i++) {
            SnapshotImage image = SnapshotImage.newBuilder()
                    .setImageData( ByteString.copyFromUtf8( "dummy_image_data_" + i))
                    .setTimestamp( Instant.now().toString())
                    .build();

            responseObserver.onNext(image);

            // ちょっとリアルっぽくするなら少し待つ
            try {
                Thread.sleep(500); // 0.5sec wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        responseObserver.onCompleted(); // end of streaming
    }

    // Client Streaming
    // The client streams CameraLogEntry multiple times and at the end, server returns message
    @Override
    public StreamObserver<CameraLogEntry> uploadCameraLog(StreamObserver<UploadResult> responseObserver) {
        List<CameraLogEntry> receivedLogs = new ArrayList<>();

        return new StreamObserver<>() {
            @Override
            public void onNext(CameraLogEntry logEntry) {
                System.out.println("Received log: " + logEntry.getLogType() + " - " + logEntry.getDescription());
                receivedLogs.add(logEntry);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("UploadCameraLog error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                UploadResult result = UploadResult.newBuilder()
                        .setEntryCount(receivedLogs.size())
                        .setMessage("Complete log upload!")
                        .build();

                responseObserver.onNext(result);
                responseObserver.onCompleted();
            }
        };
    }
}
