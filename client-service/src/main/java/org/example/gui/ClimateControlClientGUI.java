package org.example.gui;

import generated.grpc.climatecontrolservice.ClimateControlServiceGrpc;
import generated.grpc.climatecontrolservice.RoomLocation;
import generated.grpc.climatecontrolservice.Temperature;

import io.grpc.*;

import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;

import javax.swing.*;
import java.awt.*;

public class ClimateControlClientGUI extends JFrame {

    private JTextField roomInput;
    private JTextField apiKeyField;
    private JButton startButton;
    private JTextArea outputArea;

    private ManagedChannel channel;

    public ClimateControlClientGUI() {
        setTitle("Climate Control Monitor");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // gRPC接続
        channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        // UIパーツ
        JPanel topPanel = new JPanel(new FlowLayout());

        roomInput = new JTextField(10);
        apiKeyField = new JTextField(15);
        startButton = new JButton("Start Monitoring");

        topPanel.add(new JLabel("Room:"));
        topPanel.add(roomInput);

        topPanel.add(new JLabel("API Key:"));
        topPanel.add(apiKeyField);

        topPanel.add(startButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // ボタン押下時の処理
        startButton.addActionListener(e -> {
            String room = roomInput.getText().trim();
            String apiKey = apiKeyField.getText().trim();
            if (!room.isEmpty() && !apiKey.isEmpty()) {
                startMonitoring(room, apiKey);
            } else {
                outputArea.append("Please enter both room and API key.\n");
            }
        });
    }

    private void startMonitoring(String roomName, String apiKey) {
        // Add API key to the GUI header
        Metadata metadata = new Metadata();
        Metadata.Key<String> apiKeyHeader = Metadata.Key.of("x-api-key", Metadata.ASCII_STRING_MARSHALLER);
        metadata.put(apiKeyHeader, apiKey);

        // インターセプターでStubをラップ
        ClientInterceptor apiKeyInterceptor = MetadataUtils.newAttachHeadersInterceptor(metadata);
        ClimateControlServiceGrpc.ClimateControlServiceStub stubWithApiKey =
                ClimateControlServiceGrpc.newStub(channel).withInterceptors(apiKeyInterceptor);

        RoomLocation request = RoomLocation.newBuilder()
                .setRoomName(roomName)
                .build();

        outputArea.append("Monitoring temperature for: " + roomName + "\n");

        stubWithApiKey.monitorTemperature(request, new StreamObserver<Temperature>() {
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
