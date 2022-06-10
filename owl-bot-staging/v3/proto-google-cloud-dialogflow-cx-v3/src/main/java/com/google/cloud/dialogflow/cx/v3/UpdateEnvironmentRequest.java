// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/environment.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * The request message for [Environments.UpdateEnvironment][google.cloud.dialogflow.cx.v3.Environments.UpdateEnvironment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest}
 */
public final class UpdateEnvironmentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest)
    UpdateEnvironmentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateEnvironmentRequest.newBuilder() to construct.
  private UpdateEnvironmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateEnvironmentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateEnvironmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateEnvironmentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.cloud.dialogflow.cx.v3.Environment.Builder subBuilder = null;
            if (environment_ != null) {
              subBuilder = environment_.toBuilder();
            }
            environment_ = input.readMessage(com.google.cloud.dialogflow.cx.v3.Environment.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(environment_);
              environment_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateEnvironmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateEnvironmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest.class, com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest.Builder.class);
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.cx.v3.Environment environment_;
  /**
   * <pre>
   * Required. The environment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the environment field is set.
   */
  @java.lang.Override
  public boolean hasEnvironment() {
    return environment_ != null;
  }
  /**
   * <pre>
   * Required. The environment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The environment.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.Environment getEnvironment() {
    return environment_ == null ? com.google.cloud.dialogflow.cx.v3.Environment.getDefaultInstance() : environment_;
  }
  /**
   * <pre>
   * Required. The environment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.EnvironmentOrBuilder getEnvironmentOrBuilder() {
    return getEnvironment();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (environment_ != null) {
      output.writeMessage(1, getEnvironment());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (environment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnvironment());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest other = (com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest) obj;

    if (hasEnvironment() != other.hasEnvironment()) return false;
    if (hasEnvironment()) {
      if (!getEnvironment()
          .equals(other.getEnvironment())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEnvironment()) {
      hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironment().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest prototype) {
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
   * <pre>
   * The request message for [Environments.UpdateEnvironment][google.cloud.dialogflow.cx.v3.Environments.UpdateEnvironment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest)
      com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateEnvironmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateEnvironmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest.class, com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (environmentBuilder_ == null) {
        environment_ = null;
      } else {
        environment_ = null;
        environmentBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateEnvironmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest build() {
      com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest result = new com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest(this);
      if (environmentBuilder_ == null) {
        result.environment_ = environment_;
      } else {
        result.environment_ = environmentBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest.getDefaultInstance()) return this;
      if (other.hasEnvironment()) {
        mergeEnvironment(other.getEnvironment());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dialogflow.cx.v3.Environment environment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.Environment, com.google.cloud.dialogflow.cx.v3.Environment.Builder, com.google.cloud.dialogflow.cx.v3.EnvironmentOrBuilder> environmentBuilder_;
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the environment field is set.
     */
    public boolean hasEnvironment() {
      return environmentBuilder_ != null || environment_ != null;
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The environment.
     */
    public com.google.cloud.dialogflow.cx.v3.Environment getEnvironment() {
      if (environmentBuilder_ == null) {
        return environment_ == null ? com.google.cloud.dialogflow.cx.v3.Environment.getDefaultInstance() : environment_;
      } else {
        return environmentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEnvironment(com.google.cloud.dialogflow.cx.v3.Environment value) {
      if (environmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        environment_ = value;
        onChanged();
      } else {
        environmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEnvironment(
        com.google.cloud.dialogflow.cx.v3.Environment.Builder builderForValue) {
      if (environmentBuilder_ == null) {
        environment_ = builderForValue.build();
        onChanged();
      } else {
        environmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeEnvironment(com.google.cloud.dialogflow.cx.v3.Environment value) {
      if (environmentBuilder_ == null) {
        if (environment_ != null) {
          environment_ =
            com.google.cloud.dialogflow.cx.v3.Environment.newBuilder(environment_).mergeFrom(value).buildPartial();
        } else {
          environment_ = value;
        }
        onChanged();
      } else {
        environmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearEnvironment() {
      if (environmentBuilder_ == null) {
        environment_ = null;
        onChanged();
      } else {
        environment_ = null;
        environmentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Environment.Builder getEnvironmentBuilder() {
      
      onChanged();
      return getEnvironmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.cx.v3.EnvironmentOrBuilder getEnvironmentOrBuilder() {
      if (environmentBuilder_ != null) {
        return environmentBuilder_.getMessageOrBuilder();
      } else {
        return environment_ == null ?
            com.google.cloud.dialogflow.cx.v3.Environment.getDefaultInstance() : environment_;
      }
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.Environment, com.google.cloud.dialogflow.cx.v3.Environment.Builder, com.google.cloud.dialogflow.cx.v3.EnvironmentOrBuilder> 
        getEnvironmentFieldBuilder() {
      if (environmentBuilder_ == null) {
        environmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Environment, com.google.cloud.dialogflow.cx.v3.Environment.Builder, com.google.cloud.dialogflow.cx.v3.EnvironmentOrBuilder>(
                getEnvironment(),
                getParentForChildren(),
                isClean());
        environment_ = null;
      }
      return environmentBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest)
  private static final com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEnvironmentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateEnvironmentRequest>() {
    @java.lang.Override
    public UpdateEnvironmentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateEnvironmentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateEnvironmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEnvironmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.UpdateEnvironmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

