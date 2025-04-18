package org.example.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SmartLightingClientGUI extends JFrame {

    private JComboBox<String> roomSelector;
    private JTextField apiKeyField;
    private JButton turnOnButton;
    private JButton turnOffButton;
    private JLabel statusLabel;

    public SmartLightingClientGUI() {
        setTitle("Smart Lighting Controller");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        // 部屋の選択
        String[] rooms = {"LivingRoom", "Kitchen", "Bedroom", "Bathroom"};
        roomSelector = new JComboBox<>(rooms);

        // APIキー入力欄
        apiKeyField = new JTextField();
        apiKeyField.setToolTipText("Enter API Key");

        // ボタンとステータスラベル
        turnOnButton = new JButton("Turn ON");
        turnOffButton = new JButton("Turn OFF");
        statusLabel = new JLabel("Status: Waiting", SwingConstants.CENTER);

        // ボタンの動作
        turnOnButton.addActionListener(e -> sendLightCommand(true));
        turnOffButton.addActionListener(e -> sendLightCommand(false));

        // パネルに追加
        add(new JLabel("Select Room:", SwingConstants.CENTER));
        add(roomSelector);
        add(new JLabel("Enter API Key:", SwingConstants.CENTER));
        add(apiKeyField);
        add(turnOnButton);
        add(turnOffButton);
        add(statusLabel);
    }

    private void sendLightCommand(boolean turnOn) {
        String room = (String) roomSelector.getSelectedItem();
        String apiKey = apiKeyField.getText();

        String action = turnOn ? "on" : "off";
        String urlStr = "http://localhost:8000/api/lighting/" + action + "?room=" + room;

        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("x-api-key", apiKey);  // ← ヘッダーにAPIキーを追加
            conn.setDoOutput(true);

            int responseCode = conn.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    responseCode == 200 ? conn.getInputStream() : conn.getErrorStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            statusLabel.setText("Status: " + response.toString());

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
