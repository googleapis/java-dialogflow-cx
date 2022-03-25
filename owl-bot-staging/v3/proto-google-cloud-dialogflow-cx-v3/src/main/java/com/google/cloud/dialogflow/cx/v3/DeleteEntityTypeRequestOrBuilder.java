// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/entity_type.proto

package com.google.cloud.dialogflow.cx.v3;

public interface DeleteEntityTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.DeleteEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the entity type to delete.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the entity type to delete.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * This field has no effect for entity type not being used.
   * For entity types that are used by intents or pages:
   * *  If `force` is set to false, an error will be returned with message
   *    indicating the referencing resources.
   * *  If `force` is set to true, Dialogflow will remove the entity type, as
   *    well as any references to the entity type (i.e. Page
   *    [parameter][google.cloud.dialogflow.cx.v3.Form.Parameter] of the entity type will be changed to
   *    '&#64;sys.any' and intent [parameter][google.cloud.dialogflow.cx.v3.Intent.Parameter] of the entity type
   *    will be removed).
   * </pre>
   *
   * <code>bool force = 2;</code>
   * @return The force.
   */
  boolean getForce();
}
