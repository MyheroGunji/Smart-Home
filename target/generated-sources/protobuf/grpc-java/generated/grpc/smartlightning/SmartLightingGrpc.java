package generated.grpc.smartlightning;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * スマートライティングサービス
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartLightingGrpc {

  private SmartLightingGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartLighting.SmartLighting";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.smartlightning.LightRequest,
      generated.grpc.smartlightning.LightResponse> getTurnOnLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOnLight",
      requestType = generated.grpc.smartlightning.LightRequest.class,
      responseType = generated.grpc.smartlightning.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.smartlightning.LightRequest,
      generated.grpc.smartlightning.LightResponse> getTurnOnLightMethod() {
    io.grpc.MethodDescriptor<generated.grpc.smartlightning.LightRequest, generated.grpc.smartlightning.LightResponse> getTurnOnLightMethod;
    if ((getTurnOnLightMethod = SmartLightingGrpc.getTurnOnLightMethod) == null) {
      synchronized (SmartLightingGrpc.class) {
        if ((getTurnOnLightMethod = SmartLightingGrpc.getTurnOnLightMethod) == null) {
          SmartLightingGrpc.getTurnOnLightMethod = getTurnOnLightMethod =
              io.grpc.MethodDescriptor.<generated.grpc.smartlightning.LightRequest, generated.grpc.smartlightning.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOnLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smartlightning.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smartlightning.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightingMethodDescriptorSupplier("TurnOnLight"))
              .build();
        }
      }
    }
    return getTurnOnLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.smartlightning.LightRequest,
      generated.grpc.smartlightning.LightResponse> getTurnOffLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOffLight",
      requestType = generated.grpc.smartlightning.LightRequest.class,
      responseType = generated.grpc.smartlightning.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.smartlightning.LightRequest,
      generated.grpc.smartlightning.LightResponse> getTurnOffLightMethod() {
    io.grpc.MethodDescriptor<generated.grpc.smartlightning.LightRequest, generated.grpc.smartlightning.LightResponse> getTurnOffLightMethod;
    if ((getTurnOffLightMethod = SmartLightingGrpc.getTurnOffLightMethod) == null) {
      synchronized (SmartLightingGrpc.class) {
        if ((getTurnOffLightMethod = SmartLightingGrpc.getTurnOffLightMethod) == null) {
          SmartLightingGrpc.getTurnOffLightMethod = getTurnOffLightMethod =
              io.grpc.MethodDescriptor.<generated.grpc.smartlightning.LightRequest, generated.grpc.smartlightning.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOffLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smartlightning.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smartlightning.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightingMethodDescriptorSupplier("TurnOffLight"))
              .build();
        }
      }
    }
    return getTurnOffLightMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartLightingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightingStub>() {
        @java.lang.Override
        public SmartLightingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightingStub(channel, callOptions);
        }
      };
    return SmartLightingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SmartLightingBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightingBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightingBlockingV2Stub>() {
        @java.lang.Override
        public SmartLightingBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightingBlockingV2Stub(channel, callOptions);
        }
      };
    return SmartLightingBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartLightingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightingBlockingStub>() {
        @java.lang.Override
        public SmartLightingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightingBlockingStub(channel, callOptions);
        }
      };
    return SmartLightingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartLightingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightingFutureStub>() {
        @java.lang.Override
        public SmartLightingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightingFutureStub(channel, callOptions);
        }
      };
    return SmartLightingFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * スマートライティングサービス
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void turnOnLight(generated.grpc.smartlightning.LightRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.smartlightning.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOnLightMethod(), responseObserver);
    }

    /**
     */
    default void turnOffLight(generated.grpc.smartlightning.LightRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.smartlightning.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOffLightMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartLighting.
   * <pre>
   * スマートライティングサービス
   * </pre>
   */
  public static abstract class SmartLightingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartLightingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartLighting.
   * <pre>
   * スマートライティングサービス
   * </pre>
   */
  public static final class SmartLightingStub
      extends io.grpc.stub.AbstractAsyncStub<SmartLightingStub> {
    private SmartLightingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightingStub(channel, callOptions);
    }

    /**
     */
    public void turnOnLight(generated.grpc.smartlightning.LightRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.smartlightning.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOnLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOffLight(generated.grpc.smartlightning.LightRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.smartlightning.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOffLightMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartLighting.
   * <pre>
   * スマートライティングサービス
   * </pre>
   */
  public static final class SmartLightingBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SmartLightingBlockingV2Stub> {
    private SmartLightingBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightingBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightingBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public generated.grpc.smartlightning.LightResponse turnOnLight(generated.grpc.smartlightning.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOnLightMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.grpc.smartlightning.LightResponse turnOffLight(generated.grpc.smartlightning.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOffLightMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service SmartLighting.
   * <pre>
   * スマートライティングサービス
   * </pre>
   */
  public static final class SmartLightingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartLightingBlockingStub> {
    private SmartLightingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightingBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.grpc.smartlightning.LightResponse turnOnLight(generated.grpc.smartlightning.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOnLightMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.grpc.smartlightning.LightResponse turnOffLight(generated.grpc.smartlightning.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOffLightMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartLighting.
   * <pre>
   * スマートライティングサービス
   * </pre>
   */
  public static final class SmartLightingFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartLightingFutureStub> {
    private SmartLightingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.smartlightning.LightResponse> turnOnLight(
        generated.grpc.smartlightning.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOnLightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.smartlightning.LightResponse> turnOffLight(
        generated.grpc.smartlightning.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOffLightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_LIGHT = 0;
  private static final int METHODID_TURN_OFF_LIGHT = 1;

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
        case METHODID_TURN_ON_LIGHT:
          serviceImpl.turnOnLight((generated.grpc.smartlightning.LightRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.smartlightning.LightResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF_LIGHT:
          serviceImpl.turnOffLight((generated.grpc.smartlightning.LightRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.smartlightning.LightResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTurnOnLightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generated.grpc.smartlightning.LightRequest,
              generated.grpc.smartlightning.LightResponse>(
                service, METHODID_TURN_ON_LIGHT)))
        .addMethod(
          getTurnOffLightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generated.grpc.smartlightning.LightRequest,
              generated.grpc.smartlightning.LightResponse>(
                service, METHODID_TURN_OFF_LIGHT)))
        .build();
  }

  private static abstract class SmartLightingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartLightingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.smartlightning.SmartLightingImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartLighting");
    }
  }

  private static final class SmartLightingFileDescriptorSupplier
      extends SmartLightingBaseDescriptorSupplier {
    SmartLightingFileDescriptorSupplier() {}
  }

  private static final class SmartLightingMethodDescriptorSupplier
      extends SmartLightingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmartLightingMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SmartLightingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartLightingFileDescriptorSupplier())
              .addMethod(getTurnOnLightMethod())
              .addMethod(getTurnOffLightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
