// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/test_case.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * The request message for [TestCases.UpdateTestCase][google.cloud.dialogflow.cx.v3.TestCases.UpdateTestCase].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest}
 */
public final class UpdateTestCaseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest)
    UpdateTestCaseRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateTestCaseRequest.newBuilder() to construct.
  private UpdateTestCaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateTestCaseRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateTestCaseRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateTestCaseRequest(
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
            com.google.cloud.dialogflow.cx.v3.TestCase.Builder subBuilder = null;
            if (testCase_ != null) {
              subBuilder = testCase_.toBuilder();
            }
            testCase_ = input.readMessage(com.google.cloud.dialogflow.cx.v3.TestCase.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(testCase_);
              testCase_ = subBuilder.buildPartial();
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
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateTestCaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateTestCaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest.class, com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest.Builder.class);
  }

  public static final int TEST_CASE_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.cx.v3.TestCase testCase_;
  /**
   * <pre>
   * Required. The test case to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the testCase field is set.
   */
  @java.lang.Override
  public boolean hasTestCase() {
    return testCase_ != null;
  }
  /**
   * <pre>
   * Required. The test case to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The testCase.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.TestCase getTestCase() {
    return testCase_ == null ? com.google.cloud.dialogflow.cx.v3.TestCase.getDefaultInstance() : testCase_;
  }
  /**
   * <pre>
   * Required. The test case to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder getTestCaseOrBuilder() {
    return getTestCase();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The mask to specify which fields should be updated. The
   * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
   * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
   * Required. The mask to specify which fields should be updated. The
   * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
   * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
   * Required. The mask to specify which fields should be updated. The
   * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
   * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
    if (testCase_ != null) {
      output.writeMessage(1, getTestCase());
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
    if (testCase_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTestCase());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest other = (com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest) obj;

    if (hasTestCase() != other.hasTestCase()) return false;
    if (hasTestCase()) {
      if (!getTestCase()
          .equals(other.getTestCase())) return false;
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
    if (hasTestCase()) {
      hash = (37 * hash) + TEST_CASE_FIELD_NUMBER;
      hash = (53 * hash) + getTestCase().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest prototype) {
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
   * The request message for [TestCases.UpdateTestCase][google.cloud.dialogflow.cx.v3.TestCases.UpdateTestCase].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest)
      com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateTestCaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateTestCaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest.class, com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest.newBuilder()
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
      if (testCaseBuilder_ == null) {
        testCase_ = null;
      } else {
        testCase_ = null;
        testCaseBuilder_ = null;
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
      return com.google.cloud.dialogflow.cx.v3.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3_UpdateTestCaseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest build() {
      com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest result = new com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest(this);
      if (testCaseBuilder_ == null) {
        result.testCase_ = testCase_;
      } else {
        result.testCase_ = testCaseBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest.getDefaultInstance()) return this;
      if (other.hasTestCase()) {
        mergeTestCase(other.getTestCase());
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
      com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dialogflow.cx.v3.TestCase testCase_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.TestCase, com.google.cloud.dialogflow.cx.v3.TestCase.Builder, com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder> testCaseBuilder_;
    /**
     * <pre>
     * Required. The test case to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the testCase field is set.
     */
    public boolean hasTestCase() {
      return testCaseBuilder_ != null || testCase_ != null;
    }
    /**
     * <pre>
     * Required. The test case to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The testCase.
     */
    public com.google.cloud.dialogflow.cx.v3.TestCase getTestCase() {
      if (testCaseBuilder_ == null) {
        return testCase_ == null ? com.google.cloud.dialogflow.cx.v3.TestCase.getDefaultInstance() : testCase_;
      } else {
        return testCaseBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The test case to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTestCase(com.google.cloud.dialogflow.cx.v3.TestCase value) {
      if (testCaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        testCase_ = value;
        onChanged();
      } else {
        testCaseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The test case to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTestCase(
        com.google.cloud.dialogflow.cx.v3.TestCase.Builder builderForValue) {
      if (testCaseBuilder_ == null) {
        testCase_ = builderForValue.build();
        onChanged();
      } else {
        testCaseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The test case to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTestCase(com.google.cloud.dialogflow.cx.v3.TestCase value) {
      if (testCaseBuilder_ == null) {
        if (testCase_ != null) {
          testCase_ =
            com.google.cloud.dialogflow.cx.v3.TestCase.newBuilder(testCase_).mergeFrom(value).buildPartial();
        } else {
          testCase_ = value;
        }
        onChanged();
      } else {
        testCaseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The test case to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTestCase() {
      if (testCaseBuilder_ == null) {
        testCase_ = null;
        onChanged();
      } else {
        testCase_ = null;
        testCaseBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The test case to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestCase.Builder getTestCaseBuilder() {
      
      onChanged();
      return getTestCaseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The test case to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder getTestCaseOrBuilder() {
      if (testCaseBuilder_ != null) {
        return testCaseBuilder_.getMessageOrBuilder();
      } else {
        return testCase_ == null ?
            com.google.cloud.dialogflow.cx.v3.TestCase.getDefaultInstance() : testCase_;
      }
    }
    /**
     * <pre>
     * Required. The test case to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.TestCase, com.google.cloud.dialogflow.cx.v3.TestCase.Builder, com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder> 
        getTestCaseFieldBuilder() {
      if (testCaseBuilder_ == null) {
        testCaseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.TestCase, com.google.cloud.dialogflow.cx.v3.TestCase.Builder, com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder>(
                getTestCase(),
                getParentForChildren(),
                isClean());
        testCase_ = null;
      }
      return testCaseBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The mask to specify which fields should be updated. The
     * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
     * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
     * Required. The mask to specify which fields should be updated. The
     * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
     * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
     * Required. The mask to specify which fields should be updated. The
     * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
     * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
     * Required. The mask to specify which fields should be updated. The
     * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
     * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
     * Required. The mask to specify which fields should be updated. The
     * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
     * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
     * Required. The mask to specify which fields should be updated. The
     * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
     * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
     * Required. The mask to specify which fields should be updated. The
     * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
     * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
     * Required. The mask to specify which fields should be updated. The
     * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
     * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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
     * Required. The mask to specify which fields should be updated. The
     * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
     * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result] cannot be updated.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest)
  private static final com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTestCaseRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTestCaseRequest>() {
    @java.lang.Override
    public UpdateTestCaseRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateTestCaseRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateTestCaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTestCaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

