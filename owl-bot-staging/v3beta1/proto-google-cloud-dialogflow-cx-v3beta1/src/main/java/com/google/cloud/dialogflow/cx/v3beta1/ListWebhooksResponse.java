// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/webhook.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 * <pre>
 * The response message for
 * [Webhooks.ListWebhooks][google.cloud.dialogflow.cx.v3beta1.Webhooks.ListWebhooks].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse}
 */
public final class ListWebhooksResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse)
    ListWebhooksResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListWebhooksResponse.newBuilder() to construct.
  private ListWebhooksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListWebhooksResponse() {
    webhooks_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListWebhooksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.WebhookProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.WebhookProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse.Builder.class);
  }

  public static final int WEBHOOKS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Webhook> webhooks_;
  /**
   * <pre>
   * The list of webhooks. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Webhook> getWebhooksList() {
    return webhooks_;
  }
  /**
   * <pre>
   * The list of webhooks. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder> 
      getWebhooksOrBuilderList() {
    return webhooks_;
  }
  /**
   * <pre>
   * The list of webhooks. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
   */
  @java.lang.Override
  public int getWebhooksCount() {
    return webhooks_.size();
  }
  /**
   * <pre>
   * The list of webhooks. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.Webhook getWebhooks(int index) {
    return webhooks_.get(index);
  }
  /**
   * <pre>
   * The list of webhooks. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder getWebhooksOrBuilder(
      int index) {
    return webhooks_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
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
    for (int i = 0; i < webhooks_.size(); i++) {
      output.writeMessage(1, webhooks_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < webhooks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, webhooks_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse other = (com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse) obj;

    if (!getWebhooksList()
        .equals(other.getWebhooksList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getWebhooksCount() > 0) {
      hash = (37 * hash) + WEBHOOKS_FIELD_NUMBER;
      hash = (53 * hash) + getWebhooksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse prototype) {
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
   * The response message for
   * [Webhooks.ListWebhooks][google.cloud.dialogflow.cx.v3beta1.Webhooks.ListWebhooks].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse)
      com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.WebhookProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.WebhookProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse.newBuilder()
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
      if (webhooksBuilder_ == null) {
        webhooks_ = java.util.Collections.emptyList();
      } else {
        webhooks_ = null;
        webhooksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.WebhookProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse build() {
      com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse result = new com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse result) {
      if (webhooksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          webhooks_ = java.util.Collections.unmodifiableList(webhooks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.webhooks_ = webhooks_;
      } else {
        result.webhooks_ = webhooksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse.getDefaultInstance()) return this;
      if (webhooksBuilder_ == null) {
        if (!other.webhooks_.isEmpty()) {
          if (webhooks_.isEmpty()) {
            webhooks_ = other.webhooks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWebhooksIsMutable();
            webhooks_.addAll(other.webhooks_);
          }
          onChanged();
        }
      } else {
        if (!other.webhooks_.isEmpty()) {
          if (webhooksBuilder_.isEmpty()) {
            webhooksBuilder_.dispose();
            webhooksBuilder_ = null;
            webhooks_ = other.webhooks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            webhooksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWebhooksFieldBuilder() : null;
          } else {
            webhooksBuilder_.addAllMessages(other.webhooks_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              com.google.cloud.dialogflow.cx.v3beta1.Webhook m =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3beta1.Webhook.parser(),
                      extensionRegistry);
              if (webhooksBuilder_ == null) {
                ensureWebhooksIsMutable();
                webhooks_.add(m);
              } else {
                webhooksBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Webhook> webhooks_ =
      java.util.Collections.emptyList();
    private void ensureWebhooksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        webhooks_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3beta1.Webhook>(webhooks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.Webhook, com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder, com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder> webhooksBuilder_;

    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Webhook> getWebhooksList() {
      if (webhooksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(webhooks_);
      } else {
        return webhooksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public int getWebhooksCount() {
      if (webhooksBuilder_ == null) {
        return webhooks_.size();
      } else {
        return webhooksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Webhook getWebhooks(int index) {
      if (webhooksBuilder_ == null) {
        return webhooks_.get(index);
      } else {
        return webhooksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public Builder setWebhooks(
        int index, com.google.cloud.dialogflow.cx.v3beta1.Webhook value) {
      if (webhooksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWebhooksIsMutable();
        webhooks_.set(index, value);
        onChanged();
      } else {
        webhooksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public Builder setWebhooks(
        int index, com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder builderForValue) {
      if (webhooksBuilder_ == null) {
        ensureWebhooksIsMutable();
        webhooks_.set(index, builderForValue.build());
        onChanged();
      } else {
        webhooksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public Builder addWebhooks(com.google.cloud.dialogflow.cx.v3beta1.Webhook value) {
      if (webhooksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWebhooksIsMutable();
        webhooks_.add(value);
        onChanged();
      } else {
        webhooksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public Builder addWebhooks(
        int index, com.google.cloud.dialogflow.cx.v3beta1.Webhook value) {
      if (webhooksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWebhooksIsMutable();
        webhooks_.add(index, value);
        onChanged();
      } else {
        webhooksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public Builder addWebhooks(
        com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder builderForValue) {
      if (webhooksBuilder_ == null) {
        ensureWebhooksIsMutable();
        webhooks_.add(builderForValue.build());
        onChanged();
      } else {
        webhooksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public Builder addWebhooks(
        int index, com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder builderForValue) {
      if (webhooksBuilder_ == null) {
        ensureWebhooksIsMutable();
        webhooks_.add(index, builderForValue.build());
        onChanged();
      } else {
        webhooksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public Builder addAllWebhooks(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3beta1.Webhook> values) {
      if (webhooksBuilder_ == null) {
        ensureWebhooksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, webhooks_);
        onChanged();
      } else {
        webhooksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public Builder clearWebhooks() {
      if (webhooksBuilder_ == null) {
        webhooks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        webhooksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public Builder removeWebhooks(int index) {
      if (webhooksBuilder_ == null) {
        ensureWebhooksIsMutable();
        webhooks_.remove(index);
        onChanged();
      } else {
        webhooksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder getWebhooksBuilder(
        int index) {
      return getWebhooksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder getWebhooksOrBuilder(
        int index) {
      if (webhooksBuilder_ == null) {
        return webhooks_.get(index);  } else {
        return webhooksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder> 
         getWebhooksOrBuilderList() {
      if (webhooksBuilder_ != null) {
        return webhooksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(webhooks_);
      }
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder addWebhooksBuilder() {
      return getWebhooksFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.cx.v3beta1.Webhook.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder addWebhooksBuilder(
        int index) {
      return getWebhooksFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.cx.v3beta1.Webhook.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of webhooks. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Webhook webhooks = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder> 
         getWebhooksBuilderList() {
      return getWebhooksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.Webhook, com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder, com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder> 
        getWebhooksFieldBuilder() {
      if (webhooksBuilder_ == null) {
        webhooksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.Webhook, com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder, com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder>(
                webhooks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        webhooks_ = null;
      }
      return webhooksBuilder_;
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
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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
      bitField0_ = (bitField0_ & ~0x00000002);
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
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse)
  private static final com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListWebhooksResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListWebhooksResponse>() {
    @java.lang.Override
    public ListWebhooksResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListWebhooksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListWebhooksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
