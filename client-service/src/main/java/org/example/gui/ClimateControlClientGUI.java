package org.example.gui;

import generated.grpc.climatecontrolservice.ClimateControlServiceGrpc;
import generated.grpc.climatecontrolservice.RoomLocation;
import generated.grpc.climatecontrolservice.Temperature;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.swing.*;
import java.awt.*;

public class ClimateControlClientGUI extends JFrame {

    private JTextField roomInput;
    private JButton startButton;
    private JTextArea outputArea;

    private ClimateControlServiceGrpc.ClimateControlServiceStub asyncStub;

    public ClimateControlClientGUI() {
        setTitle("Climate Control Monitor");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // gRPC接続
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        asyncStub = ClimateControlServiceGrpc.newStub(channel);

        // UIパーツ
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        roomInput = new JTextField(15);
        startButton = new JButton("Start Monitoring");

        topPanel.add(new JLabel("Room:"));
        topPanel.add(roomInput);
        topPanel.add(startButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // ボタン押下時の処理
        startButton.addActionListener(e -> {
            String room = roomInput.getText().trim();
            if (!room.isEmpty()) {
                startMonitoring(room);
            }
        });
    }

    private void startMonitoring(String roomName) {
        RoomLocation request = RoomLocation.newBuilder()
                .setRoomName(roomName)
                .build();

        outputArea.append("Monitoring temperature for: " + roomName + "\n");

        asyncStub.monitorTemperature(request, new StreamObserver<Temperature>() {
            @Override
            public void onNext(Temperature temp) {
                SwingUtilities.invokeLater(() -> {
                    outputArea.append("Temperature: " + temp.getValue() + " °C\n");
                });
            }

            @Override
            public void onError(Throwable t) {
                SwingUtilities.invokeLater(() -> {
                    outputArea.append("Error: " + t.getMessage() + "\n");
                });
            }

            @Override
            public void onCompleted() {
                SwingUtilities.invokeLater(() -> {
                    outputArea.append("Monitoring completed.\n");
                });
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ClimateControlClientGUI().setVisible(true);
        });
    }
}
