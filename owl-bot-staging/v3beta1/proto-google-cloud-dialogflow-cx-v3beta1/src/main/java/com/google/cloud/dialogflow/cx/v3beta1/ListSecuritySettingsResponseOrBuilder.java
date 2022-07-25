// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/security_settings.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ListSecuritySettingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of security settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings> 
      getSecuritySettingsList();
  /**
   * <pre>
   * The list of security settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings getSecuritySettings(int index);
  /**
   * <pre>
   * The list of security settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
   */
  int getSecuritySettingsCount();
  /**
   * <pre>
   * The list of security settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsOrBuilder> 
      getSecuritySettingsOrBuilderList();
  /**
   * <pre>
   * The list of security settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings security_settings = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsOrBuilder getSecuritySettingsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
