package generated.grpc.climatecontrolservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * スマートホーム内の温度を管理するサービス
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ClimateControlServiceGrpc {

  private ClimateControlServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ClimateControlService.ClimateControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.climatecontrolservice.RoomLocation,
      generated.grpc.climatecontrolservice.Temperature> getMonitorTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorTemperature",
      requestType = generated.grpc.climatecontrolservice.RoomLocation.class,
      responseType = generated.grpc.climatecontrolservice.Temperature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.climatecontrolservice.RoomLocation,
      generated.grpc.climatecontrolservice.Temperature> getMonitorTemperatureMethod() {
    io.grpc.MethodDescriptor<generated.grpc.climatecontrolservice.RoomLocation, generated.grpc.climatecontrolservice.Temperature> getMonitorTemperatureMethod;
    if ((getMonitorTemperatureMethod = ClimateControlServiceGrpc.getMonitorTemperatureMethod) == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        if ((getMonitorTemperatureMethod = ClimateControlServiceGrpc.getMonitorTemperatureMethod) == null) {
          ClimateControlServiceGrpc.getMonitorTemperatureMethod = getMonitorTemperatureMethod =
              io.grpc.MethodDescriptor.<generated.grpc.climatecontrolservice.RoomLocation, generated.grpc.climatecontrolservice.Temperature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.climatecontrolservice.RoomLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.climatecontrolservice.Temperature.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateControlServiceMethodDescriptorSupplier("MonitorTemperature"))
              .build();
        }
      }
    }
    return getMonitorTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.climatecontrolservice.RoomLocation,
      generated.grpc.climatecontrolservice.Temperature> getCurrentTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentTemperature",
      requestType = generated.grpc.climatecontrolservice.RoomLocation.class,
      responseType = generated.grpc.climatecontrolservice.Temperature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.climatecontrolservice.RoomLocation,
      generated.grpc.climatecontrolservice.Temperature> getCurrentTemperatureMethod() {
    io.grpc.MethodDescriptor<generated.grpc.climatecontrolservice.RoomLocation, generated.grpc.climatecontrolservice.Temperature> getCurrentTemperatureMethod;
    if ((getCurrentTemperatureMethod = ClimateControlServiceGrpc.getCurrentTemperatureMethod) == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        if ((getCurrentTemperatureMethod = ClimateControlServiceGrpc.getCurrentTemperatureMethod) == null) {
          ClimateControlServiceGrpc.getCurrentTemperatureMethod = getCurrentTemperatureMethod =
              io.grpc.MethodDescriptor.<generated.grpc.climatecontrolservice.RoomLocation, generated.grpc.climatecontrolservice.Temperature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.climatecontrolservice.RoomLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.climatecontrolservice.Temperature.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateControlServiceMethodDescriptorSupplier("CurrentTemperature"))
              .build();
        }
      }
    }
    return getCurrentTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.climatecontrolservice.Temperature,
      generated.grpc.climatecontrolservice.Temperature> getAverageTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AverageTemperature",
      requestType = generated.grpc.climatecontrolservice.Temperature.class,
      responseType = generated.grpc.climatecontrolservice.Temperature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.climatecontrolservice.Temperature,
      generated.grpc.climatecontrolservice.Temperature> getAverageTemperatureMethod() {
    io.grpc.MethodDescriptor<generated.grpc.climatecontrolservice.Temperature, generated.grpc.climatecontrolservice.Temperature> getAverageTemperatureMethod;
    if ((getAverageTemperatureMethod = ClimateControlServiceGrpc.getAverageTemperatureMethod) == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        if ((getAverageTemperatureMethod = ClimateControlServiceGrpc.getAverageTemperatureMethod) == null) {
          ClimateControlServiceGrpc.getAverageTemperatureMethod = getAverageTemperatureMethod =
              io.grpc.MethodDescriptor.<generated.grpc.climatecontrolservice.Temperature, generated.grpc.climatecontrolservice.Temperature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AverageTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.climatecontrolservice.Temperature.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.climatecontrolservice.Temperature.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateControlServiceMethodDescriptorSupplier("AverageTemperature"))
              .build();
        }
      }
    }
    return getAverageTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClimateControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceStub>() {
        @java.lang.Override
        public ClimateControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimateControlServiceStub(channel, callOptions);
        }
      };
    return ClimateControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ClimateControlServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceBlockingV2Stub>() {
        @java.lang.Override
        public ClimateControlServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimateControlServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ClimateControlServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClimateControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceBlockingStub>() {
        @java.lang.Override
        public ClimateControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimateControlServiceBlockingStub(channel, callOptions);
        }
      };
    return ClimateControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClimateControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceFutureStub>() {
        @java.lang.Override
        public ClimateControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimateControlServiceFutureStub(channel, callOptions);
        }
      };
    return ClimateControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * スマートホーム内の温度を管理するサービス
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ダッシュボードに使うため、指定した部屋の温度のストリームを受け取る
     *Server Streaming RPC
     * </pre>
     */
    default void monitorTemperature(generated.grpc.climatecontrolservice.RoomLocation request,
        io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMonitorTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * 今現在の部屋の温度を取得する
     *Unary RPC
     * </pre>
     */
    default void currentTemperature(generated.grpc.climatecontrolservice.RoomLocation request,
        io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * クライアントが送った温度の一覧から、平均温度を計算する
     *Client Streaming RPC	クライアントが複数の温度を送って、サーバーが平均を計算して1回返す
     * </pre>
     */
    default io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature> averageTemperature(
        io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAverageTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClimateControlService.
   * <pre>
   * スマートホーム内の温度を管理するサービス
   * </pre>
   */
  public static abstract class ClimateControlServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClimateControlServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClimateControlService.
   * <pre>
   * スマートホーム内の温度を管理するサービス
   * </pre>
   */
  public static final class ClimateControlServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClimateControlServiceStub> {
    private ClimateControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimateControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ダッシュボードに使うため、指定した部屋の温度のストリームを受け取る
     *Server Streaming RPC
     * </pre>
     */
    public void monitorTemperature(generated.grpc.climatecontrolservice.RoomLocation request,
        io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getMonitorTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 今現在の部屋の温度を取得する
     *Unary RPC
     * </pre>
     */
    public void currentTemperature(generated.grpc.climatecontrolservice.RoomLocation request,
        io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * クライアントが送った温度の一覧から、平均温度を計算する
     *Client Streaming RPC	クライアントが複数の温度を送って、サーバーが平均を計算して1回返す
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature> averageTemperature(
        io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAverageTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClimateControlService.
   * <pre>
   * スマートホーム内の温度を管理するサービス
   * </pre>
   */
  public static final class ClimateControlServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ClimateControlServiceBlockingV2Stub> {
    private ClimateControlServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateControlServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimateControlServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * ダッシュボードに使うため、指定した部屋の温度のストリームを受け取る
     *Server Streaming RPC
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, generated.grpc.climatecontrolservice.Temperature>
        monitorTemperature(generated.grpc.climatecontrolservice.RoomLocation request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getMonitorTemperatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 今現在の部屋の温度を取得する
     *Unary RPC
     * </pre>
     */
    public generated.grpc.climatecontrolservice.Temperature currentTemperature(generated.grpc.climatecontrolservice.RoomLocation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentTemperatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * クライアントが送った温度の一覧から、平均温度を計算する
     *Client Streaming RPC	クライアントが複数の温度を送って、サーバーが平均を計算して1回返す
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<generated.grpc.climatecontrolservice.Temperature, generated.grpc.climatecontrolservice.Temperature>
        averageTemperature() {
      return io.grpc.stub.ClientCalls.blockingClientStreamingCall(
          getChannel(), getAverageTemperatureMethod(), getCallOptions());
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ClimateControlService.
   * <pre>
   * スマートホーム内の温度を管理するサービス
   * </pre>
   */
  public static final class ClimateControlServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClimateControlServiceBlockingStub> {
    private ClimateControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimateControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ダッシュボードに使うため、指定した部屋の温度のストリームを受け取る
     *Server Streaming RPC
     * </pre>
     */
    public java.util.Iterator<generated.grpc.climatecontrolservice.Temperature> monitorTemperature(
        generated.grpc.climatecontrolservice.RoomLocation request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getMonitorTemperatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 今現在の部屋の温度を取得する
     *Unary RPC
     * </pre>
     */
    public generated.grpc.climatecontrolservice.Temperature currentTemperature(generated.grpc.climatecontrolservice.RoomLocation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClimateControlService.
   * <pre>
   * スマートホーム内の温度を管理するサービス
   * </pre>
   */
  public static final class ClimateControlServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClimateControlServiceFutureStub> {
    private ClimateControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimateControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 今現在の部屋の温度を取得する
     *Unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.climatecontrolservice.Temperature> currentTemperature(
        generated.grpc.climatecontrolservice.RoomLocation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MONITOR_TEMPERATURE = 0;
  private static final int METHODID_CURRENT_TEMPERATURE = 1;
  private static final int METHODID_AVERAGE_TEMPERATURE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_TEMPERATURE:
          serviceImpl.monitorTemperature((generated.grpc.climatecontrolservice.RoomLocation) request,
              (io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature>) responseObserver);
          break;
        case METHODID_CURRENT_TEMPERATURE:
          serviceImpl.currentTemperature((generated.grpc.climatecontrolservice.RoomLocation) request,
              (io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVERAGE_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.averageTemperature(
              (io.grpc.stub.StreamObserver<generated.grpc.climatecontrolservice.Temperature>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMonitorTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              generated.grpc.climatecontrolservice.RoomLocation,
              generated.grpc.climatecontrolservice.Temperature>(
                service, METHODID_MONITOR_TEMPERATURE)))
        .addMethod(
          getCurrentTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generated.grpc.climatecontrolservice.RoomLocation,
              generated.grpc.climatecontrolservice.Temperature>(
                service, METHODID_CURRENT_TEMPERATURE)))
        .addMethod(
          getAverageTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              generated.grpc.climatecontrolservice.Temperature,
              generated.grpc.climatecontrolservice.Temperature>(
                service, METHODID_AVERAGE_TEMPERATURE)))
        .build();
  }

  private static abstract class ClimateControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClimateControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.climatecontrolservice.ClimateControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClimateControlService");
    }
  }

  private static final class ClimateControlServiceFileDescriptorSupplier
      extends ClimateControlServiceBaseDescriptorSupplier {
    ClimateControlServiceFileDescriptorSupplier() {}
  }

  private static final class ClimateControlServiceMethodDescriptorSupplier
      extends ClimateControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClimateControlServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClimateControlServiceFileDescriptorSupplier())
              .addMethod(getMonitorTemperatureMethod())
              .addMethod(getCurrentTemperatureMethod())
              .addMethod(getAverageTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
