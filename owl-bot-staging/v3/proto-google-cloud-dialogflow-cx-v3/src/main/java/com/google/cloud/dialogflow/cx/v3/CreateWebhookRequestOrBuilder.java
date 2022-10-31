// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/webhook.proto

package com.google.cloud.dialogflow.cx.v3;

public interface CreateWebhookRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.CreateWebhookRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The agent to create a webhook for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The agent to create a webhook for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The webhook to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the webhook field is set.
   */
  boolean hasWebhook();
  /**
   * <pre>
   * Required. The webhook to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The webhook.
   */
  com.google.cloud.dialogflow.cx.v3.Webhook getWebhook();
  /**
   * <pre>
   * Required. The webhook to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3.WebhookOrBuilder getWebhookOrBuilder();
}
