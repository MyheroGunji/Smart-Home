package org.example.service;

import generated.grpc.climatecontrolservice.ClimateControlServiceGrpc;
import generated.grpc.climatecontrolservice.RoomLocation;
import generated.grpc.climatecontrolservice.Temperature;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class ClimateControlService extends ClimateControlServiceGrpc.ClimateControlServiceImplBase {
    @Override
    public void monitorTemperature(RoomLocation request, StreamObserver<Temperature> responseObserver) {
        super.monitorTemperature( request, responseObserver );
        String roomName = request.getRoomName();
        for (int i = 0; i < 10; i++) {
            Temperature temp = Temperature.newBuilder()
                    .setValue(20.0 + Math.random() * 5)  // ランダムな温度を生成
                    .build();

            responseObserver.onNext(temp);  // クライアントに温度を送信
            try {
                Thread.sleep(1000);  // 1秒ごとに温度を送信
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        responseObserver.onCompleted();  // ストリーム終了
    }

    @Override
    public void currentTemperature(RoomLocation request, StreamObserver<Temperature> responseObserver) {

        // 固定温度を返す
        Temperature temp = Temperature.newBuilder()
                .setValue(22.5)  // 現在の温度を返す
                .build();

        responseObserver.onNext(temp);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Temperature> averageTemperature(StreamObserver<Temperature> responseObserver) {
        return new StreamObserver<Temperature>() {
            private double sum = 0;
            private int count = 0;

            @Override
            public void onNext(Temperature temp) {
                sum += temp.getValue();  // 温度を合計に加算
                count++;  // 温度の数をカウント
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in averageTemperature: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                double average = (count == 0) ? 0 : sum / count;
                Temperature avgTemp = Temperature.newBuilder()
                        .setValue(average)
                        .build();

                responseObserver.onNext(avgTemp);  // 計算した平均温度を返す
                responseObserver.onCompleted();  // ストリーム終了
            }
        };
    }
}
