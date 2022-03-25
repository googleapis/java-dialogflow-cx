// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/version.proto

package com.google.cloud.dialogflow.cx.v3;

public interface UpdateVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.UpdateVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The version to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Version version = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * Required. The version to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Version version = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The version.
   */
  com.google.cloud.dialogflow.cx.v3.Version getVersion();
  /**
   * <pre>
   * Required. The version to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Version version = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3.VersionOrBuilder getVersionOrBuilder();

  /**
   * <pre>
   * Required. The mask to control which fields get updated. Currently only `description`
   * and `display_name` can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The mask to control which fields get updated. Currently only `description`
   * and `display_name` can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The mask to control which fields get updated. Currently only `description`
   * and `display_name` can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
