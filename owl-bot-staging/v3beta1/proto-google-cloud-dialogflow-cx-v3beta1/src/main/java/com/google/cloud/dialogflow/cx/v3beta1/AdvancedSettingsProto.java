// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/advanced_settings.proto

package com.google.cloud.dialogflow.cx.v3beta1;

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
    internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_LoggingSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_LoggingSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/dialogflow/cx/v3beta1/adv" +
      "anced_settings.proto\022\"google.cloud.dialo" +
      "gflow.cx.v3beta1\032\034google/api/annotations" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\036google/protobuf/duration.proto\"\315\001\n\020Adva" +
      "ncedSettings\022^\n\020logging_settings\030\006 \001(\0132D" +
      ".google.cloud.dialogflow.cx.v3beta1.Adva" +
      "ncedSettings.LoggingSettings\032Y\n\017LoggingS" +
      "ettings\022\"\n\032enable_stackdriver_logging\030\002 " +
      "\001(\010\022\"\n\032enable_interaction_logging\030\003 \001(\010B" +
      "\335\001\n&com.google.cloud.dialogflow.cx.v3bet" +
      "a1B\025AdvancedSettingsProtoP\001ZDgoogle.gola" +
      "ng.org/genproto/googleapis/cloud/dialogf" +
      "low/cx/v3beta1;cx\370\001\001\242\002\002DF\252\002\"Google.Cloud" +
      ".Dialogflow.Cx.V3Beta1\352\002&Google::Cloud::" +
      "Dialogflow::CX::V3beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_descriptor,
        new java.lang.String[] { "LoggingSettings", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_LoggingSettings_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_LoggingSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_AdvancedSettings_LoggingSettings_descriptor,
        new java.lang.String[] { "EnableStackdriverLogging", "EnableInteractionLogging", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
