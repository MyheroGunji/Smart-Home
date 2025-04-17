package org.example.gui;

// SmartLightingClientGUI.java

import generated.grpc.smartlightning.SmartLightingGrpc;
import generated.grpc.smartlightning.LightRequest;
import generated.grpc.smartlightning.LightResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SmartLightingClientGUI extends JFrame {

    private JComboBox<String> roomSelector;
    private JButton turnOnButton;
    private JButton turnOffButton;
    private JLabel statusLabel;

    private SmartLightingGrpc.SmartLightingBlockingStub blockingStub;

    public SmartLightingClientGUI() {
        setTitle("Smart Lighting Controller");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Set gRPC channel. grpcチャンネル設定
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        blockingStub = SmartLightingGrpc.newBlockingStub(channel);

        // Choose the room. 部屋選択用
        String[] rooms = {"Living Room", "Kitchen", "Bedroom", "Bathroom"};
        roomSelector = new JComboBox<>(rooms);

        // Button and label ボタンとラベル
        turnOnButton = new JButton("Turn ON");
        turnOffButton = new JButton("Turn OFF");
        statusLabel = new JLabel("Status: Waiting", SwingConstants.CENTER);

        // Button action. ボタン動作
        turnOnButton.addActionListener(e -> sendLightCommand(true));
        turnOffButton.addActionListener(e -> sendLightCommand(false));

        // Add in Panel. パネルに追加
        add(roomSelector);
        add(turnOnButton);
        add(turnOffButton);
        add(statusLabel);
    }

    private void sendLightCommand(boolean turnOn) {
        String room = (String) roomSelector.getSelectedItem();
        LightRequest request = LightRequest.newBuilder().setRoom(room).build();
        LightResponse response;

        try {
            if (turnOn) {
                response = blockingStub.turnOnLight(request);
            } else {
                response = blockingStub.turnOffLight(request);
            }
            statusLabel.setText("Status: " + response.getStatus());
        } catch (Exception e) {
            statusLabel.setText("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SmartLightingClientGUI gui = new SmartLightingClientGUI();
            gui.setVisible(true);
        });
    }
}

