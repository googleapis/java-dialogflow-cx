// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/flow.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * The request message for [Flows.UpdateFlow][google.cloud.dialogflow.cx.v3.Flows.UpdateFlow].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.UpdateFlowRequest}
 */
public final class UpdateFlowRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.UpdateFlowRequest)
    UpdateFlowRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateFlowRequest.newBuilder() to construct.
  private UpdateFlowRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateFlowRequest() {
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateFlowRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateFlowRequest(
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
            com.google.cloud.dialogflow.cx.v3.Flow.Builder subBuilder = null;
            if (flow_ != null) {
              subBuilder = flow_.toBuilder();
            }
            flow_ = input.readMessage(com.google.cloud.dialogflow.cx.v3.Flow.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(flow_);
              flow_ = subBuilder.buildPartial();
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
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            languageCode_ = s;
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
    return com.google.cloud.dialogflow.cx.v3.FlowProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.FlowProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest.class, com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest.Builder.class);
  }

  public static final int FLOW_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.cx.v3.Flow flow_;
  /**
   * <pre>
   * Required. The flow to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the flow field is set.
   */
  @java.lang.Override
  public boolean hasFlow() {
    return flow_ != null;
  }
  /**
   * <pre>
   * Required. The flow to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The flow.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.Flow getFlow() {
    return flow_ == null ? com.google.cloud.dialogflow.cx.v3.Flow.getDefaultInstance() : flow_;
  }
  /**
   * <pre>
   * Required. The flow to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.FlowOrBuilder getFlowOrBuilder() {
    return getFlow();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
  private volatile java.lang.Object languageCode_;
  /**
   * <pre>
   * The language of the following fields in `flow`:
   * *  `Flow.event_handlers.trigger_fulfillment.messages`
   * *  `Flow.event_handlers.trigger_fulfillment.conditional_cases`
   * *  `Flow.transition_routes.trigger_fulfillment.messages`
   * *  `Flow.transition_routes.trigger_fulfillment.conditional_cases`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The languageCode.
   */
  @java.lang.Override
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The language of the following fields in `flow`:
   * *  `Flow.event_handlers.trigger_fulfillment.messages`
   * *  `Flow.event_handlers.trigger_fulfillment.conditional_cases`
   * *  `Flow.transition_routes.trigger_fulfillment.messages`
   * *  `Flow.transition_routes.trigger_fulfillment.conditional_cases`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The bytes for languageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (flow_ != null) {
      output.writeMessage(1, getFlow());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, languageCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (flow_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFlow());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, languageCode_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest other = (com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest) obj;

    if (hasFlow() != other.hasFlow()) return false;
    if (hasFlow()) {
      if (!getFlow()
          .equals(other.getFlow())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (!getLanguageCode()
        .equals(other.getLanguageCode())) return false;
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
    if (hasFlow()) {
      hash = (37 * hash) + FLOW_FIELD_NUMBER;
      hash = (53 * hash) + getFlow().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest prototype) {
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
   * The request message for [Flows.UpdateFlow][google.cloud.dialogflow.cx.v3.Flows.UpdateFlow].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.UpdateFlowRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.UpdateFlowRequest)
      com.google.cloud.dialogflow.cx.v3.UpdateFlowRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest.class, com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest.newBuilder()
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
      if (flowBuilder_ == null) {
        flow_ = null;
      } else {
        flow_ = null;
        flowBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      languageCode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest build() {
      com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest result = new com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest(this);
      if (flowBuilder_ == null) {
        result.flow_ = flow_;
      } else {
        result.flow_ = flowBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      result.languageCode_ = languageCode_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest.getDefaultInstance()) return this;
      if (other.hasFlow()) {
        mergeFlow(other.getFlow());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        onChanged();
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
      com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dialogflow.cx.v3.Flow flow_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.Flow, com.google.cloud.dialogflow.cx.v3.Flow.Builder, com.google.cloud.dialogflow.cx.v3.FlowOrBuilder> flowBuilder_;
    /**
     * <pre>
     * Required. The flow to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the flow field is set.
     */
    public boolean hasFlow() {
      return flowBuilder_ != null || flow_ != null;
    }
    /**
     * <pre>
     * Required. The flow to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The flow.
     */
    public com.google.cloud.dialogflow.cx.v3.Flow getFlow() {
      if (flowBuilder_ == null) {
        return flow_ == null ? com.google.cloud.dialogflow.cx.v3.Flow.getDefaultInstance() : flow_;
      } else {
        return flowBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The flow to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFlow(com.google.cloud.dialogflow.cx.v3.Flow value) {
      if (flowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        flow_ = value;
        onChanged();
      } else {
        flowBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The flow to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFlow(
        com.google.cloud.dialogflow.cx.v3.Flow.Builder builderForValue) {
      if (flowBuilder_ == null) {
        flow_ = builderForValue.build();
        onChanged();
      } else {
        flowBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The flow to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeFlow(com.google.cloud.dialogflow.cx.v3.Flow value) {
      if (flowBuilder_ == null) {
        if (flow_ != null) {
          flow_ =
            com.google.cloud.dialogflow.cx.v3.Flow.newBuilder(flow_).mergeFrom(value).buildPartial();
        } else {
          flow_ = value;
        }
        onChanged();
      } else {
        flowBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The flow to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearFlow() {
      if (flowBuilder_ == null) {
        flow_ = null;
        onChanged();
      } else {
        flow_ = null;
        flowBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The flow to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Flow.Builder getFlowBuilder() {
      
      onChanged();
      return getFlowFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The flow to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.cx.v3.FlowOrBuilder getFlowOrBuilder() {
      if (flowBuilder_ != null) {
        return flowBuilder_.getMessageOrBuilder();
      } else {
        return flow_ == null ?
            com.google.cloud.dialogflow.cx.v3.Flow.getDefaultInstance() : flow_;
      }
    }
    /**
     * <pre>
     * Required. The flow to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.Flow flow = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.Flow, com.google.cloud.dialogflow.cx.v3.Flow.Builder, com.google.cloud.dialogflow.cx.v3.FlowOrBuilder> 
        getFlowFieldBuilder() {
      if (flowBuilder_ == null) {
        flowBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Flow, com.google.cloud.dialogflow.cx.v3.Flow.Builder, com.google.cloud.dialogflow.cx.v3.FlowOrBuilder>(
                getFlow(),
                getParentForChildren(),
                isClean());
        flow_ = null;
      }
      return flowBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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

    private java.lang.Object languageCode_ = "";
    /**
     * <pre>
     * The language of the following fields in `flow`:
     * *  `Flow.event_handlers.trigger_fulfillment.messages`
     * *  `Flow.event_handlers.trigger_fulfillment.conditional_cases`
     * *  `Flow.transition_routes.trigger_fulfillment.messages`
     * *  `Flow.transition_routes.trigger_fulfillment.conditional_cases`
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The language of the following fields in `flow`:
     * *  `Flow.event_handlers.trigger_fulfillment.messages`
     * *  `Flow.event_handlers.trigger_fulfillment.conditional_cases`
     * *  `Flow.transition_routes.trigger_fulfillment.messages`
     * *  `Flow.transition_routes.trigger_fulfillment.conditional_cases`
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString
        getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The language of the following fields in `flow`:
     * *  `Flow.event_handlers.trigger_fulfillment.messages`
     * *  `Flow.event_handlers.trigger_fulfillment.conditional_cases`
     * *  `Flow.transition_routes.trigger_fulfillment.messages`
     * *  `Flow.transition_routes.trigger_fulfillment.conditional_cases`
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The language of the following fields in `flow`:
     * *  `Flow.event_handlers.trigger_fulfillment.messages`
     * *  `Flow.event_handlers.trigger_fulfillment.conditional_cases`
     * *  `Flow.transition_routes.trigger_fulfillment.messages`
     * *  `Flow.transition_routes.trigger_fulfillment.conditional_cases`
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {
      
      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The language of the following fields in `flow`:
     * *  `Flow.event_handlers.trigger_fulfillment.messages`
     * *  `Flow.event_handlers.trigger_fulfillment.conditional_cases`
     * *  `Flow.transition_routes.trigger_fulfillment.messages`
     * *  `Flow.transition_routes.trigger_fulfillment.conditional_cases`
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      languageCode_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.UpdateFlowRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.UpdateFlowRequest)
  private static final com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFlowRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateFlowRequest>() {
    @java.lang.Override
    public UpdateFlowRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateFlowRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateFlowRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFlowRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

