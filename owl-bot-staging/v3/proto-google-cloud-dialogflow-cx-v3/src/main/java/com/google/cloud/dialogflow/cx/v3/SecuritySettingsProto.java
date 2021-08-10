// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/security_settings.proto

package com.google.cloud.dialogflow.cx.v3;

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
    internal_static_google_cloud_dialogflow_cx_v3_GetSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_UpdateSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_DeleteSecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_InsightsExportSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_InsightsExportSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/dialogflow/cx/v3/security" +
      "_settings.proto\022\035google.cloud.dialogflow" +
      ".cx.v3\032\034google/api/annotations.proto\032\027go" +
      "ogle/api/client.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\032#google/longrunning/operations.proto\032\033" +
      "google/protobuf/empty.proto\032 google/prot" +
      "obuf/field_mask.proto\"^\n\032GetSecuritySett" +
      "ingsRequest\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*dialo" +
      "gflow.googleapis.com/SecuritySettings\"\246\001" +
      "\n\035UpdateSecuritySettingsRequest\022O\n\021secur" +
      "ity_settings\030\001 \001(\0132/.google.cloud.dialog" +
      "flow.cx.v3.SecuritySettingsB\003\340A\002\0224\n\013upda" +
      "te_mask\030\002 \001(\0132\032.google.protobuf.FieldMas" +
      "kB\003\340A\002\"\210\001\n\033ListSecuritySettingsRequest\022B" +
      "\n\006parent\030\001 \001(\tB2\340A\002\372A,\022*dialogflow.googl" +
      "eapis.com/SecuritySettings\022\021\n\tpage_size\030" +
      "\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\203\001\n\034ListSecuri" +
      "tySettingsResponse\022J\n\021security_settings\030" +
      "\001 \003(\0132/.google.cloud.dialogflow.cx.v3.Se" +
      "curitySettings\022\027\n\017next_page_token\030\002 \001(\t\"" +
      "\264\001\n\035CreateSecuritySettingsRequest\022B\n\006par" +
      "ent\030\001 \001(\tB2\340A\002\372A,\022*dialogflow.googleapis" +
      ".com/SecuritySettings\022O\n\021security_settin" +
      "gs\030\002 \001(\0132/.google.cloud.dialogflow.cx.v3" +
      ".SecuritySettingsB\003\340A\002\"a\n\035DeleteSecurity" +
      "SettingsRequest\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*d" +
      "ialogflow.googleapis.com/SecuritySetting" +
      "s\"\233\010\n\020SecuritySettings\022\021\n\004name\030\001 \001(\tB\003\340A" +
      "\002\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022]\n\022redactio" +
      "n_strategy\030\003 \001(\0162A.google.cloud.dialogfl" +
      "ow.cx.v3.SecuritySettings.RedactionStrat" +
      "egy\022W\n\017redaction_scope\030\004 \001(\0162>.google.cl" +
      "oud.dialogflow.cx.v3.SecuritySettings.Re" +
      "dactionScope\022A\n\020inspect_template\030\t \001(\tB\'" +
      "\372A$\n\"dlp.googleapis.com/InspectTemplate\022" +
      "G\n\023deidentify_template\030\021 \001(\tB*\372A\'\n%dlp.g" +
      "oogleapis.com/DeidentifyTemplate\022\037\n\025rete" +
      "ntion_window_days\030\006 \001(\005H\000\022W\n\020purge_data_" +
      "types\030\010 \003(\0162=.google.cloud.dialogflow.cx" +
      ".v3.SecuritySettings.PurgeDataType\022h\n\030in" +
      "sights_export_settings\030\r \001(\0132F.google.cl" +
      "oud.dialogflow.cx.v3.SecuritySettings.In" +
      "sightsExportSettings\0328\n\026InsightsExportSe" +
      "ttings\022\036\n\026enable_insights_export\030\001 \001(\010\"P" +
      "\n\021RedactionStrategy\022\"\n\036REDACTION_STRATEG" +
      "Y_UNSPECIFIED\020\000\022\027\n\023REDACT_WITH_SERVICE\020\001" +
      "\"J\n\016RedactionScope\022\037\n\033REDACTION_SCOPE_UN" +
      "SPECIFIED\020\000\022\027\n\023REDACT_DISK_STORAGE\020\002\"H\n\r" +
      "PurgeDataType\022\037\n\033PURGE_DATA_TYPE_UNSPECI" +
      "FIED\020\000\022\026\n\022DIALOGFLOW_HISTORY\020\001:}\352Az\n*dia" +
      "logflow.googleapis.com/SecuritySettings\022" +
      "Lprojects/{project}/locations/{location}" +
      "/securitySettings/{security_settings}B\020\n" +
      "\016data_retention2\357\t\n\027SecuritySettingsServ" +
      "ice\022\363\001\n\026CreateSecuritySettings\022<.google." +
      "cloud.dialogflow.cx.v3.CreateSecuritySet" +
      "tingsRequest\032/.google.cloud.dialogflow.c" +
      "x.v3.SecuritySettings\"j\202\323\344\223\002I\"4/v3/{pare" +
      "nt=projects/*/locations/*}/securitySetti" +
      "ngs:\021security_settings\332A\030parent,security" +
      "_settings\022\306\001\n\023GetSecuritySettings\0229.goog" +
      "le.cloud.dialogflow.cx.v3.GetSecuritySet" +
      "tingsRequest\032/.google.cloud.dialogflow.c" +
      "x.v3.SecuritySettings\"C\202\323\344\223\0026\0224/v3/{name" +
      "=projects/*/locations/*/securitySettings" +
      "/*}\332A\004name\022\213\002\n\026UpdateSecuritySettings\022<." +
      "google.cloud.dialogflow.cx.v3.UpdateSecu" +
      "ritySettingsRequest\032/.google.cloud.dialo" +
      "gflow.cx.v3.SecuritySettings\"\201\001\202\323\344\223\002[2F/" +
      "v3/{security_settings.name=projects/*/lo" +
      "cations/*/securitySettings/*}:\021security_" +
      "settings\332A\035security_settings,update_mask" +
      "\022\326\001\n\024ListSecuritySettings\022:.google.cloud" +
      ".dialogflow.cx.v3.ListSecuritySettingsRe" +
      "quest\032;.google.cloud.dialogflow.cx.v3.Li" +
      "stSecuritySettingsResponse\"E\202\323\344\223\0026\0224/v3/" +
      "{parent=projects/*/locations/*}/security" +
      "Settings\332A\006parent\022\263\001\n\026DeleteSecuritySett" +
      "ings\022<.google.cloud.dialogflow.cx.v3.Del" +
      "eteSecuritySettingsRequest\032\026.google.prot" +
      "obuf.Empty\"C\202\323\344\223\0026*4/v3/{name=projects/*" +
      "/locations/*/securitySettings/*}\332A\004name\032" +
      "x\312A\031dialogflow.googleapis.com\322AYhttps://" +
      "www.googleapis.com/auth/cloud-platform,h" +
      "ttps://www.googleapis.com/auth/dialogflo" +
      "wB\314\004\n!com.google.cloud.dialogflow.cx.v3B" +
      "\025SecuritySettingsProtoP\001Z?google.golang." +
      "org/genproto/googleapis/cloud/dialogflow" +
      "/cx/v3;cx\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialogf" +
      "low.Cx.V3\352A\310\001\n\"dlp.googleapis.com/Inspec" +
      "tTemplate\022Uorganizations/{organization}/" +
      "locations/{location}/inspectTemplates/{i" +
      "nspect_template}\022Kprojects/{project}/loc" +
      "ations/{location}/inspectTemplates/{insp" +
      "ect_template}\352A\327\001\n%dlp.googleapis.com/De" +
      "identifyTemplate\022[organizations/{organiz" +
      "ation}/locations/{location}/deidentifyTe" +
      "mplates/{deidentify_template}\022Qprojects/" +
      "{project}/locations/{location}/deidentif" +
      "yTemplates/{deidentify_template}b\006proto3"
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
    internal_static_google_cloud_dialogflow_cx_v3_GetSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_GetSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_GetSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_UpdateSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "SecuritySettings", "UpdateMask", });
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListSecuritySettingsResponse_descriptor,
        new java.lang.String[] { "SecuritySettings", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Parent", "SecuritySettings", });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteSecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteSecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_DeleteSecuritySettingsRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "RedactionStrategy", "RedactionScope", "InspectTemplate", "DeidentifyTemplate", "RetentionWindowDays", "PurgeDataTypes", "InsightsExportSettings", "DataRetention", });
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_InsightsExportSettings_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_InsightsExportSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_SecuritySettings_InsightsExportSettings_descriptor,
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
