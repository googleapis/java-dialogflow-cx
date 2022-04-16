// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/security_settings.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 * <pre>
 * The response message for [SecuritySettings.ListSecuritySettings][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse}
 */
public final class ListSecuritySettingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse)
    ListSecuritySettingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSecuritySettingsResponse.newBuilder() to construct.
  private ListSecuritySettingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSecuritySettingsResponse() {
    securitySettings_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSecuritySettingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListSecuritySettingsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              securitySettings_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings>();
              mutable_bitField0_ |= 0x00000001;
            }
            securitySettings_.add(
                input.readMessage(com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
        securitySettings_ = java.util.Collections.unmodifiableList(securitySettings_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse.Builder.class);
  }

  public static final int SECURITY_SETTINGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings> securitySettings_;
  /**
   * <pre>
   * The list of security settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings> getSecuritySettingsList() {
    return securitySettings_;
  }
  /**
   * <pre>
   * The list of security settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsOrBuilder> 
      getSecuritySettingsOrBuilderList() {
    return securitySettings_;
  }
  /**
   * <pre>
   * The list of security settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
   */
  @java.lang.Override
  public int getSecuritySettingsCount() {
    return securitySettings_.size();
  }
  /**
   * <pre>
   * The list of security settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings getSecuritySettings(int index) {
    return securitySettings_.get(index);
  }
  /**
   * <pre>
   * The list of security settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsOrBuilder getSecuritySettingsOrBuilder(
      int index) {
    return securitySettings_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < securitySettings_.size(); i++) {
      output.writeMessage(1, securitySettings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < securitySettings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, securitySettings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse other = (com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse) obj;

    if (!getSecuritySettingsList()
        .equals(other.getSecuritySettingsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getSecuritySettingsCount() > 0) {
      hash = (37 * hash) + SECURITY_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSecuritySettingsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse prototype) {
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
   * The response message for [SecuritySettings.ListSecuritySettings][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse)
      com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse.newBuilder()
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
        getSecuritySettingsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (securitySettingsBuilder_ == null) {
        securitySettings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        securitySettingsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse build() {
      com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse result = new com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse(this);
      int from_bitField0_ = bitField0_;
      if (securitySettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          securitySettings_ = java.util.Collections.unmodifiableList(securitySettings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.securitySettings_ = securitySettings_;
      } else {
        result.securitySettings_ = securitySettingsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse.getDefaultInstance()) return this;
      if (securitySettingsBuilder_ == null) {
        if (!other.securitySettings_.isEmpty()) {
          if (securitySettings_.isEmpty()) {
            securitySettings_ = other.securitySettings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSecuritySettingsIsMutable();
            securitySettings_.addAll(other.securitySettings_);
          }
          onChanged();
        }
      } else {
        if (!other.securitySettings_.isEmpty()) {
          if (securitySettingsBuilder_.isEmpty()) {
            securitySettingsBuilder_.dispose();
            securitySettingsBuilder_ = null;
            securitySettings_ = other.securitySettings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            securitySettingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSecuritySettingsFieldBuilder() : null;
          } else {
            securitySettingsBuilder_.addAllMessages(other.securitySettings_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings> securitySettings_ =
      java.util.Collections.emptyList();
    private void ensureSecuritySettingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        securitySettings_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings>(securitySettings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.Builder, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsOrBuilder> securitySettingsBuilder_;

    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings> getSecuritySettingsList() {
      if (securitySettingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(securitySettings_);
      } else {
        return securitySettingsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public int getSecuritySettingsCount() {
      if (securitySettingsBuilder_ == null) {
        return securitySettings_.size();
      } else {
        return securitySettingsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings getSecuritySettings(int index) {
      if (securitySettingsBuilder_ == null) {
        return securitySettings_.get(index);
      } else {
        return securitySettingsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public Builder setSecuritySettings(
        int index, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings value) {
      if (securitySettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecuritySettingsIsMutable();
        securitySettings_.set(index, value);
        onChanged();
      } else {
        securitySettingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public Builder setSecuritySettings(
        int index, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.Builder builderForValue) {
      if (securitySettingsBuilder_ == null) {
        ensureSecuritySettingsIsMutable();
        securitySettings_.set(index, builderForValue.build());
        onChanged();
      } else {
        securitySettingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public Builder addSecuritySettings(com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings value) {
      if (securitySettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecuritySettingsIsMutable();
        securitySettings_.add(value);
        onChanged();
      } else {
        securitySettingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public Builder addSecuritySettings(
        int index, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings value) {
      if (securitySettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecuritySettingsIsMutable();
        securitySettings_.add(index, value);
        onChanged();
      } else {
        securitySettingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public Builder addSecuritySettings(
        com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.Builder builderForValue) {
      if (securitySettingsBuilder_ == null) {
        ensureSecuritySettingsIsMutable();
        securitySettings_.add(builderForValue.build());
        onChanged();
      } else {
        securitySettingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public Builder addSecuritySettings(
        int index, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.Builder builderForValue) {
      if (securitySettingsBuilder_ == null) {
        ensureSecuritySettingsIsMutable();
        securitySettings_.add(index, builderForValue.build());
        onChanged();
      } else {
        securitySettingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public Builder addAllSecuritySettings(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings> values) {
      if (securitySettingsBuilder_ == null) {
        ensureSecuritySettingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, securitySettings_);
        onChanged();
      } else {
        securitySettingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public Builder clearSecuritySettings() {
      if (securitySettingsBuilder_ == null) {
        securitySettings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        securitySettingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public Builder removeSecuritySettings(int index) {
      if (securitySettingsBuilder_ == null) {
        ensureSecuritySettingsIsMutable();
        securitySettings_.remove(index);
        onChanged();
      } else {
        securitySettingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.Builder getSecuritySettingsBuilder(
        int index) {
      return getSecuritySettingsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsOrBuilder getSecuritySettingsOrBuilder(
        int index) {
      if (securitySettingsBuilder_ == null) {
        return securitySettings_.get(index);  } else {
        return securitySettingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsOrBuilder> 
         getSecuritySettingsOrBuilderList() {
      if (securitySettingsBuilder_ != null) {
        return securitySettingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(securitySettings_);
      }
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.Builder addSecuritySettingsBuilder() {
      return getSecuritySettingsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.Builder addSecuritySettingsBuilder(
        int index) {
      return getSecuritySettingsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of security settings.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.Builder> 
         getSecuritySettingsBuilderList() {
      return getSecuritySettingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.Builder, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsOrBuilder> 
        getSecuritySettingsFieldBuilder() {
      if (securitySettingsBuilder_ == null) {
        securitySettingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.Builder, com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsOrBuilder>(
                securitySettings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        securitySettings_ = null;
      }
      return securitySettingsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse)
  private static final com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSecuritySettingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSecuritySettingsResponse>() {
    @java.lang.Override
    public ListSecuritySettingsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListSecuritySettingsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListSecuritySettingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSecuritySettingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

