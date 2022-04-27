// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/session_entity_type.proto

package com.google.cloud.dialogflow.cx.v3;

public interface GetSessionEntityTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the session entity type.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type ID&gt;` or
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity
   * Type ID&gt;`. If `Environment ID` is not specified, we assume default 'draft'
   * environment.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the session entity type.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type ID&gt;` or
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity
   * Type ID&gt;`. If `Environment ID` is not specified, we assume default 'draft'
   * environment.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
