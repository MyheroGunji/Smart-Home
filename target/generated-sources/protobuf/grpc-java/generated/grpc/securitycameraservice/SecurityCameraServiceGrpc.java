package generated.grpc.securitycameraservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SecurityCameraServiceGrpc {

  private SecurityCameraServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SecurityCameraService.SecurityCameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.CameraControl,
      generated.grpc.securitycameraservice.CameraFeed> getStreamLiveCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamLiveCamera",
      requestType = generated.grpc.securitycameraservice.CameraControl.class,
      responseType = generated.grpc.securitycameraservice.CameraFeed.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.CameraControl,
      generated.grpc.securitycameraservice.CameraFeed> getStreamLiveCameraMethod() {
    io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.CameraControl, generated.grpc.securitycameraservice.CameraFeed> getStreamLiveCameraMethod;
    if ((getStreamLiveCameraMethod = SecurityCameraServiceGrpc.getStreamLiveCameraMethod) == null) {
      synchronized (SecurityCameraServiceGrpc.class) {
        if ((getStreamLiveCameraMethod = SecurityCameraServiceGrpc.getStreamLiveCameraMethod) == null) {
          SecurityCameraServiceGrpc.getStreamLiveCameraMethod = getStreamLiveCameraMethod =
              io.grpc.MethodDescriptor.<generated.grpc.securitycameraservice.CameraControl, generated.grpc.securitycameraservice.CameraFeed>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamLiveCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.securitycameraservice.CameraControl.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.securitycameraservice.CameraFeed.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityCameraServiceMethodDescriptorSupplier("StreamLiveCamera"))
              .build();
        }
      }
    }
    return getStreamLiveCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.MotionEvent,
      generated.grpc.securitycameraservice.MotionAck> getSendMotionAlertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMotionAlert",
      requestType = generated.grpc.securitycameraservice.MotionEvent.class,
      responseType = generated.grpc.securitycameraservice.MotionAck.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.MotionEvent,
      generated.grpc.securitycameraservice.MotionAck> getSendMotionAlertMethod() {
    io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.MotionEvent, generated.grpc.securitycameraservice.MotionAck> getSendMotionAlertMethod;
    if ((getSendMotionAlertMethod = SecurityCameraServiceGrpc.getSendMotionAlertMethod) == null) {
      synchronized (SecurityCameraServiceGrpc.class) {
        if ((getSendMotionAlertMethod = SecurityCameraServiceGrpc.getSendMotionAlertMethod) == null) {
          SecurityCameraServiceGrpc.getSendMotionAlertMethod = getSendMotionAlertMethod =
              io.grpc.MethodDescriptor.<generated.grpc.securitycameraservice.MotionEvent, generated.grpc.securitycameraservice.MotionAck>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMotionAlert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.securitycameraservice.MotionEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.securitycameraservice.MotionAck.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityCameraServiceMethodDescriptorSupplier("SendMotionAlert"))
              .build();
        }
      }
    }
    return getSendMotionAlertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.SnapshotRequest,
      generated.grpc.securitycameraservice.SnapshotImage> getReceiveCameraSnapshotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReceiveCameraSnapshots",
      requestType = generated.grpc.securitycameraservice.SnapshotRequest.class,
      responseType = generated.grpc.securitycameraservice.SnapshotImage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.SnapshotRequest,
      generated.grpc.securitycameraservice.SnapshotImage> getReceiveCameraSnapshotsMethod() {
    io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.SnapshotRequest, generated.grpc.securitycameraservice.SnapshotImage> getReceiveCameraSnapshotsMethod;
    if ((getReceiveCameraSnapshotsMethod = SecurityCameraServiceGrpc.getReceiveCameraSnapshotsMethod) == null) {
      synchronized (SecurityCameraServiceGrpc.class) {
        if ((getReceiveCameraSnapshotsMethod = SecurityCameraServiceGrpc.getReceiveCameraSnapshotsMethod) == null) {
          SecurityCameraServiceGrpc.getReceiveCameraSnapshotsMethod = getReceiveCameraSnapshotsMethod =
              io.grpc.MethodDescriptor.<generated.grpc.securitycameraservice.SnapshotRequest, generated.grpc.securitycameraservice.SnapshotImage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReceiveCameraSnapshots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.securitycameraservice.SnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.securitycameraservice.SnapshotImage.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityCameraServiceMethodDescriptorSupplier("ReceiveCameraSnapshots"))
              .build();
        }
      }
    }
    return getReceiveCameraSnapshotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.CameraLogEntry,
      generated.grpc.securitycameraservice.UploadResult> getUploadCameraLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadCameraLog",
      requestType = generated.grpc.securitycameraservice.CameraLogEntry.class,
      responseType = generated.grpc.securitycameraservice.UploadResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.CameraLogEntry,
      generated.grpc.securitycameraservice.UploadResult> getUploadCameraLogMethod() {
    io.grpc.MethodDescriptor<generated.grpc.securitycameraservice.CameraLogEntry, generated.grpc.securitycameraservice.UploadResult> getUploadCameraLogMethod;
    if ((getUploadCameraLogMethod = SecurityCameraServiceGrpc.getUploadCameraLogMethod) == null) {
      synchronized (SecurityCameraServiceGrpc.class) {
        if ((getUploadCameraLogMethod = SecurityCameraServiceGrpc.getUploadCameraLogMethod) == null) {
          SecurityCameraServiceGrpc.getUploadCameraLogMethod = getUploadCameraLogMethod =
              io.grpc.MethodDescriptor.<generated.grpc.securitycameraservice.CameraLogEntry, generated.grpc.securitycameraservice.UploadResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadCameraLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.securitycameraservice.CameraLogEntry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.securitycameraservice.UploadResult.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityCameraServiceMethodDescriptorSupplier("UploadCameraLog"))
              .build();
        }
      }
    }
    return getUploadCameraLogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityCameraServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityCameraServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityCameraServiceStub>() {
        @java.lang.Override
        public SecurityCameraServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityCameraServiceStub(channel, callOptions);
        }
      };
    return SecurityCameraServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SecurityCameraServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityCameraServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityCameraServiceBlockingV2Stub>() {
        @java.lang.Override
        public SecurityCameraServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityCameraServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return SecurityCameraServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityCameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityCameraServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityCameraServiceBlockingStub>() {
        @java.lang.Override
        public SecurityCameraServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityCameraServiceBlockingStub(channel, callOptions);
        }
      };
    return SecurityCameraServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityCameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityCameraServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityCameraServiceFutureStub>() {
        @java.lang.Override
        public SecurityCameraServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityCameraServiceFutureStub(channel, callOptions);
        }
      };
    return SecurityCameraServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 映像送受信＋リアルタイム操作（ズーム、パンなど）
     * Bidirectional streaming
     * </pre>
     */
    default io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.CameraControl> streamLiveCamera(
        io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.CameraFeed> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamLiveCameraMethod(), responseObserver);
    }

    /**
     * <pre>
     * モーション検知 → 単発通知
     * unary
     * </pre>
     */
    default void sendMotionAlert(generated.grpc.securitycameraservice.MotionEvent request,
        io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.MotionAck> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMotionAlertMethod(), responseObserver);
    }

    /**
     * <pre>
     * 静止画通知（サーバーが何枚か送る）
     *Server streaming
     * </pre>
     */
    default void receiveCameraSnapshots(generated.grpc.securitycameraservice.SnapshotRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.SnapshotImage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveCameraSnapshotsMethod(), responseObserver);
    }

    /**
     * <pre>
     * クライアント側で過去のログをまとめて送信
     * Client Streaming
     * </pre>
     */
    default io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.CameraLogEntry> uploadCameraLog(
        io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.UploadResult> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadCameraLogMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SecurityCameraService.
   */
  public static abstract class SecurityCameraServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SecurityCameraServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SecurityCameraService.
   */
  public static final class SecurityCameraServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SecurityCameraServiceStub> {
    private SecurityCameraServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityCameraServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityCameraServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 映像送受信＋リアルタイム操作（ズーム、パンなど）
     * Bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.CameraControl> streamLiveCamera(
        io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.CameraFeed> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamLiveCameraMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * モーション検知 → 単発通知
     * unary
     * </pre>
     */
    public void sendMotionAlert(generated.grpc.securitycameraservice.MotionEvent request,
        io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.MotionAck> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMotionAlertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 静止画通知（サーバーが何枚か送る）
     *Server streaming
     * </pre>
     */
    public void receiveCameraSnapshots(generated.grpc.securitycameraservice.SnapshotRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.SnapshotImage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReceiveCameraSnapshotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * クライアント側で過去のログをまとめて送信
     * Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.CameraLogEntry> uploadCameraLog(
        io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.UploadResult> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadCameraLogMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SecurityCameraService.
   */
  public static final class SecurityCameraServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SecurityCameraServiceBlockingV2Stub> {
    private SecurityCameraServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityCameraServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityCameraServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 映像送受信＋リアルタイム操作（ズーム、パンなど）
     * Bidirectional streaming
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<generated.grpc.securitycameraservice.CameraControl, generated.grpc.securitycameraservice.CameraFeed>
        streamLiveCamera() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getStreamLiveCameraMethod(), getCallOptions());
    }

    /**
     * <pre>
     * モーション検知 → 単発通知
     * unary
     * </pre>
     */
    public generated.grpc.securitycameraservice.MotionAck sendMotionAlert(generated.grpc.securitycameraservice.MotionEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMotionAlertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 静止画通知（サーバーが何枚か送る）
     *Server streaming
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, generated.grpc.securitycameraservice.SnapshotImage>
        receiveCameraSnapshots(generated.grpc.securitycameraservice.SnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getReceiveCameraSnapshotsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * クライアント側で過去のログをまとめて送信
     * Client Streaming
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<generated.grpc.securitycameraservice.CameraLogEntry, generated.grpc.securitycameraservice.UploadResult>
        uploadCameraLog() {
      return io.grpc.stub.ClientCalls.blockingClientStreamingCall(
          getChannel(), getUploadCameraLogMethod(), getCallOptions());
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service SecurityCameraService.
   */
  public static final class SecurityCameraServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SecurityCameraServiceBlockingStub> {
    private SecurityCameraServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityCameraServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityCameraServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * モーション検知 → 単発通知
     * unary
     * </pre>
     */
    public generated.grpc.securitycameraservice.MotionAck sendMotionAlert(generated.grpc.securitycameraservice.MotionEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMotionAlertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 静止画通知（サーバーが何枚か送る）
     *Server streaming
     * </pre>
     */
    public java.util.Iterator<generated.grpc.securitycameraservice.SnapshotImage> receiveCameraSnapshots(
        generated.grpc.securitycameraservice.SnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReceiveCameraSnapshotsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SecurityCameraService.
   */
  public static final class SecurityCameraServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SecurityCameraServiceFutureStub> {
    private SecurityCameraServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityCameraServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityCameraServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * モーション検知 → 単発通知
     * unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.securitycameraservice.MotionAck> sendMotionAlert(
        generated.grpc.securitycameraservice.MotionEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMotionAlertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MOTION_ALERT = 0;
  private static final int METHODID_RECEIVE_CAMERA_SNAPSHOTS = 1;
  private static final int METHODID_STREAM_LIVE_CAMERA = 2;
  private static final int METHODID_UPLOAD_CAMERA_LOG = 3;

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
        case METHODID_SEND_MOTION_ALERT:
          serviceImpl.sendMotionAlert((generated.grpc.securitycameraservice.MotionEvent) request,
              (io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.MotionAck>) responseObserver);
          break;
        case METHODID_RECEIVE_CAMERA_SNAPSHOTS:
          serviceImpl.receiveCameraSnapshots((generated.grpc.securitycameraservice.SnapshotRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.SnapshotImage>) responseObserver);
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
        case METHODID_STREAM_LIVE_CAMERA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamLiveCamera(
              (io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.CameraFeed>) responseObserver);
        case METHODID_UPLOAD_CAMERA_LOG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadCameraLog(
              (io.grpc.stub.StreamObserver<generated.grpc.securitycameraservice.UploadResult>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStreamLiveCameraMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              generated.grpc.securitycameraservice.CameraControl,
              generated.grpc.securitycameraservice.CameraFeed>(
                service, METHODID_STREAM_LIVE_CAMERA)))
        .addMethod(
          getSendMotionAlertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generated.grpc.securitycameraservice.MotionEvent,
              generated.grpc.securitycameraservice.MotionAck>(
                service, METHODID_SEND_MOTION_ALERT)))
        .addMethod(
          getReceiveCameraSnapshotsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              generated.grpc.securitycameraservice.SnapshotRequest,
              generated.grpc.securitycameraservice.SnapshotImage>(
                service, METHODID_RECEIVE_CAMERA_SNAPSHOTS)))
        .addMethod(
          getUploadCameraLogMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              generated.grpc.securitycameraservice.CameraLogEntry,
              generated.grpc.securitycameraservice.UploadResult>(
                service, METHODID_UPLOAD_CAMERA_LOG)))
        .build();
  }

  private static abstract class SecurityCameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecurityCameraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.securitycameraservice.SecurityCameraServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecurityCameraService");
    }
  }

  private static final class SecurityCameraServiceFileDescriptorSupplier
      extends SecurityCameraServiceBaseDescriptorSupplier {
    SecurityCameraServiceFileDescriptorSupplier() {}
  }

  private static final class SecurityCameraServiceMethodDescriptorSupplier
      extends SecurityCameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SecurityCameraServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SecurityCameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityCameraServiceFileDescriptorSupplier())
              .addMethod(getStreamLiveCameraMethod())
              .addMethod(getSendMotionAlertMethod())
              .addMethod(getReceiveCameraSnapshotsMethod())
              .addMethod(getUploadCameraLogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
