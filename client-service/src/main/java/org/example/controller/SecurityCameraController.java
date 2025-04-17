package org.example.controller;

import generated.grpc.securitycameraservice.*;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/camera")
@Slf4j
public class SecurityCameraController {

    @Resource
    SecurityCameraServiceGrpc.SecurityCameraServiceBlockingStub cameraStub;
    // POST Test: localhost:8000/api/camera/motion?cameraId=livingRoom&motionType=movement
    @PostMapping("/motion")
    public String sendMotionAlert(@RequestParam String cameraId, @RequestParam String motionType) {
        MotionEvent event = MotionEvent.newBuilder()
                .setCameraId(cameraId)
                .setMotionType(motionType)
                .setTimestamp(String.valueOf(System.currentTimeMillis()))
                .build();

        MotionAck ack = cameraStub.sendMotionAlert(event);
        return "ACK: " + ack.getMessage() + " at " + ack.getReceivedAt();
    }

    // GET Test: localhost:8000/api/camera/snapshots?cameraId=livingRoom&count=5
    @GetMapping("/snapshots")
    public List<String> getSnapshots(@RequestParam String cameraId, @RequestParam int count) {
        SnapshotRequest request = SnapshotRequest.newBuilder()
                .setCameraId(cameraId)
                .setCount(count)
                .build();

        List<String> timestamps = new ArrayList<>();
        cameraStub.receiveCameraSnapshots(request).forEachRemaining(snapshot -> {
            // Return only timestamp like; 2025-04-17T03:22:59.178693700Z
            // 画像は bytes 型なので表示用には timestamp のみ返す
            timestamps.add("Snapshot @ " + snapshot.getTimestamp());
        });

        return timestamps;
    }
}
