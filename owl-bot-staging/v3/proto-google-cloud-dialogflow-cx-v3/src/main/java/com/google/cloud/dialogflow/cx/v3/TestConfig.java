// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/test_case.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * Represents configurations for a test case.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.TestConfig}
 */
public final class TestConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.TestConfig)
    TestConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TestConfig.newBuilder() to construct.
  private TestConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestConfig() {
    trackingParameters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    flow_ = "";
    page_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TestConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TestConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              trackingParameters_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            trackingParameters_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            flow_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            page_ = s;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        trackingParameters_ = trackingParameters_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_TestConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_TestConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.TestConfig.class, com.google.cloud.dialogflow.cx.v3.TestConfig.Builder.class);
  }

  public static final int TRACKING_PARAMETERS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList trackingParameters_;
  /**
   * <pre>
   * Session parameters to be compared when calculating differences.
   * </pre>
   *
   * <code>repeated string tracking_parameters = 1;</code>
   * @return A list containing the trackingParameters.
   */
  public com.google.protobuf.ProtocolStringList
      getTrackingParametersList() {
    return trackingParameters_;
  }
  /**
   * <pre>
   * Session parameters to be compared when calculating differences.
   * </pre>
   *
   * <code>repeated string tracking_parameters = 1;</code>
   * @return The count of trackingParameters.
   */
  public int getTrackingParametersCount() {
    return trackingParameters_.size();
  }
  /**
   * <pre>
   * Session parameters to be compared when calculating differences.
   * </pre>
   *
   * <code>repeated string tracking_parameters = 1;</code>
   * @param index The index of the element to return.
   * @return The trackingParameters at the given index.
   */
  public java.lang.String getTrackingParameters(int index) {
    return trackingParameters_.get(index);
  }
  /**
   * <pre>
   * Session parameters to be compared when calculating differences.
   * </pre>
   *
   * <code>repeated string tracking_parameters = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the trackingParameters at the given index.
   */
  public com.google.protobuf.ByteString
      getTrackingParametersBytes(int index) {
    return trackingParameters_.getByteString(index);
  }

  public static final int FLOW_FIELD_NUMBER = 2;
  private volatile java.lang.Object flow_;
  /**
   * <pre>
   * Flow name to start the test case with.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * Only one of `flow` and `page` should be set to indicate the starting point
   * of the test case. If both are set, `page` takes precedence over `flow`. If
   * neither is set, the test case will start with start page on the default
   * start flow.
   * </pre>
   *
   * <code>string flow = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The flow.
   */
  @java.lang.Override
  public java.lang.String getFlow() {
    java.lang.Object ref = flow_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      flow_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Flow name to start the test case with.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * Only one of `flow` and `page` should be set to indicate the starting point
   * of the test case. If both are set, `page` takes precedence over `flow`. If
   * neither is set, the test case will start with start page on the default
   * start flow.
   * </pre>
   *
   * <code>string flow = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for flow.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFlowBytes() {
    java.lang.Object ref = flow_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      flow_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object page_;
  /**
   * <pre>
   * The [page][google.cloud.dialogflow.cx.v3.Page] to start the test case with.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * Only one of `flow` and `page` should be set to indicate the starting point
   * of the test case. If both are set, `page` takes precedence over `flow`. If
   * neither is set, the test case will start with start page on the default
   * start flow.
   * </pre>
   *
   * <code>string page = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The page.
   */
  @java.lang.Override
  public java.lang.String getPage() {
    java.lang.Object ref = page_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      page_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The [page][google.cloud.dialogflow.cx.v3.Page] to start the test case with.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * Only one of `flow` and `page` should be set to indicate the starting point
   * of the test case. If both are set, `page` takes precedence over `flow`. If
   * neither is set, the test case will start with start page on the default
   * start flow.
   * </pre>
   *
   * <code>string page = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for page.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageBytes() {
    java.lang.Object ref = page_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      page_ = b;
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
    for (int i = 0; i < trackingParameters_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trackingParameters_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flow_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, flow_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(page_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, page_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < trackingParameters_.size(); i++) {
        dataSize += computeStringSizeNoTag(trackingParameters_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTrackingParametersList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flow_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, flow_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(page_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, page_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.TestConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.TestConfig other = (com.google.cloud.dialogflow.cx.v3.TestConfig) obj;

    if (!getTrackingParametersList()
        .equals(other.getTrackingParametersList())) return false;
    if (!getFlow()
        .equals(other.getFlow())) return false;
    if (!getPage()
        .equals(other.getPage())) return false;
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
    if (getTrackingParametersCount() > 0) {
      hash = (37 * hash) + TRACKING_PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getTrackingParametersList().hashCode();
    }
    hash = (37 * hash) + FLOW_FIELD_NUMBER;
    hash = (53 * hash) + getFlow().hashCode();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.TestConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.TestConfig prototype) {
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
   * Represents configurations for a test case.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.TestConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.TestConfig)
      com.google.cloud.dialogflow.cx.v3.TestConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_TestConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_TestConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.TestConfig.class, com.google.cloud.dialogflow.cx.v3.TestConfig.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.TestConfig.newBuilder()
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
      trackingParameters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      flow_ = "";

      page_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_TestConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.TestConfig getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.TestConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.TestConfig build() {
      com.google.cloud.dialogflow.cx.v3.TestConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.TestConfig buildPartial() {
      com.google.cloud.dialogflow.cx.v3.TestConfig result = new com.google.cloud.dialogflow.cx.v3.TestConfig(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        trackingParameters_ = trackingParameters_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.trackingParameters_ = trackingParameters_;
      result.flow_ = flow_;
      result.page_ = page_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.TestConfig) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.TestConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.TestConfig other) {
      if (other == com.google.cloud.dialogflow.cx.v3.TestConfig.getDefaultInstance()) return this;
      if (!other.trackingParameters_.isEmpty()) {
        if (trackingParameters_.isEmpty()) {
          trackingParameters_ = other.trackingParameters_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTrackingParametersIsMutable();
          trackingParameters_.addAll(other.trackingParameters_);
        }
        onChanged();
      }
      if (!other.getFlow().isEmpty()) {
        flow_ = other.flow_;
        onChanged();
      }
      if (!other.getPage().isEmpty()) {
        page_ = other.page_;
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
      com.google.cloud.dialogflow.cx.v3.TestConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.cx.v3.TestConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList trackingParameters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTrackingParametersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        trackingParameters_ = new com.google.protobuf.LazyStringArrayList(trackingParameters_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Session parameters to be compared when calculating differences.
     * </pre>
     *
     * <code>repeated string tracking_parameters = 1;</code>
     * @return A list containing the trackingParameters.
     */
    public com.google.protobuf.ProtocolStringList
        getTrackingParametersList() {
      return trackingParameters_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Session parameters to be compared when calculating differences.
     * </pre>
     *
     * <code>repeated string tracking_parameters = 1;</code>
     * @return The count of trackingParameters.
     */
    public int getTrackingParametersCount() {
      return trackingParameters_.size();
    }
    /**
     * <pre>
     * Session parameters to be compared when calculating differences.
     * </pre>
     *
     * <code>repeated string tracking_parameters = 1;</code>
     * @param index The index of the element to return.
     * @return The trackingParameters at the given index.
     */
    public java.lang.String getTrackingParameters(int index) {
      return trackingParameters_.get(index);
    }
    /**
     * <pre>
     * Session parameters to be compared when calculating differences.
     * </pre>
     *
     * <code>repeated string tracking_parameters = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the trackingParameters at the given index.
     */
    public com.google.protobuf.ByteString
        getTrackingParametersBytes(int index) {
      return trackingParameters_.getByteString(index);
    }
    /**
     * <pre>
     * Session parameters to be compared when calculating differences.
     * </pre>
     *
     * <code>repeated string tracking_parameters = 1;</code>
     * @param index The index to set the value at.
     * @param value The trackingParameters to set.
     * @return This builder for chaining.
     */
    public Builder setTrackingParameters(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTrackingParametersIsMutable();
      trackingParameters_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Session parameters to be compared when calculating differences.
     * </pre>
     *
     * <code>repeated string tracking_parameters = 1;</code>
     * @param value The trackingParameters to add.
     * @return This builder for chaining.
     */
    public Builder addTrackingParameters(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTrackingParametersIsMutable();
      trackingParameters_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Session parameters to be compared when calculating differences.
     * </pre>
     *
     * <code>repeated string tracking_parameters = 1;</code>
     * @param values The trackingParameters to add.
     * @return This builder for chaining.
     */
    public Builder addAllTrackingParameters(
        java.lang.Iterable<java.lang.String> values) {
      ensureTrackingParametersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, trackingParameters_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Session parameters to be compared when calculating differences.
     * </pre>
     *
     * <code>repeated string tracking_parameters = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrackingParameters() {
      trackingParameters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Session parameters to be compared when calculating differences.
     * </pre>
     *
     * <code>repeated string tracking_parameters = 1;</code>
     * @param value The bytes of the trackingParameters to add.
     * @return This builder for chaining.
     */
    public Builder addTrackingParametersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTrackingParametersIsMutable();
      trackingParameters_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object flow_ = "";
    /**
     * <pre>
     * Flow name to start the test case with.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
     * Only one of `flow` and `page` should be set to indicate the starting point
     * of the test case. If both are set, `page` takes precedence over `flow`. If
     * neither is set, the test case will start with start page on the default
     * start flow.
     * </pre>
     *
     * <code>string flow = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return The flow.
     */
    public java.lang.String getFlow() {
      java.lang.Object ref = flow_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        flow_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Flow name to start the test case with.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
     * Only one of `flow` and `page` should be set to indicate the starting point
     * of the test case. If both are set, `page` takes precedence over `flow`. If
     * neither is set, the test case will start with start page on the default
     * start flow.
     * </pre>
     *
     * <code>string flow = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for flow.
     */
    public com.google.protobuf.ByteString
        getFlowBytes() {
      java.lang.Object ref = flow_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        flow_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Flow name to start the test case with.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
     * Only one of `flow` and `page` should be set to indicate the starting point
     * of the test case. If both are set, `page` takes precedence over `flow`. If
     * neither is set, the test case will start with start page on the default
     * start flow.
     * </pre>
     *
     * <code>string flow = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The flow to set.
     * @return This builder for chaining.
     */
    public Builder setFlow(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      flow_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flow name to start the test case with.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
     * Only one of `flow` and `page` should be set to indicate the starting point
     * of the test case. If both are set, `page` takes precedence over `flow`. If
     * neither is set, the test case will start with start page on the default
     * start flow.
     * </pre>
     *
     * <code>string flow = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearFlow() {
      
      flow_ = getDefaultInstance().getFlow();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flow name to start the test case with.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
     * Only one of `flow` and `page` should be set to indicate the starting point
     * of the test case. If both are set, `page` takes precedence over `flow`. If
     * neither is set, the test case will start with start page on the default
     * start flow.
     * </pre>
     *
     * <code>string flow = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for flow to set.
     * @return This builder for chaining.
     */
    public Builder setFlowBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      flow_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object page_ = "";
    /**
     * <pre>
     * The [page][google.cloud.dialogflow.cx.v3.Page] to start the test case with.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
     * Only one of `flow` and `page` should be set to indicate the starting point
     * of the test case. If both are set, `page` takes precedence over `flow`. If
     * neither is set, the test case will start with start page on the default
     * start flow.
     * </pre>
     *
     * <code>string page = 3 [(.google.api.resource_reference) = { ... }</code>
     * @return The page.
     */
    public java.lang.String getPage() {
      java.lang.Object ref = page_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        page_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The [page][google.cloud.dialogflow.cx.v3.Page] to start the test case with.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
     * Only one of `flow` and `page` should be set to indicate the starting point
     * of the test case. If both are set, `page` takes precedence over `flow`. If
     * neither is set, the test case will start with start page on the default
     * start flow.
     * </pre>
     *
     * <code>string page = 3 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for page.
     */
    public com.google.protobuf.ByteString
        getPageBytes() {
      java.lang.Object ref = page_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        page_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The [page][google.cloud.dialogflow.cx.v3.Page] to start the test case with.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
     * Only one of `flow` and `page` should be set to indicate the starting point
     * of the test case. If both are set, `page` takes precedence over `flow`. If
     * neither is set, the test case will start with start page on the default
     * start flow.
     * </pre>
     *
     * <code>string page = 3 [(.google.api.resource_reference) = { ... }</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The [page][google.cloud.dialogflow.cx.v3.Page] to start the test case with.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
     * Only one of `flow` and `page` should be set to indicate the starting point
     * of the test case. If both are set, `page` takes precedence over `flow`. If
     * neither is set, the test case will start with start page on the default
     * start flow.
     * </pre>
     *
     * <code>string page = 3 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      
      page_ = getDefaultInstance().getPage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The [page][google.cloud.dialogflow.cx.v3.Page] to start the test case with.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
     * Only one of `flow` and `page` should be set to indicate the starting point
     * of the test case. If both are set, `page` takes precedence over `flow`. If
     * neither is set, the test case will start with start page on the default
     * start flow.
     * </pre>
     *
     * <code>string page = 3 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for page to set.
     * @return This builder for chaining.
     */
    public Builder setPageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      page_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.TestConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.TestConfig)
  private static final com.google.cloud.dialogflow.cx.v3.TestConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.TestConfig();
  }

  public static com.google.cloud.dialogflow.cx.v3.TestConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestConfig>
      PARSER = new com.google.protobuf.AbstractParser<TestConfig>() {
    @java.lang.Override
    public TestConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TestConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TestConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.TestConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

