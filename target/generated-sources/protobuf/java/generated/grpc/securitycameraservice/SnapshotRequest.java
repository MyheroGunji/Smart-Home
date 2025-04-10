// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecurityCameraService.proto

// Protobuf Java Version: 3.25.6
package generated.grpc.securitycameraservice;

/**
 * Protobuf type {@code SecurityCameraService.SnapshotRequest}
 */
public final class SnapshotRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SecurityCameraService.SnapshotRequest)
    SnapshotRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SnapshotRequest.newBuilder() to construct.
  private SnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnapshotRequest() {
    cameraId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SnapshotRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.grpc.securitycameraservice.SecurityCameraServiceImpl.internal_static_SecurityCameraService_SnapshotRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.grpc.securitycameraservice.SecurityCameraServiceImpl.internal_static_SecurityCameraService_SnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.grpc.securitycameraservice.SnapshotRequest.class, generated.grpc.securitycameraservice.SnapshotRequest.Builder.class);
  }

  public static final int CAMERA_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cameraId_ = "";
  /**
   * <code>string camera_id = 1;</code>
   * @return The cameraId.
   */
  @java.lang.Override
  public java.lang.String getCameraId() {
    java.lang.Object ref = cameraId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cameraId_ = s;
      return s;
    }
  }
  /**
   * <code>string camera_id = 1;</code>
   * @return The bytes for cameraId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCameraIdBytes() {
    java.lang.Object ref = cameraId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cameraId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_ = 0;
  /**
   * <pre>
   * 何枚欲しいか
   * </pre>
   *
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cameraId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cameraId_);
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cameraId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cameraId_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.grpc.securitycameraservice.SnapshotRequest)) {
      return super.equals(obj);
    }
    generated.grpc.securitycameraservice.SnapshotRequest other = (generated.grpc.securitycameraservice.SnapshotRequest) obj;

    if (!getCameraId()
        .equals(other.getCameraId())) return false;
    if (getCount()
        != other.getCount()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CAMERA_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCameraId().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.grpc.securitycameraservice.SnapshotRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.securitycameraservice.SnapshotRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.securitycameraservice.SnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.securitycameraservice.SnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.securitycameraservice.SnapshotRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.securitycameraservice.SnapshotRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.securitycameraservice.SnapshotRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.securitycameraservice.SnapshotRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static generated.grpc.securitycameraservice.SnapshotRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static generated.grpc.securitycameraservice.SnapshotRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.securitycameraservice.SnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.securitycameraservice.SnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.grpc.securitycameraservice.SnapshotRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SecurityCameraService.SnapshotRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SecurityCameraService.SnapshotRequest)
      generated.grpc.securitycameraservice.SnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.grpc.securitycameraservice.SecurityCameraServiceImpl.internal_static_SecurityCameraService_SnapshotRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.grpc.securitycameraservice.SecurityCameraServiceImpl.internal_static_SecurityCameraService_SnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.grpc.securitycameraservice.SnapshotRequest.class, generated.grpc.securitycameraservice.SnapshotRequest.Builder.class);
    }

    // Construct using generated.grpc.securitycameraservice.SnapshotRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cameraId_ = "";
      count_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.grpc.securitycameraservice.SecurityCameraServiceImpl.internal_static_SecurityCameraService_SnapshotRequest_descriptor;
    }

    @java.lang.Override
    public generated.grpc.securitycameraservice.SnapshotRequest getDefaultInstanceForType() {
      return generated.grpc.securitycameraservice.SnapshotRequest.getDefaultInstance();
    }

    @java.lang.Override
    public generated.grpc.securitycameraservice.SnapshotRequest build() {
      generated.grpc.securitycameraservice.SnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.grpc.securitycameraservice.SnapshotRequest buildPartial() {
      generated.grpc.securitycameraservice.SnapshotRequest result = new generated.grpc.securitycameraservice.SnapshotRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(generated.grpc.securitycameraservice.SnapshotRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cameraId_ = cameraId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.count_ = count_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.grpc.securitycameraservice.SnapshotRequest) {
        return mergeFrom((generated.grpc.securitycameraservice.SnapshotRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.grpc.securitycameraservice.SnapshotRequest other) {
      if (other == generated.grpc.securitycameraservice.SnapshotRequest.getDefaultInstance()) return this;
      if (!other.getCameraId().isEmpty()) {
        cameraId_ = other.cameraId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              cameraId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              count_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object cameraId_ = "";
    /**
     * <code>string camera_id = 1;</code>
     * @return The cameraId.
     */
    public java.lang.String getCameraId() {
      java.lang.Object ref = cameraId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cameraId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string camera_id = 1;</code>
     * @return The bytes for cameraId.
     */
    public com.google.protobuf.ByteString
        getCameraIdBytes() {
      java.lang.Object ref = cameraId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cameraId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string camera_id = 1;</code>
     * @param value The cameraId to set.
     * @return This builder for chaining.
     */
    public Builder setCameraId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cameraId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string camera_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCameraId() {
      cameraId_ = getDefaultInstance().getCameraId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string camera_id = 1;</code>
     * @param value The bytes for cameraId to set.
     * @return This builder for chaining.
     */
    public Builder setCameraIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cameraId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <pre>
     * 何枚欲しいか
     * </pre>
     *
     * <code>int32 count = 2;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }
    /**
     * <pre>
     * 何枚欲しいか
     * </pre>
     *
     * <code>int32 count = 2;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {

      count_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 何枚欲しいか
     * </pre>
     *
     * <code>int32 count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      count_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SecurityCameraService.SnapshotRequest)
  }

  // @@protoc_insertion_point(class_scope:SecurityCameraService.SnapshotRequest)
  private static final generated.grpc.securitycameraservice.SnapshotRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.grpc.securitycameraservice.SnapshotRequest();
  }

  public static generated.grpc.securitycameraservice.SnapshotRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnapshotRequest>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotRequest>() {
    @java.lang.Override
    public SnapshotRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SnapshotRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.grpc.securitycameraservice.SnapshotRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

