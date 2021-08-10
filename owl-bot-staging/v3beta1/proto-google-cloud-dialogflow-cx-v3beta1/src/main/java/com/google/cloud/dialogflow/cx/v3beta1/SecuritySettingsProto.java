// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/security_settings.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class SecuritySettingsProto {
  private SecuritySettingsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_InsightsExportSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_InsightsExportSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/dialogflow/cx/v3beta1/sec" +
      "urity_settings.proto\022\"google.cloud.dialo" +
      "gflow.cx.v3beta1\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\032#google/longrunning/operatio" +
      "ns.proto\032\033google/protobuf/empty.proto\032 g" +
      "oogle/protobuf/field_mask.proto\"^\n\032GetSe" +
      "curitySettingsRequest\022@\n\004name\030\001 \001(\tB2\340A\002" +
      "\372A,\n*dialogflow.googleapis.com/SecurityS" +
      "ettings\"\253\001\n\035UpdateSecuritySettingsReques" +
      "t\022T\n\021security_settings\030\001 \001(\01324.google.cl" +
      "oud.dialogflow.cx.v3beta1.SecuritySettin" +
      "gsB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.pr" +
      "otobuf.FieldMaskB\003\340A\002\"\210\001\n\033ListSecuritySe" +
      "ttingsRequest\022B\n\006parent\030\001 \001(\tB2\340A\002\372A,\022*d" +
      "ialogflow.googleapis.com/SecuritySetting" +
      "s\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t" +
      "\"\210\001\n\034ListSecuritySettingsResponse\022O\n\021sec" +
      "urity_settings\030\001 \003(\01324.google.cloud.dial" +
      "ogflow.cx.v3beta1.SecuritySettings\022\027\n\017ne" +
      "xt_page_token\030\002 \001(\t\"\271\001\n\035CreateSecuritySe" +
      "ttingsRequest\022B\n\006parent\030\001 \001(\tB2\340A\002\372A,\022*d" +
      "ialogflow.googleapis.com/SecuritySetting" +
      "s\022T\n\021security_settings\030\002 \001(\01324.google.cl" +
      "oud.dialogflow.cx.v3beta1.SecuritySettin" +
      "gsB\003\340A\002\"a\n\035DeleteSecuritySettingsRequest" +
      "\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*dialogflow.googl" +
      "eapis.com/SecuritySettings\"\257\010\n\020SecurityS" +
      "ettings\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\031\n\014display_na" +
      "me\030\002 \001(\tB\003\340A\002\022b\n\022redaction_strategy\030\003 \001(" +
      "\0162F.google.cloud.dialogflow.cx.v3beta1.S" +
      "ecuritySettings.RedactionStrategy\022\\\n\017red" +
      "action_scope\030\004 \001(\0162C.google.cloud.dialog" +
      "flow.cx.v3beta1.SecuritySettings.Redacti" +
      "onScope\022A\n\020inspect_template\030\t \001(\tB\'\372A$\n\"" +
      "dlp.googleapis.com/InspectTemplate\022G\n\023de" +
      "identify_template\030\021 \001(\tB*\372A\'\n%dlp.google" +
      "apis.com/DeidentifyTemplate\022\037\n\025retention" +
      "_window_days\030\006 \001(\005H\000\022\\\n\020purge_data_types" +
      "\030\010 \003(\0162B.google.cloud.dialogflow.cx.v3be" +
      "ta1.SecuritySettings.PurgeDataType\022m\n\030in" +
      "sights_export_settings\030\r \001(\0132K.google.cl" +
      "oud.dialogflow.cx.v3beta1.SecuritySettin" +
      "gs.InsightsExportSettings\0328\n\026InsightsExp" +
      "ortSettings\022\036\n\026enable_insights_export\030\001 " +
      "\001(\010\"P\n\021RedactionStrategy\022\"\n\036REDACTION_ST" +
      "RATEGY_UNSPECIFIED\020\000\022\027\n\023REDACT_WITH_SERV" +
      "ICE\020\001\"J\n\016RedactionScope\022\037\n\033REDACTION_SCO" +
      "PE_UNSPECIFIED\020\000\022\027\n\023REDACT_DISK_STORAGE\020" +
      "\002\"H\n\rPurgeDataType\022\037\n\033PURGE_DATA_TYPE_UN" +
      "SPECIFIED\020\000\022\026\n\022DIALOGFLOW_HISTORY\020\001:}\352Az" +
      "\n*dialogflow.googleapis.com/SecuritySett" +
      "ings\022Lprojects/{project}/locations/{loca" +
      "tion}/securitySettings/{security_setting" +
      "s}B\020\n\016data_retention2\265\n\n\027SecuritySetting" +
      "sService\022\202\002\n\026CreateSecuritySettings\022A.go" +
      "ogle.cloud.dialogflow.cx.v3beta1.CreateS" +
      "ecuritySettingsRequest\0324.google.cloud.di" +
      "alogflow.cx.v3beta1.SecuritySettings\"o\202\323" +
      "\344\223\002N\"9/v3beta1/{parent=projects/*/locati" +
      "ons/*}/securitySettings:\021security_settin" +
      "gs\332A\030parent,security_settings\022\325\001\n\023GetSec" +
      "uritySettings\022>.google.cloud.dialogflow." +
      "cx.v3beta1.GetSecuritySettingsRequest\0324." +
      "google.cloud.dialogflow.cx.v3beta1.Secur" +
      "itySettings\"H\202\323\344\223\002;\0229/v3beta1/{name=proj" +
      "ects/*/locations/*/securitySettings/*}\332A" +
      "\004name\022\232\002\n\026UpdateSecuritySettings\022A.googl" +
      "e.cloud.dialogflow.cx.v3beta1.UpdateSecu" +
      "ritySettingsRequest\0324.google.cloud.dialo" +
      "gflow.cx.v3beta1.SecuritySettings\"\206\001\202\323\344\223" +
      "\002`2K/v3beta1/{security_settings.name=pro" +
      "jects/*/locations/*/securitySettings/*}:" +
      "\021security_settings\332A\035security_settings,u" +
      "pdate_mask\022\345\001\n\024ListSecuritySettings\022?.go" +
      "ogle.cloud.dialogflow.cx.v3beta1.ListSec" +
      "uritySettingsRequest\032@.google.cloud.dial" +
      "ogflow.cx.v3beta1.ListSecuritySettingsRe" +
      "sponse\"J\202\323\344\223\002;\0229/v3beta1/{parent=project" +
      "s/*/locations/*}/securitySettings\332A\006pare" +
      "nt\022\275\001\n\026DeleteSecuritySettings\022A.google.c" +
      "loud.dialogflow.cx.v3beta1.DeleteSecurit" +
      "ySettingsRequest\032\026.google.protobuf.Empty" +
      "\"H\202\323\344\223\002;*9/v3beta1/{name=projects/*/loca" +
      "tions/*/securitySettings/*}\332A\004name\032x\312A\031d" +
      "ialogflow.googleapis.com\322AYhttps://www.g" +
      "oogleapis.com/auth/cloud-platform,https:" +
      "//www.googleapis.com/auth/dialogflowB\333\004\n" +
      "&com.google.cloud.dialogflow.cx.v3beta1B" +
      "\025SecuritySettingsProtoP\001ZDgoogle.golang." +
      "org/genproto/googleapis/cloud/dialogflow" +
      "/cx/v3beta1;cx\370\001\001\242\002\002DF\252\002\"Google.Cloud.Di" +
      "alogflow.Cx.V3Beta1\352A\310\001\n\"dlp.googleapis." +
      "com/InspectTemplate\022Uorganizations/{orga" +
      "nization}/locations/{location}/inspectTe" +
      "mplates/{inspect_template}\022Kprojects/{pr" +
      "oject}/locations/{location}/inspectTempl" +
      "ates/{inspect_template}\352A\327\001\n%dlp.googlea" +
      "pis.com/DeidentifyTemplate\022[organization" +
      "s/{organization}/locations/{location}/de" +
      "identifyTemplates/{deidentify_template}\022" +
      "Qprojects/{project}/locations/{location}" +
      "/deidentifyTemplates/{deidentify_templat" +
      "e}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_GetSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "SecuritySettings", "UpdateMask", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_descriptor,
        new java.lang.String[] { "SecuritySettings", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Parent", "SecuritySettings", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "RedactionStrategy", "RedactionScope", "InspectTemplate", "DeidentifyTemplate", "RetentionWindowDays", "PurgeDataTypes", "InsightsExportSettings", "DataRetention", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_InsightsExportSettings_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_InsightsExportSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_InsightsExportSettings_descriptor,
        new java.lang.String[] { "EnableInsightsExport", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}