/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/security_settings.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class SecuritySettingsProto {
  private SecuritySettingsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetSecuritySettingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSecuritySettingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSecuritySettingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSecuritySettingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_InsightsExportSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_InsightsExportSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/dialogflow/cx/v3beta1/sec"
          + "urity_settings.proto\022\"google.cloud.dialo"
          + "gflow.cx.v3beta1\032\034google/api/annotations"
          + ".proto\032\027google/api/client.proto\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\032#google/longrunning/operatio"
          + "ns.proto\032\033google/protobuf/empty.proto\032 g"
          + "oogle/protobuf/field_mask.proto\"^\n\032GetSe"
          + "curitySettingsRequest\022@\n\004name\030\001 \001(\tB2\340A\002"
          + "\372A,\n*dialogflow.googleapis.com/SecurityS"
          + "ettings\"\253\001\n\035UpdateSecuritySettingsReques"
          + "t\022T\n\021security_settings\030\001 \001(\01324.google.cl"
          + "oud.dialogflow.cx.v3beta1.SecuritySettin"
          + "gsB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.pr"
          + "otobuf.FieldMaskB\003\340A\002\"\210\001\n\033ListSecuritySe"
          + "ttingsRequest\022B\n\006parent\030\001 \001(\tB2\340A\002\372A,\022*d"
          + "ialogflow.googleapis.com/SecuritySetting"
          + "s\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t"
          + "\"\210\001\n\034ListSecuritySettingsResponse\022O\n\021sec"
          + "urity_settings\030\001 \003(\01324.google.cloud.dial"
          + "ogflow.cx.v3beta1.SecuritySettings\022\027\n\017ne"
          + "xt_page_token\030\002 \001(\t\"\271\001\n\035CreateSecuritySe"
          + "ttingsRequest\022B\n\006parent\030\001 \001(\tB2\340A\002\372A,\022*d"
          + "ialogflow.googleapis.com/SecuritySetting"
          + "s\022T\n\021security_settings\030\002 \001(\01324.google.cl"
          + "oud.dialogflow.cx.v3beta1.SecuritySettin"
          + "gsB\003\340A\002\"a\n\035DeleteSecuritySettingsRequest"
          + "\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*dialogflow.googl"
          + "eapis.com/SecuritySettings\"\252\010\n\020SecurityS"
          + "ettings\022\014\n\004name\030\001 \001(\t\022\031\n\014display_name\030\002 "
          + "\001(\tB\003\340A\002\022b\n\022redaction_strategy\030\003 \001(\0162F.g"
          + "oogle.cloud.dialogflow.cx.v3beta1.Securi"
          + "tySettings.RedactionStrategy\022\\\n\017redactio"
          + "n_scope\030\004 \001(\0162C.google.cloud.dialogflow."
          + "cx.v3beta1.SecuritySettings.RedactionSco"
          + "pe\022A\n\020inspect_template\030\t \001(\tB\'\372A$\n\"dlp.g"
          + "oogleapis.com/InspectTemplate\022G\n\023deident"
          + "ify_template\030\021 \001(\tB*\372A\'\n%dlp.googleapis."
          + "com/DeidentifyTemplate\022\037\n\025retention_wind"
          + "ow_days\030\006 \001(\005H\000\022\\\n\020purge_data_types\030\010 \003("
          + "\0162B.google.cloud.dialogflow.cx.v3beta1.S"
          + "ecuritySettings.PurgeDataType\022m\n\030insight"
          + "s_export_settings\030\r \001(\0132K.google.cloud.d"
          + "ialogflow.cx.v3beta1.SecuritySettings.In"
          + "sightsExportSettings\0328\n\026InsightsExportSe"
          + "ttings\022\036\n\026enable_insights_export\030\001 \001(\010\"P"
          + "\n\021RedactionStrategy\022\"\n\036REDACTION_STRATEG"
          + "Y_UNSPECIFIED\020\000\022\027\n\023REDACT_WITH_SERVICE\020\001"
          + "\"J\n\016RedactionScope\022\037\n\033REDACTION_SCOPE_UN"
          + "SPECIFIED\020\000\022\027\n\023REDACT_DISK_STORAGE\020\002\"H\n\r"
          + "PurgeDataType\022\037\n\033PURGE_DATA_TYPE_UNSPECI"
          + "FIED\020\000\022\026\n\022DIALOGFLOW_HISTORY\020\001:}\352Az\n*dia"
          + "logflow.googleapis.com/SecuritySettings\022"
          + "Lprojects/{project}/locations/{location}"
          + "/securitySettings/{security_settings}B\020\n"
          + "\016data_retention2\265\n\n\027SecuritySettingsServ"
          + "ice\022\202\002\n\026CreateSecuritySettings\022A.google."
          + "cloud.dialogflow.cx.v3beta1.CreateSecuri"
          + "tySettingsRequest\0324.google.cloud.dialogf"
          + "low.cx.v3beta1.SecuritySettings\"o\202\323\344\223\002N\""
          + "9/v3beta1/{parent=projects/*/locations/*"
          + "}/securitySettings:\021security_settings\332A\030"
          + "parent,security_settings\022\325\001\n\023GetSecurity"
          + "Settings\022>.google.cloud.dialogflow.cx.v3"
          + "beta1.GetSecuritySettingsRequest\0324.googl"
          + "e.cloud.dialogflow.cx.v3beta1.SecuritySe"
          + "ttings\"H\202\323\344\223\002;\0229/v3beta1/{name=projects/"
          + "*/locations/*/securitySettings/*}\332A\004name"
          + "\022\232\002\n\026UpdateSecuritySettings\022A.google.clo"
          + "ud.dialogflow.cx.v3beta1.UpdateSecurityS"
          + "ettingsRequest\0324.google.cloud.dialogflow"
          + ".cx.v3beta1.SecuritySettings\"\206\001\202\323\344\223\002`2K/"
          + "v3beta1/{security_settings.name=projects"
          + "/*/locations/*/securitySettings/*}:\021secu"
          + "rity_settings\332A\035security_settings,update"
          + "_mask\022\345\001\n\024ListSecuritySettings\022?.google."
          + "cloud.dialogflow.cx.v3beta1.ListSecurity"
          + "SettingsRequest\032@.google.cloud.dialogflo"
          + "w.cx.v3beta1.ListSecuritySettingsRespons"
          + "e\"J\202\323\344\223\002;\0229/v3beta1/{parent=projects/*/l"
          + "ocations/*}/securitySettings\332A\006parent\022\275\001"
          + "\n\026DeleteSecuritySettings\022A.google.cloud."
          + "dialogflow.cx.v3beta1.DeleteSecuritySett"
          + "ingsRequest\032\026.google.protobuf.Empty\"H\202\323\344"
          + "\223\002;*9/v3beta1/{name=projects/*/locations"
          + "/*/securitySettings/*}\332A\004name\032x\312A\031dialog"
          + "flow.googleapis.com\322AYhttps://www.google"
          + "apis.com/auth/cloud-platform,https://www"
          + ".googleapis.com/auth/dialogflowB\204\005\n&com."
          + "google.cloud.dialogflow.cx.v3beta1B\025Secu"
          + "ritySettingsProtoP\001ZDgoogle.golang.org/g"
          + "enproto/googleapis/cloud/dialogflow/cx/v"
          + "3beta1;cx\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialogf"
          + "low.Cx.V3Beta1\352\002&Google::Cloud::Dialogfl"
          + "ow::CX::V3beta1\352A\310\001\n\"dlp.googleapis.com/"
          + "InspectTemplate\022Uorganizations/{organiza"
          + "tion}/locations/{location}/inspectTempla"
          + "tes/{inspect_template}\022Kprojects/{projec"
          + "t}/locations/{location}/inspectTemplates"
          + "/{inspect_template}\352A\327\001\n%dlp.googleapis."
          + "com/DeidentifyTemplate\022[organizations/{o"
          + "rganization}/locations/{location}/deiden"
          + "tifyTemplates/{deidentify_template}\022Qpro"
          + "jects/{project}/locations/{location}/dei"
          + "dentifyTemplates/{deidentify_template}b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
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
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetSecuritySettingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetSecuritySettingsRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSecuritySettingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSecuritySettingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSecuritySettingsRequest_descriptor,
            new java.lang.String[] {
              "SecuritySettings", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListSecuritySettingsResponse_descriptor,
            new java.lang.String[] {
              "SecuritySettings", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSecuritySettingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSecuritySettingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSecuritySettingsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SecuritySettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSecuritySettingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSecuritySettingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSecuritySettingsRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "RedactionStrategy",
              "RedactionScope",
              "InspectTemplate",
              "DeidentifyTemplate",
              "RetentionWindowDays",
              "PurgeDataTypes",
              "InsightsExportSettings",
              "DataRetention",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_InsightsExportSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_InsightsExportSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SecuritySettings_InsightsExportSettings_descriptor,
            new java.lang.String[] {
              "EnableInsightsExport",
            });
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
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
