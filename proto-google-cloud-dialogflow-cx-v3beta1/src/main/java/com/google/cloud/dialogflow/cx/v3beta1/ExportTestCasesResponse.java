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
 * The response message for [TestCases.ExportTestCases][google.cloud.dialogflow.cx.v3beta1.TestCases.ExportTestCases].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse}
 */
public final class ExportTestCasesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse)
    ExportTestCasesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExportTestCasesResponse.newBuilder() to construct.
  private ExportTestCasesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportTestCasesResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportTestCasesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExportTestCasesResponse(
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
              java.lang.String s = input.readStringRequireUtf8();
              destinationCase_ = 1;
              destination_ = s;
              break;
            }
          case 18:
            {
              destinationCase_ = 2;
              destination_ = input.readBytes();
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
        .internal_static_google_cloud_dialogflow_cx_v3beta1_ExportTestCasesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_ExportTestCasesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse.class,
            com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse.Builder.class);
  }

  private int destinationCase_ = 0;
  private java.lang.Object destination_;

  public enum DestinationCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_URI(1),
    CONTENT(2),
    DESTINATION_NOT_SET(0);
    private final int value;

    private DestinationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DestinationCase valueOf(int value) {
      return forNumber(value);
    }

    public static DestinationCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCS_URI;
        case 2:
          return CONTENT;
        case 0:
          return DESTINATION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DestinationCase getDestinationCase() {
    return DestinationCase.forNumber(destinationCase_);
  }

  public static final int GCS_URI_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported test cases. This field is
   * populated only if `gcs_uri` is specified in
   * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest].
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   *
   * @return The gcsUri.
   */
  public java.lang.String getGcsUri() {
    java.lang.Object ref = "";
    if (destinationCase_ == 1) {
      ref = destination_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (destinationCase_ == 1) {
        destination_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported test cases. This field is
   * populated only if `gcs_uri` is specified in
   * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest].
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   *
   * @return The bytes for gcsUri.
   */
  public com.google.protobuf.ByteString getGcsUriBytes() {
    java.lang.Object ref = "";
    if (destinationCase_ == 1) {
      ref = destination_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (destinationCase_ == 1) {
        destination_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Uncompressed raw byte content for test cases.
   * </pre>
   *
   * <code>bytes content = 2;</code>
   *
   * @return The content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContent() {
    if (destinationCase_ == 2) {
      return (com.google.protobuf.ByteString) destination_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (destinationCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, destination_);
    }
    if (destinationCase_ == 2) {
      output.writeBytes(2, (com.google.protobuf.ByteString) destination_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (destinationCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, destination_);
    }
    if (destinationCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              2, (com.google.protobuf.ByteString) destination_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse other =
        (com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse) obj;

    if (!getDestinationCase().equals(other.getDestinationCase())) return false;
    switch (destinationCase_) {
      case 1:
        if (!getGcsUri().equals(other.getGcsUri())) return false;
        break;
      case 2:
        if (!getContent().equals(other.getContent())) return false;
        break;
      case 0:
      default:
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
    switch (destinationCase_) {
      case 1:
        hash = (37 * hash) + GCS_URI_FIELD_NUMBER;
        hash = (53 * hash) + getGcsUri().hashCode();
        break;
      case 2:
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse prototype) {
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
   * The response message for [TestCases.ExportTestCases][google.cloud.dialogflow.cx.v3beta1.TestCases.ExportTestCases].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse)
      com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_ExportTestCasesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_ExportTestCasesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse.class,
              com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse.newBuilder()
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
      destinationCase_ = 0;
      destination_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_ExportTestCasesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse build() {
      com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse result =
          new com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse(this);
      if (destinationCase_ == 1) {
        result.destination_ = destination_;
      }
      if (destinationCase_ == 2) {
        result.destination_ = destination_;
      }
      result.destinationCase_ = destinationCase_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse other) {
      if (other
          == com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse.getDefaultInstance())
        return this;
      switch (other.getDestinationCase()) {
        case GCS_URI:
          {
            destinationCase_ = 1;
            destination_ = other.destination_;
            onChanged();
            break;
          }
        case CONTENT:
          {
            setContent(other.getContent());
            break;
          }
        case DESTINATION_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int destinationCase_ = 0;
    private java.lang.Object destination_;

    public DestinationCase getDestinationCase() {
      return DestinationCase.forNumber(destinationCase_);
    }

    public Builder clearDestination() {
      destinationCase_ = 0;
      destination_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URI to a file containing the exported test cases. This field is
     * populated only if `gcs_uri` is specified in
     * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest].
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @return The gcsUri.
     */
    @java.lang.Override
    public java.lang.String getGcsUri() {
      java.lang.Object ref = "";
      if (destinationCase_ == 1) {
        ref = destination_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (destinationCase_ == 1) {
          destination_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URI to a file containing the exported test cases. This field is
     * populated only if `gcs_uri` is specified in
     * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest].
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @return The bytes for gcsUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getGcsUriBytes() {
      java.lang.Object ref = "";
      if (destinationCase_ == 1) {
        ref = destination_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (destinationCase_ == 1) {
          destination_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URI to a file containing the exported test cases. This field is
     * populated only if `gcs_uri` is specified in
     * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest].
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @param value The gcsUri to set.
     * @return This builder for chaining.
     */
    public Builder setGcsUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      destinationCase_ = 1;
      destination_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URI to a file containing the exported test cases. This field is
     * populated only if `gcs_uri` is specified in
     * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest].
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGcsUri() {
      if (destinationCase_ == 1) {
        destinationCase_ = 0;
        destination_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URI to a file containing the exported test cases. This field is
     * populated only if `gcs_uri` is specified in
     * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3beta1.ExportTestCasesRequest].
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @param value The bytes for gcsUri to set.
     * @return This builder for chaining.
     */
    public Builder setGcsUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      destinationCase_ = 1;
      destination_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for test cases.
     * </pre>
     *
     * <code>bytes content = 2;</code>
     *
     * @return The content.
     */
    public com.google.protobuf.ByteString getContent() {
      if (destinationCase_ == 2) {
        return (com.google.protobuf.ByteString) destination_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for test cases.
     * </pre>
     *
     * <code>bytes content = 2;</code>
     *
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      destinationCase_ = 2;
      destination_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Uncompressed raw byte content for test cases.
     * </pre>
     *
     * <code>bytes content = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      if (destinationCase_ == 2) {
        destinationCase_ = 0;
        destination_ = null;
        onChanged();
      }
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse)
  private static final com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportTestCasesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ExportTestCasesResponse>() {
        @java.lang.Override
        public ExportTestCasesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExportTestCasesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExportTestCasesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportTestCasesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ExportTestCasesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
