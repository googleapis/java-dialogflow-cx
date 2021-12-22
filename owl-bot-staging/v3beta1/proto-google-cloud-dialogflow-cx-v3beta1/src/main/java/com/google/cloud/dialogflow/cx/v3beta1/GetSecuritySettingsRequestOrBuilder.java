// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/security_settings.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface GetSecuritySettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.GetSecuritySettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the settings.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/securitySettings/&lt;security settings ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Resource name of the settings.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/securitySettings/&lt;security settings ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
