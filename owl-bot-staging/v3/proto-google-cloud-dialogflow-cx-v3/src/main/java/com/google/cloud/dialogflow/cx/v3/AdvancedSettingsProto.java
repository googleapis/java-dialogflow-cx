// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/advanced_settings.proto

package com.google.cloud.dialogflow.cx.v3;

public final class AdvancedSettingsProto {
  private AdvancedSettingsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_LoggingSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_LoggingSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/dialogflow/cx/v3/advanced" +
      "_settings.proto\022\035google.cloud.dialogflow" +
      ".cx.v3\032\037google/api/field_behavior.proto\"" +
      "\310\001\n\020AdvancedSettings\022Y\n\020logging_settings" +
      "\030\006 \001(\0132?.google.cloud.dialogflow.cx.v3.A" +
      "dvancedSettings.LoggingSettings\032Y\n\017Loggi" +
      "ngSettings\022\"\n\032enable_stackdriver_logging" +
      "\030\002 \001(\010\022\"\n\032enable_interaction_logging\030\003 \001" +
      "(\010B\311\001\n!com.google.cloud.dialogflow.cx.v3" +
      "B\025AdvancedSettingsProtoP\001Z?google.golang" +
      ".org/genproto/googleapis/cloud/dialogflo" +
      "w/cx/v3;cx\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialog" +
      "flow.Cx.V3\352\002!Google::Cloud::Dialogflow::" +
      "CX::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_descriptor,
        new java.lang.String[] { "LoggingSettings", });
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_LoggingSettings_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_LoggingSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_LoggingSettings_descriptor,
        new java.lang.String[] { "EnableStackdriverLogging", "EnableInteractionLogging", });
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
