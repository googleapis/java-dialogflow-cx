// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/session_entity_type.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface SessionEntityTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.SessionEntityType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The unique identifier of the session entity type.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity
   * Type ID&gt;`. If `Environment ID` is not specified, we assume default 'draft'
   * environment.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The unique identifier of the session entity type.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity
   * Type ID&gt;`. If `Environment ID` is not specified, we assume default 'draft'
   * environment.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Indicates whether the additional data should override or supplement the
   * custom entity type definition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.EntityOverrideMode entity_override_mode = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for entityOverrideMode.
   */
  int getEntityOverrideModeValue();
  /**
   * <pre>
   * Required. Indicates whether the additional data should override or supplement the
   * custom entity type definition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.EntityOverrideMode entity_override_mode = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The entityOverrideMode.
   */
  com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.EntityOverrideMode getEntityOverrideMode();

  /**
   * <pre>
   * Required. The collection of entities to override or supplement the custom entity
   * type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EntityType.Entity entities = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.EntityType.Entity> 
      getEntitiesList();
  /**
   * <pre>
   * Required. The collection of entities to override or supplement the custom entity
   * type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EntityType.Entity entities = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.EntityType.Entity getEntities(int index);
  /**
   * <pre>
   * Required. The collection of entities to override or supplement the custom entity
   * type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EntityType.Entity entities = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getEntitiesCount();
  /**
   * <pre>
   * Required. The collection of entities to override or supplement the custom entity
   * type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EntityType.Entity entities = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.EntityType.EntityOrBuilder> 
      getEntitiesOrBuilderList();
  /**
   * <pre>
   * Required. The collection of entities to override or supplement the custom entity
   * type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EntityType.Entity entities = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.EntityType.EntityOrBuilder getEntitiesOrBuilder(
      int index);
}
