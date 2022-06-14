// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/experiment.proto

package com.google.cloud.dialogflow.cx.v3;

public interface CreateExperimentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.CreateExperimentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [Agent][google.cloud.dialogflow.cx.v3.Agent] to create an [Environment][google.cloud.dialogflow.cx.v3.Environment] for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The [Agent][google.cloud.dialogflow.cx.v3.Agent] to create an [Environment][google.cloud.dialogflow.cx.v3.Environment] for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The experiment to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Experiment experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the experiment field is set.
   */
  boolean hasExperiment();
  /**
   * <pre>
   * Required. The experiment to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Experiment experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The experiment.
   */
  com.google.cloud.dialogflow.cx.v3.Experiment getExperiment();
  /**
   * <pre>
   * Required. The experiment to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Experiment experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3.ExperimentOrBuilder getExperimentOrBuilder();
}
