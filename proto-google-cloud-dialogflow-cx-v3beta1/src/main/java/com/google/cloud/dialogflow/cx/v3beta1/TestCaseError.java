/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * Error info for importing a test.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.TestCaseError}
 */
public final class TestCaseError extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.TestCaseError)
    TestCaseErrorOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TestCaseError.newBuilder() to construct.
  private TestCaseError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TestCaseError() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TestCaseError();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TestCaseError(
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
          case 10:
            {
              com.google.cloud.dialogflow.cx.v3beta1.TestCase.Builder subBuilder = null;
              if (testCase_ != null) {
                subBuilder = testCase_.toBuilder();
              }
              testCase_ =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3beta1.TestCase.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(testCase_);
                testCase_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.rpc.Status.Builder subBuilder = null;
              if (status_ != null) {
                subBuilder = status_.toBuilder();
              }
              status_ = input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(status_);
                status_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_TestCaseError_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_TestCaseError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.TestCaseError.class,
            com.google.cloud.dialogflow.cx.v3beta1.TestCaseError.Builder.class);
  }

  public static final int TEST_CASE_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.cx.v3beta1.TestCase testCase_;
  /**
   *
   *
   * <pre>
   * The test case.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
   *
   * @return Whether the testCase field is set.
   */
  @java.lang.Override
  public boolean hasTestCase() {
    return testCase_ != null;
  }
  /**
   *
   *
   * <pre>
   * The test case.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
   *
   * @return The testCase.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.TestCase getTestCase() {
    return testCase_ == null
        ? com.google.cloud.dialogflow.cx.v3beta1.TestCase.getDefaultInstance()
        : testCase_;
  }
  /**
   *
   *
   * <pre>
   * The test case.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.TestCaseOrBuilder getTestCaseOrBuilder() {
    return getTestCase();
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private com.google.rpc.Status status_;
  /**
   *
   *
   * <pre>
   * The status associated with the test case.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   *
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   *
   *
   * <pre>
   * The status associated with the test case.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   *
   * @return The status.
   */
  @java.lang.Override
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   *
   *
   * <pre>
   * The status associated with the test case.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (testCase_ != null) {
      output.writeMessage(1, getTestCase());
    }
    if (status_ != null) {
      output.writeMessage(2, getStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (testCase_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTestCase());
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStatus());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.TestCaseError)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.TestCaseError other =
        (com.google.cloud.dialogflow.cx.v3beta1.TestCaseError) obj;

    if (hasTestCase() != other.hasTestCase()) return false;
    if (hasTestCase()) {
      if (!getTestCase().equals(other.getTestCase())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus().equals(other.getStatus())) return false;
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.TestCaseError prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Error info for importing a test.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.TestCaseError}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.TestCaseError)
      com.google.cloud.dialogflow.cx.v3beta1.TestCaseErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_TestCaseError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_TestCaseError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.TestCaseError.class,
              com.google.cloud.dialogflow.cx.v3beta1.TestCaseError.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.TestCaseError.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
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
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_TestCaseError_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.TestCaseError getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseError.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.TestCaseError build() {
      com.google.cloud.dialogflow.cx.v3beta1.TestCaseError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.TestCaseError buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.TestCaseError result =
          new com.google.cloud.dialogflow.cx.v3beta1.TestCaseError(this);
      if (testCaseBuilder_ == null) {
        result.testCase_ = testCase_;
      } else {
        result.testCase_ = testCaseBuilder_.build();
      }
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.TestCaseError) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.TestCaseError) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.TestCaseError other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.TestCaseError.getDefaultInstance())
        return this;
      if (other.hasTestCase()) {
        mergeTestCase(other.getTestCase());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
      com.google.cloud.dialogflow.cx.v3beta1.TestCaseError parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.cx.v3beta1.TestCaseError) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dialogflow.cx.v3beta1.TestCase testCase_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.TestCase,
            com.google.cloud.dialogflow.cx.v3beta1.TestCase.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.TestCaseOrBuilder>
        testCaseBuilder_;
    /**
     *
     *
     * <pre>
     * The test case.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
     *
     * @return Whether the testCase field is set.
     */
    public boolean hasTestCase() {
      return testCaseBuilder_ != null || testCase_ != null;
    }
    /**
     *
     *
     * <pre>
     * The test case.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
     *
     * @return The testCase.
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestCase getTestCase() {
      if (testCaseBuilder_ == null) {
        return testCase_ == null
            ? com.google.cloud.dialogflow.cx.v3beta1.TestCase.getDefaultInstance()
            : testCase_;
      } else {
        return testCaseBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The test case.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
     */
    public Builder setTestCase(com.google.cloud.dialogflow.cx.v3beta1.TestCase value) {
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
     *
     *
     * <pre>
     * The test case.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
     */
    public Builder setTestCase(
        com.google.cloud.dialogflow.cx.v3beta1.TestCase.Builder builderForValue) {
      if (testCaseBuilder_ == null) {
        testCase_ = builderForValue.build();
        onChanged();
      } else {
        testCaseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The test case.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
     */
    public Builder mergeTestCase(com.google.cloud.dialogflow.cx.v3beta1.TestCase value) {
      if (testCaseBuilder_ == null) {
        if (testCase_ != null) {
          testCase_ =
              com.google.cloud.dialogflow.cx.v3beta1.TestCase.newBuilder(testCase_)
                  .mergeFrom(value)
                  .buildPartial();
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
     *
     *
     * <pre>
     * The test case.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
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
     *
     *
     * <pre>
     * The test case.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestCase.Builder getTestCaseBuilder() {

      onChanged();
      return getTestCaseFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The test case.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestCaseOrBuilder getTestCaseOrBuilder() {
      if (testCaseBuilder_ != null) {
        return testCaseBuilder_.getMessageOrBuilder();
      } else {
        return testCase_ == null
            ? com.google.cloud.dialogflow.cx.v3beta1.TestCase.getDefaultInstance()
            : testCase_;
      }
    }
    /**
     *
     *
     * <pre>
     * The test case.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.TestCase,
            com.google.cloud.dialogflow.cx.v3beta1.TestCase.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.TestCaseOrBuilder>
        getTestCaseFieldBuilder() {
      if (testCaseBuilder_ == null) {
        testCaseBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3beta1.TestCase,
                com.google.cloud.dialogflow.cx.v3beta1.TestCase.Builder,
                com.google.cloud.dialogflow.cx.v3beta1.TestCaseOrBuilder>(
                getTestCase(), getParentForChildren(), isClean());
        testCase_ = null;
      }
      return testCaseBuilder_;
    }

    private com.google.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        statusBuilder_;
    /**
     *
     *
     * <pre>
     * The status associated with the test case.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     *
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     *
     *
     * <pre>
     * The status associated with the test case.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     *
     * @return The status.
     */
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The status associated with the test case.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The status associated with the test case.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder setStatus(com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The status associated with the test case.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ = com.google.rpc.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The status associated with the test case.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The status associated with the test case.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public com.google.rpc.Status.Builder getStatusBuilder() {

      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The status associated with the test case.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     *
     *
     * <pre>
     * The status associated with the test case.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(getStatus(), getParentForChildren(), isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.TestCaseError)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.TestCaseError)
  private static final com.google.cloud.dialogflow.cx.v3beta1.TestCaseError DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.TestCaseError();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestCaseError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestCaseError> PARSER =
      new com.google.protobuf.AbstractParser<TestCaseError>() {
        @java.lang.Override
        public TestCaseError parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TestCaseError(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TestCaseError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestCaseError> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.TestCaseError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
