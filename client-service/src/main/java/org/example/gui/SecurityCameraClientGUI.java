package org.example.gui;

import generated.grpc.securitycameraservice.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.swing.*;
import java.awt.*;

public class SecurityCameraClientGUI extends JFrame {

    private JTextField roomInput;
    private JTextField cameraIdField;
    private JTextField motionTypeField;
    private JButton startButton;
    private JButton sendEventButton;
    private JTextArea responseArea;

    private SecurityCameraServiceGrpc.SecurityCameraServiceStub asyncStub;

    public SecurityCameraClientGUI() {
        setTitle("Security Camera Event Monitoring");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // gRPC接続
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();
        asyncStub = SecurityCameraServiceGrpc.newStub(channel);

        // UIパーツ
        JPanel topPanel = new JPanel(new GridLayout(2, 2));
        topPanel.add(new JLabel("Room:"));
        roomInput = new JTextField();
        topPanel.add(roomInput);

        startButton = new JButton("Start Monitoring");
        topPanel.add(startButton);

        sendEventButton = new JButton("Send Event");
        topPanel.add(sendEventButton);

        add(topPanel, BorderLayout.NORTH);

        // Event and Alerts Input
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(new JLabel("Camera ID:"));
        cameraIdField = new JTextField();
        inputPanel.add(cameraIdField);

        inputPanel.add(new JLabel("Motion Type:"));
        motionTypeField = new JTextField();
        inputPanel.add(motionTypeField);

        add(inputPanel, BorderLayout.CENTER);

        responseArea = new JTextArea();
        responseArea.setEditable(false);
        add(new JScrollPane(responseArea), BorderLayout.SOUTH);

        // Process of when you press button ボタン押下時の処理
        startButton.addActionListener(e -> {
            String room = roomInput.getText().trim();
            if (!room.isEmpty()) {
                startMonitoring(room);
            }
        });

        sendEventButton.addActionListener(e -> {
            String cameraId = cameraIdField.getText().trim();
            String motionType = motionTypeField.getText().trim();

            if (!cameraId.isEmpty() && !motionType.isEmpty()) {
                sendMotionEvent(cameraId, motionType);
            } else {
                responseArea.append("Please enter both camera ID and motion type.\n");
            }
        });
    }

    private void startMonitoring(String roomName) {
        // Start monitoring
        responseArea.append("Monitoring started for room: " + roomName + "\n");

        // Make a SnapshotRequest. SnapshotRequestの作成（カメラIDやその他の情報が必要な場合追加）
        SnapshotRequest request = SnapshotRequest.newBuilder()
                .setCameraId("camera_1")  // 必要に応じて適切なカメラIDを指定
                .setCount(5)  // 5 snap shots. 例: 5枚のスナップショットを要求
                .build();

        // Receive real-time alerts from server サーバーからのリアルタイムアラート受信
        asyncStub.receiveCameraSnapshots(
                request,  // send request
                new StreamObserver<SnapshotImage>() {
                    @Override
                    public void onNext(SnapshotImage value) {
                        // スナップショットを受け取った場合の処理
                        SwingUtilities.invokeLater(() -> {
                            responseArea.append("New snapshot received: Timestamp: " + value.getTimestamp() + "\n");
                            // 画像データの処理も追加できる
                        });
                    }

                    @Override
                    public void onError(Throwable t) {
                        SwingUtilities.invokeLater(() -> responseArea.append("Error: " + t.getMessage() + "\n"));
                    }

                    @Override
                    public void onCompleted() {
                        SwingUtilities.invokeLater(() -> responseArea.append("Completed monitoring.\n"));
                    }
                });
    }


    private void sendMotionEvent(String cameraId, String motionType) {
        // MotionEventのリクエストを作成して送信
        MotionEvent request = MotionEvent.newBuilder()
                .setCameraId(cameraId)
                .setMotionType(motionType)
                .setTimestamp(java.time.Instant.now().toString())
                .build();

        // サーバーに送信して応答を取得
        asyncStub.sendMotionAlert(request, new StreamObserver<MotionAck>() {
            @Override
            public void onNext(MotionAck response) {
                SwingUtilities.invokeLater(() -> {
                    responseArea.append("Alert sent: " + response.getMessage() + "\n");
                    responseArea.append("Received at: " + response.getReceivedAt() + "\n");
                });
            }

            @Override
            public void onError(Throwable t) {
                SwingUtilities.invokeLater(() -> responseArea.append("Error: " + t.getMessage() + "\n"));
            }

            @Override
            public void onCompleted() {
                // 完了後の処理（例：UI更新）
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SecurityCameraClientGUI().setVisible(true);
        });
    }
}
