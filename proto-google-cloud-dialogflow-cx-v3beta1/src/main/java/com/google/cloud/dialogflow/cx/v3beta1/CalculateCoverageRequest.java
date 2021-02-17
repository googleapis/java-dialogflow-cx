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
 * The request message for [TestCases.CalculateCoverage][google.cloud.dialogflow.cx.v3beta1.TestCases.CalculateCoverage].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest}
 */
public final class CalculateCoverageRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest)
    CalculateCoverageRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CalculateCoverageRequest.newBuilder() to construct.
  private CalculateCoverageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CalculateCoverageRequest() {
    agent_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CalculateCoverageRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CalculateCoverageRequest(
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
          case 16:
            {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              agent_ = s;
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
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CalculateCoverageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CalculateCoverageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.class,
            com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The type of coverage score requested.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType}
   */
  public enum CoverageType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Should never be used.
     * </pre>
     *
     * <code>COVERAGE_TYPE_UNSPECIFIED = 0;</code>
     */
    COVERAGE_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Intent coverage.
     * </pre>
     *
     * <code>INTENT = 1;</code>
     */
    INTENT(1),
    /**
     *
     *
     * <pre>
     * Page transition coverage
     * </pre>
     *
     * <code>PAGE_TRANSITION = 2;</code>
     */
    PAGE_TRANSITION(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Should never be used.
     * </pre>
     *
     * <code>COVERAGE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int COVERAGE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Intent coverage.
     * </pre>
     *
     * <code>INTENT = 1;</code>
     */
    public static final int INTENT_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Page transition coverage
     * </pre>
     *
     * <code>PAGE_TRANSITION = 2;</code>
     */
    public static final int PAGE_TRANSITION_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CoverageType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CoverageType forNumber(int value) {
      switch (value) {
        case 0:
          return COVERAGE_TYPE_UNSPECIFIED;
        case 1:
          return INTENT;
        case 2:
          return PAGE_TRANSITION;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CoverageType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<CoverageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CoverageType>() {
          public CoverageType findValueByNumber(int number) {
            return CoverageType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final CoverageType[] VALUES = values();

    public static CoverageType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CoverageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType)
  }

  public static final int AGENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object agent_;
  /**
   *
   *
   * <pre>
   * Required. The agent to calculate coverage for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>
   * string agent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The agent.
   */
  @java.lang.Override
  public java.lang.String getAgent() {
    java.lang.Object ref = agent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The agent to calculate coverage for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>
   * string agent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for agent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAgentBytes() {
    java.lang.Object ref = agent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      agent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   *
   *
   * <pre>
   * Required. The type of coverage requested.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * Required. The type of coverage requested.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType getType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType result =
        com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType.valueOf(type_);
    return result == null
        ? com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType.UNRECOGNIZED
        : result;
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
    if (type_
        != com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType
            .COVERAGE_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, type_);
    }
    if (!getAgentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, agent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_
        != com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType
            .COVERAGE_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, type_);
    }
    if (!getAgentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, agent_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest other =
        (com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest) obj;

    if (!getAgent().equals(other.getAgent())) return false;
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + AGENT_FIELD_NUMBER;
    hash = (53 * hash) + getAgent().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parseFrom(
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
      com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest prototype) {
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
   * The request message for [TestCases.CalculateCoverage][google.cloud.dialogflow.cx.v3beta1.TestCases.CalculateCoverage].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest)
      com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CalculateCoverageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CalculateCoverageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.class,
              com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.newBuilder()
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
      agent_ = "";

      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CalculateCoverageRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest build() {
      com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest result =
          new com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest(this);
      result.agent_ = agent_;
      result.type_ = type_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest other) {
      if (other
          == com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.getDefaultInstance())
        return this;
      if (!other.getAgent().isEmpty()) {
        agent_ = other.agent_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
      com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object agent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The agent to calculate coverage for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
     * </pre>
     *
     * <code>
     * string agent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The agent.
     */
    public java.lang.String getAgent() {
      java.lang.Object ref = agent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to calculate coverage for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
     * </pre>
     *
     * <code>
     * string agent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for agent.
     */
    public com.google.protobuf.ByteString getAgentBytes() {
      java.lang.Object ref = agent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        agent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to calculate coverage for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
     * </pre>
     *
     * <code>
     * string agent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The agent to set.
     * @return This builder for chaining.
     */
    public Builder setAgent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      agent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to calculate coverage for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
     * </pre>
     *
     * <code>
     * string agent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAgent() {

      agent_ = getDefaultInstance().getAgent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to calculate coverage for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
     * </pre>
     *
     * <code>
     * string agent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for agent to set.
     * @return This builder for chaining.
     */
    public Builder setAgentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      agent_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The type of coverage requested.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of coverage requested.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {

      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of coverage requested.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType getType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType result =
          com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType.valueOf(
              type_);
      return result == null
          ? com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType
              .UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of coverage requested.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of coverage requested.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest.CoverageType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest)
  private static final com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculateCoverageRequest> PARSER =
      new com.google.protobuf.AbstractParser<CalculateCoverageRequest>() {
        @java.lang.Override
        public CalculateCoverageRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CalculateCoverageRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CalculateCoverageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculateCoverageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
