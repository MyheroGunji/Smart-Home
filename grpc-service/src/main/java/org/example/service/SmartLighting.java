package org.example.service;

import generated.grpc.smartlightning.LightRequest;
import generated.grpc.smartlightning.LightResponse;
import generated.grpc.smartlightning.SmartLightingGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

import java.util.HashMap;
import java.util.Map;
@GrpcService
//Unary RPC
public class SmartLighting extends SmartLightingGrpc.SmartLightingImplBase {
        // 部屋ごとのライトの状態を保存する仮のデータ
        // Virtual data that stores the lighting status for each room
        private Map<String, Boolean> roomLights = new HashMap<>();

        public SmartLighting() {
            // 初期状態として、全ての部屋のライトをオフに設定
            // Initially, turn off all room lights
            roomLights.put( "LivingRoom", false );
            roomLights.put( "Bedroom", false );
            roomLights.put( "Kitchen", false );
        }

        @Override
        public void turnOnLight(LightRequest request, StreamObserver<LightResponse> responseObserver) {

            String room = request.getRoom();

            // 部屋が存在するか確認し、ライトをオンにする
            // Check if the room exists and turn on the light
            if (roomLights.containsKey(room)) {
                roomLights.put(room, true); // ライトをオンに設定
                LightResponse response = LightResponse.newBuilder()
                        .setStatus("Light in " + room + " is turned ON.")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            } else {
                LightResponse response = LightResponse.newBuilder()
                        .setStatus("Room not found!")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        }

        @Override
        public void turnOffLight(LightRequest request, StreamObserver<LightResponse> responseObserver) {

            String room = request.getRoom();

            // 部屋が存在するか確認し、ライトをオフにする
            // Check if the room exists and turn off the light
            if (roomLights.containsKey(room)) {
                roomLights.put(room, false); // turn off the light
                LightResponse response = LightResponse.newBuilder()
                        .setStatus("Light in " + room + " is turned OFF.")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            } else {
                // make response and send it back to stream
                LightResponse response = LightResponse.newBuilder()
                        .setStatus("Room not found!")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();// Complete stream
            }
        }

}
