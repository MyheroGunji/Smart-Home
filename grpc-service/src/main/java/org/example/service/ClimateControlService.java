package org.example.service;

import generated.grpc.climatecontrolservice.ClimateControlServiceGrpc;
import generated.grpc.climatecontrolservice.RoomLocation;
import generated.grpc.climatecontrolservice.Temperature;
import io.grpc.stub.StreamObserver;
import org.checkerframework.checker.units.qual.A;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class ClimateControlService extends ClimateControlServiceGrpc.ClimateControlServiceImplBase {
    @Override
    // Server Streaming
    /*
    This is a service that streams the temperature of a specified room
    to a client, allowing the client to receive temperature changes in real time.
    */
    public void monitorTemperature(RoomLocation request, StreamObserver<Temperature> responseObserver) {
        String roomName = request.getRoomName();
        for (int i = 0; i < 10; i++) {
            Temperature temp = Temperature.newBuilder()
                    .setValue(20.0 + Math.random() * 5)  // Generate a random temperature ランダムな温度を生成
                    .build();

            responseObserver.onNext(temp);  // send temperature to client
            try {
                Thread.sleep(1000);  // every second send temperature. 1秒ごとに温度を送信
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        responseObserver.onCompleted();  // end of stream
    }

    //Unary RPC
    /*
    A service that receives a request
    from a client and returns the current temperature of the specified room once.
    */
    @Override
    public void currentTemperature(RoomLocation request, StreamObserver<Temperature> responseObserver) {

        // return the set temperature 固定温度を返す
        Temperature temp = Temperature.newBuilder()
                .setValue(22.5)  // Return the current temperature 現在の温度を返す
                .build();

        responseObserver.onNext(temp);
        responseObserver.onCompleted();
    }
    //Client Streaming
    /*
    This service allows clients to send multiple temperatures,
    which are received by the server, that calculates the average temperature
    and returns the result.
     */
    @Override
    public StreamObserver<Temperature> averageTemperature(StreamObserver<Temperature> responseObserver) {
        return new StreamObserver<Temperature>() {
            private double sum = 0;
            private int count = 0;

            @Override
            public void onNext(Temperature temp) {
                sum += temp.getValue();  // add temperature to the sum. 温度を合計に加算
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

                responseObserver.onNext(avgTemp);  // return the average temp
                responseObserver.onCompleted();  // end of stream
            }
        };
    }
}
