// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/agent.proto

package com.google.cloud.dialogflow.cx.v3;

public final class AgentProto {
  private AgentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/dialogflow/cx/v3/agent.pr" +
      "oto\022\035google.cloud.dialogflow.cx.v3\032\034goog" +
      "le/api/annotations.proto\032\027google/api/cli" +
      "ent.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\0325google/cl" +
      "oud/dialogflow/cx/v3/advanced_settings.p" +
      "roto\032(google/cloud/dialogflow/cx/v3/flow" +
      ".proto\0325google/cloud/dialogflow/cx/v3/se" +
      "curity_settings.proto\032#google/longrunnin" +
      "g/operations.proto\032\033google/protobuf/empt" +
      "y.proto\032 google/protobuf/field_mask.prot" +
      "o\"8\n\024SpeechToTextSettings\022 \n\030enable_spee" +
      "ch_adaptation\030\001 \001(\010\"\213\005\n\005Agent\022\014\n\004name\030\001 " +
      "\001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022%\n\025defaul" +
      "t_language_code\030\003 \001(\tB\006\340A\002\340A\005\022 \n\030support" +
      "ed_language_codes\030\004 \003(\t\022\026\n\ttime_zone\030\005 \001" +
      "(\tB\003\340A\002\022\023\n\013description\030\006 \001(\t\022\022\n\navatar_u" +
      "ri\030\007 \001(\t\022T\n\027speech_to_text_settings\030\r \001(" +
      "\01323.google.cloud.dialogflow.cx.v3.Speech" +
      "ToTextSettings\022:\n\nstart_flow\030\020 \001(\tB&\340A\005\372" +
      "A \n\036dialogflow.googleapis.com/Flow\022J\n\021se" +
      "curity_settings\030\021 \001(\tB/\372A,\n*dialogflow.g" +
      "oogleapis.com/SecuritySettings\022&\n\032enable" +
      "_stackdriver_logging\030\022 \001(\010B\002\030\001\022\037\n\027enable" +
      "_spell_correction\030\024 \001(\010\022J\n\021advanced_sett" +
      "ings\030\026 \001(\0132/.google.cloud.dialogflow.cx." +
      "v3.AdvancedSettings:\\\352AY\n\037dialogflow.goo" +
      "gleapis.com/Agent\0226projects/{project}/lo" +
      "cations/{location}/agents/{agent}\"s\n\021Lis" +
      "tAgentsRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037" +
      "dialogflow.googleapis.com/Agent\022\021\n\tpage_" +
      "size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"c\n\022ListAg" +
      "entsResponse\0224\n\006agents\030\001 \003(\0132$.google.cl" +
      "oud.dialogflow.cx.v3.Agent\022\027\n\017next_page_" +
      "token\030\002 \001(\t\"H\n\017GetAgentRequest\0225\n\004name\030\001" +
      " \001(\tB\'\340A\002\372A!\n\037dialogflow.googleapis.com/" +
      "Agent\"\207\001\n\022CreateAgentRequest\0227\n\006parent\030\001" +
      " \001(\tB\'\340A\002\372A!\022\037dialogflow.googleapis.com/" +
      "Agent\0228\n\005agent\030\002 \001(\0132$.google.cloud.dial" +
      "ogflow.cx.v3.AgentB\003\340A\002\"\177\n\022UpdateAgentRe" +
      "quest\0228\n\005agent\030\001 \001(\0132$.google.cloud.dial" +
      "ogflow.cx.v3.AgentB\003\340A\002\022/\n\013update_mask\030\002" +
      " \001(\0132\032.google.protobuf.FieldMask\"K\n\022Dele" +
      "teAgentRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037di" +
      "alogflow.googleapis.com/Agent\"\247\001\n\022Export" +
      "AgentRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037dial" +
      "ogflow.googleapis.com/Agent\022\026\n\tagent_uri" +
      "\030\002 \001(\tB\003\340A\001\022B\n\013environment\030\005 \001(\tB-\340A\001\372A\'" +
      "\n%dialogflow.googleapis.com/Environment\"" +
      "L\n\023ExportAgentResponse\022\023\n\tagent_uri\030\001 \001(" +
      "\tH\000\022\027\n\ragent_content\030\002 \001(\014H\000B\007\n\005agent\"\246\002" +
      "\n\023RestoreAgentRequest\0225\n\004name\030\001 \001(\tB\'\340A\002" +
      "\372A!\n\037dialogflow.googleapis.com/Agent\022\023\n\t" +
      "agent_uri\030\002 \001(\tH\000\022\027\n\ragent_content\030\003 \001(\014" +
      "H\000\022X\n\016restore_option\030\005 \001(\0162@.google.clou" +
      "d.dialogflow.cx.v3.RestoreAgentRequest.R" +
      "estoreOption\"G\n\rRestoreOption\022\036\n\032RESTORE" +
      "_OPTION_UNSPECIFIED\020\000\022\010\n\004KEEP\020\001\022\014\n\010FALLB" +
      "ACK\020\002B\007\n\005agent\"d\n\024ValidateAgentRequest\0225" +
      "\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037dialogflow.googlea" +
      "pis.com/Agent\022\025\n\rlanguage_code\030\002 \001(\t\"\177\n\037" +
      "GetAgentValidationResultRequest\022E\n\004name\030" +
      "\001 \001(\tB7\340A\002\372A1\n/dialogflow.googleapis.com" +
      "/AgentValidationResult\022\025\n\rlanguage_code\030" +
      "\002 \001(\t\"\372\001\n\025AgentValidationResult\022\014\n\004name\030" +
      "\001 \001(\t\022T\n\027flow_validation_results\030\002 \003(\01323" +
      ".google.cloud.dialogflow.cx.v3.FlowValid" +
      "ationResult:}\352Az\n/dialogflow.googleapis." +
      "com/AgentValidationResult\022Gprojects/{pro" +
      "ject}/locations/{location}/agents/{agent" +
      "}/validationResult2\231\016\n\006Agents\022\256\001\n\nListAg" +
      "ents\0220.google.cloud.dialogflow.cx.v3.Lis" +
      "tAgentsRequest\0321.google.cloud.dialogflow" +
      ".cx.v3.ListAgentsResponse\";\202\323\344\223\002,\022*/v3/{" +
      "parent=projects/*/locations/*}/agents\332A\006" +
      "parent\022\233\001\n\010GetAgent\022..google.cloud.dialo" +
      "gflow.cx.v3.GetAgentRequest\032$.google.clo" +
      "ud.dialogflow.cx.v3.Agent\"9\202\323\344\223\002,\022*/v3/{" +
      "name=projects/*/locations/*/agents/*}\332A\004" +
      "name\022\260\001\n\013CreateAgent\0221.google.cloud.dial" +
      "ogflow.cx.v3.CreateAgentRequest\032$.google" +
      ".cloud.dialogflow.cx.v3.Agent\"H\202\323\344\223\0023\"*/" +
      "v3/{parent=projects/*/locations/*}/agent" +
      "s:\005agent\332A\014parent,agent\022\273\001\n\013UpdateAgent\022" +
      "1.google.cloud.dialogflow.cx.v3.UpdateAg" +
      "entRequest\032$.google.cloud.dialogflow.cx." +
      "v3.Agent\"S\202\323\344\223\002920/v3/{agent.name=projec" +
      "ts/*/locations/*/agents/*}:\005agent\332A\021agen" +
      "t,update_mask\022\223\001\n\013DeleteAgent\0221.google.c" +
      "loud.dialogflow.cx.v3.DeleteAgentRequest" +
      "\032\026.google.protobuf.Empty\"9\202\323\344\223\002,**/v3/{n" +
      "ame=projects/*/locations/*/agents/*}\332A\004n" +
      "ame\022\315\001\n\013ExportAgent\0221.google.cloud.dialo" +
      "gflow.cx.v3.ExportAgentRequest\032\035.google." +
      "longrunning.Operation\"l\202\323\344\223\0026\"1/v3/{name" +
      "=projects/*/locations/*/agents/*}:export" +
      ":\001*\312A-\n\023ExportAgentResponse\022\026google.prot" +
      "obuf.Struct\022\322\001\n\014RestoreAgent\0222.google.cl" +
      "oud.dialogflow.cx.v3.RestoreAgentRequest" +
      "\032\035.google.longrunning.Operation\"o\202\323\344\223\0027\"" +
      "2/v3/{name=projects/*/locations/*/agents" +
      "/*}:restore:\001*\312A/\n\025google.protobuf.Empty" +
      "\022\026google.protobuf.Struct\022\272\001\n\rValidateAge" +
      "nt\0223.google.cloud.dialogflow.cx.v3.Valid" +
      "ateAgentRequest\0324.google.cloud.dialogflo" +
      "w.cx.v3.AgentValidationResult\">\202\323\344\223\0028\"3/" +
      "v3/{name=projects/*/locations/*/agents/*" +
      "}:validate:\001*\022\334\001\n\030GetAgentValidationResu" +
      "lt\022>.google.cloud.dialogflow.cx.v3.GetAg" +
      "entValidationResultRequest\0324.google.clou" +
      "d.dialogflow.cx.v3.AgentValidationResult" +
      "\"J\202\323\344\223\002=\022;/v3/{name=projects/*/locations" +
      "/*/agents/*/validationResult}\332A\004name\032x\312A" +
      "\031dialogflow.googleapis.com\322AYhttps://www" +
      ".googleapis.com/auth/cloud-platform,http" +
      "s://www.googleapis.com/auth/dialogflowB\276" +
      "\001\n!com.google.cloud.dialogflow.cx.v3B\nAg" +
      "entProtoP\001Z?google.golang.org/genproto/g" +
      "oogleapis/cloud/dialogflow/cx/v3;cx\370\001\001\242\002" +
      "\002DF\252\002\035Google.Cloud.Dialogflow.Cx.V3\352\002!Go" +
      "ogle::Cloud::Dialogflow::CX::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.cx.v3.AdvancedSettingsProto.getDescriptor(),
          com.google.cloud.dialogflow.cx.v3.FlowProto.getDescriptor(),
          com.google.cloud.dialogflow.cx.v3.SecuritySettingsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_descriptor,
        new java.lang.String[] { "EnableSpeechAdaptation", });
    internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Agent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "DefaultLanguageCode", "SupportedLanguageCodes", "TimeZone", "Description", "AvatarUri", "SpeechToTextSettings", "StartFlow", "SecuritySettings", "EnableStackdriverLogging", "EnableSpellCorrection", "AdvancedSettings", });
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_descriptor,
        new java.lang.String[] { "Agents", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_descriptor,
        new java.lang.String[] { "Parent", "Agent", });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_descriptor,
        new java.lang.String[] { "Agent", "UpdateMask", });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor,
        new java.lang.String[] { "Name", "AgentUri", "Environment", });
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_descriptor,
        new java.lang.String[] { "AgentUri", "AgentContent", "Agent", });
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor,
        new java.lang.String[] { "Name", "AgentUri", "AgentContent", "RestoreOption", "Agent", });
    internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_descriptor,
        new java.lang.String[] { "Name", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_descriptor,
        new java.lang.String[] { "Name", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor,
        new java.lang.String[] { "Name", "FlowValidationResults", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.AdvancedSettingsProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.FlowProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.SecuritySettingsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
