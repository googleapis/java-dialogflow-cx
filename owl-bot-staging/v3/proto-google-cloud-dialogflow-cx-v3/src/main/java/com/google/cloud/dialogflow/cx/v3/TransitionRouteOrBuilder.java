// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/page.proto

package com.google.cloud.dialogflow.cx.v3;

public interface TransitionRouteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.TransitionRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The unique identifier of this transition route.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The unique identifier of this transition route.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The unique identifier of an [Intent][google.cloud.dialogflow.cx.v3.Intent].
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * Indicates that the transition can only happen when the given intent is
   * matched.
   * At least one of `intent` or `condition` must be specified. When both
   * `intent` and `condition` are specified, the transition can only happen
   * when both are fulfilled.
   * </pre>
   *
   * <code>string intent = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The intent.
   */
  java.lang.String getIntent();
  /**
   * <pre>
   * The unique identifier of an [Intent][google.cloud.dialogflow.cx.v3.Intent].
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * Indicates that the transition can only happen when the given intent is
   * matched.
   * At least one of `intent` or `condition` must be specified. When both
   * `intent` and `condition` are specified, the transition can only happen
   * when both are fulfilled.
   * </pre>
   *
   * <code>string intent = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for intent.
   */
  com.google.protobuf.ByteString
      getIntentBytes();

  /**
   * <pre>
   * The condition to evaluate against [form parameters][google.cloud.dialogflow.cx.v3.Form.parameters] or
   * [session parameters][google.cloud.dialogflow.cx.v3.SessionInfo.parameters].
   * See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * At least one of `intent` or `condition` must be specified. When both
   * `intent` and `condition` are specified, the transition can only happen
   * when both are fulfilled.
   * </pre>
   *
   * <code>string condition = 2;</code>
   * @return The condition.
   */
  java.lang.String getCondition();
  /**
   * <pre>
   * The condition to evaluate against [form parameters][google.cloud.dialogflow.cx.v3.Form.parameters] or
   * [session parameters][google.cloud.dialogflow.cx.v3.SessionInfo.parameters].
   * See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * At least one of `intent` or `condition` must be specified. When both
   * `intent` and `condition` are specified, the transition can only happen
   * when both are fulfilled.
   * </pre>
   *
   * <code>string condition = 2;</code>
   * @return The bytes for condition.
   */
  com.google.protobuf.ByteString
      getConditionBytes();

  /**
   * <pre>
   * The fulfillment to call when the condition is satisfied. At least one of
   * `trigger_fulfillment` and `target` must be specified. When both are
   * defined, `trigger_fulfillment` is executed first.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Fulfillment trigger_fulfillment = 3;</code>
   * @return Whether the triggerFulfillment field is set.
   */
  boolean hasTriggerFulfillment();
  /**
   * <pre>
   * The fulfillment to call when the condition is satisfied. At least one of
   * `trigger_fulfillment` and `target` must be specified. When both are
   * defined, `trigger_fulfillment` is executed first.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Fulfillment trigger_fulfillment = 3;</code>
   * @return The triggerFulfillment.
   */
  com.google.cloud.dialogflow.cx.v3.Fulfillment getTriggerFulfillment();
  /**
   * <pre>
   * The fulfillment to call when the condition is satisfied. At least one of
   * `trigger_fulfillment` and `target` must be specified. When both are
   * defined, `trigger_fulfillment` is executed first.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Fulfillment trigger_fulfillment = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3.FulfillmentOrBuilder getTriggerFulfillmentOrBuilder();

  /**
   * <pre>
   * The target page to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string target_page = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the targetPage field is set.
   */
  boolean hasTargetPage();
  /**
   * <pre>
   * The target page to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string target_page = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The targetPage.
   */
  java.lang.String getTargetPage();
  /**
   * <pre>
   * The target page to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string target_page = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for targetPage.
   */
  com.google.protobuf.ByteString
      getTargetPageBytes();

  /**
   * <pre>
   * The target flow to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 5 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the targetFlow field is set.
   */
  boolean hasTargetFlow();
  /**
   * <pre>
   * The target flow to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 5 [(.google.api.resource_reference) = { ... }</code>
   * @return The targetFlow.
   */
  java.lang.String getTargetFlow();
  /**
   * <pre>
   * The target flow to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 5 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for targetFlow.
   */
  com.google.protobuf.ByteString
      getTargetFlowBytes();

  public com.google.cloud.dialogflow.cx.v3.TransitionRoute.TargetCase getTargetCase();
}