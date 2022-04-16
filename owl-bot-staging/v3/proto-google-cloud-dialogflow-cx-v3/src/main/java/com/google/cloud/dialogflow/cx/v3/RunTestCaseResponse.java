// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/test_case.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * The response message for [TestCases.RunTestCase][google.cloud.dialogflow.cx.v3.TestCases.RunTestCase].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.RunTestCaseResponse}
 */
public final class RunTestCaseResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.RunTestCaseResponse)
    RunTestCaseResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RunTestCaseResponse.newBuilder() to construct.
  private RunTestCaseResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RunTestCaseResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RunTestCaseResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RunTestCaseResponse(
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
          case 18: {
            com.google.cloud.dialogflow.cx.v3.TestCaseResult.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(com.google.cloud.dialogflow.cx.v3.TestCaseResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
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
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_RunTestCaseResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_RunTestCaseResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse.class, com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.cx.v3.TestCaseResult result_;
  /**
   * <pre>
   * The result.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <pre>
   * The result.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
   * @return The result.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.TestCaseResult getResult() {
    return result_ == null ? com.google.cloud.dialogflow.cx.v3.TestCaseResult.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * The result.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.TestCaseResultOrBuilder getResultOrBuilder() {
    return getResult();
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
    if (result_ != null) {
      output.writeMessage(2, getResult());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResult());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse other = (com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse prototype) {
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
   * The response message for [TestCases.RunTestCase][google.cloud.dialogflow.cx.v3.TestCases.RunTestCase].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.RunTestCaseResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.RunTestCaseResponse)
      com.google.cloud.dialogflow.cx.v3.RunTestCaseResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_RunTestCaseResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_RunTestCaseResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse.class, com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse.newBuilder()
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
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_RunTestCaseResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse build() {
      com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse result = new com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse(this);
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
      com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dialogflow.cx.v3.TestCaseResult result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.TestCaseResult, com.google.cloud.dialogflow.cx.v3.TestCaseResult.Builder, com.google.cloud.dialogflow.cx.v3.TestCaseResultOrBuilder> resultBuilder_;
    /**
     * <pre>
     * The result.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <pre>
     * The result.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
     * @return The result.
     */
    public com.google.cloud.dialogflow.cx.v3.TestCaseResult getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.google.cloud.dialogflow.cx.v3.TestCaseResult.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The result.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
     */
    public Builder setResult(com.google.cloud.dialogflow.cx.v3.TestCaseResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The result.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
     */
    public Builder setResult(
        com.google.cloud.dialogflow.cx.v3.TestCaseResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The result.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
     */
    public Builder mergeResult(com.google.cloud.dialogflow.cx.v3.TestCaseResult value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            com.google.cloud.dialogflow.cx.v3.TestCaseResult.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The result.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The result.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestCaseResult.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The result.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestCaseResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.google.cloud.dialogflow.cx.v3.TestCaseResult.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * The result.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCaseResult result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.TestCaseResult, com.google.cloud.dialogflow.cx.v3.TestCaseResult.Builder, com.google.cloud.dialogflow.cx.v3.TestCaseResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.TestCaseResult, com.google.cloud.dialogflow.cx.v3.TestCaseResult.Builder, com.google.cloud.dialogflow.cx.v3.TestCaseResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.RunTestCaseResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.RunTestCaseResponse)
  private static final com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunTestCaseResponse>
      PARSER = new com.google.protobuf.AbstractParser<RunTestCaseResponse>() {
    @java.lang.Override
    public RunTestCaseResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RunTestCaseResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RunTestCaseResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunTestCaseResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.RunTestCaseResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

