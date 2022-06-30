// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/agent.proto

package com.google.cloud.dialogflow.cx.v3;

public interface AgentValidationResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.AgentValidationResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier of the agent validation result.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/validationResult`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The unique identifier of the agent validation result.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/validationResult`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.FlowValidationResult> 
      getFlowValidationResultsList();
  /**
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3.FlowValidationResult getFlowValidationResults(int index);
  /**
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;</code>
   */
  int getFlowValidationResultsCount();
  /**
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.FlowValidationResultOrBuilder> 
      getFlowValidationResultsOrBuilderList();
  /**
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3.FlowValidationResultOrBuilder getFlowValidationResultsOrBuilder(
      int index);
}
