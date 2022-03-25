// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/agent.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface UpdateAgentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.UpdateAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The agent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Agent agent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the agent field is set.
   */
  boolean hasAgent();
  /**
   * <pre>
   * Required. The agent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Agent agent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The agent.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Agent getAgent();
  /**
   * <pre>
   * Required. The agent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Agent agent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.AgentOrBuilder getAgentOrBuilder();

  /**
   * <pre>
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
