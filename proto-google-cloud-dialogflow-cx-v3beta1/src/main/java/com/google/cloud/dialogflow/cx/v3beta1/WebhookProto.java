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
// source: google/cloud/dialogflow/cx/v3beta1/webhook.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class WebhookProto {
  private WebhookProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_RequestHeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_RequestHeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_ServiceDirectoryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_ServiceDirectoryConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_FulfillmentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_FulfillmentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_IntentParameterValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_IntentParameterValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_SentimentAnalysisResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_SentimentAnalysisResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_FulfillmentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_FulfillmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_ParameterInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_ParameterInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_ParametersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/dialogflow/cx/v3beta1/web"
          + "hook.proto\022\"google.cloud.dialogflow.cx.v"
          + "3beta1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\0329google/cloud/dialogflow/cx/v3beta1/re"
          + "sponse_message.proto\032\036google/protobuf/du"
          + "ration.proto\032\033google/protobuf/empty.prot"
          + "o\032 google/protobuf/field_mask.proto\032\034goo"
          + "gle/protobuf/struct.proto\"\335\006\n\007Webhook\022\014\n"
          + "\004name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\\"
          + "\n\023generic_web_service\030\004 \001(\0132=.google.clo"
          + "ud.dialogflow.cx.v3beta1.Webhook.Generic"
          + "WebServiceH\000\022_\n\021service_directory\030\007 \001(\0132"
          + "B.google.cloud.dialogflow.cx.v3beta1.Web"
          + "hook.ServiceDirectoryConfigH\000\022*\n\007timeout"
          + "\030\006 \001(\0132\031.google.protobuf.Duration\022\020\n\010dis"
          + "abled\030\005 \001(\010\032\364\001\n\021GenericWebService\022\020\n\003uri"
          + "\030\001 \001(\tB\003\340A\002\022\024\n\010username\030\002 \001(\tB\002\030\001\022\024\n\010pas"
          + "sword\030\003 \001(\tB\002\030\001\022j\n\017request_headers\030\004 \003(\013"
          + "2Q.google.cloud.dialogflow.cx.v3beta1.We"
          + "bhook.GenericWebService.RequestHeadersEn"
          + "try\0325\n\023RequestHeadersEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001\032\266\001\n\026ServiceDirectoryC"
          + "onfig\022@\n\007service\030\001 \001(\tB/\340A\002\372A)\n\'serviced"
          + "irectory.googleapis.com/Service\022Z\n\023gener"
          + "ic_web_service\030\002 \001(\0132=.google.cloud.dial"
          + "ogflow.cx.v3beta1.Webhook.GenericWebServ"
          + "ice:q\352An\n!dialogflow.googleapis.com/Webh"
          + "ook\022Iprojects/{project}/locations/{locat"
          + "ion}/agents/{agent}/webhooks/{webhook}B\t"
          + "\n\007webhook\"w\n\023ListWebhooksRequest\0229\n\006pare"
          + "nt\030\001 \001(\tB)\340A\002\372A#\022!dialogflow.googleapis."
          + "com/Webhook\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_t"
          + "oken\030\003 \001(\t\"n\n\024ListWebhooksResponse\022=\n\010we"
          + "bhooks\030\001 \003(\0132+.google.cloud.dialogflow.c"
          + "x.v3beta1.Webhook\022\027\n\017next_page_token\030\002 \001"
          + "(\t\"L\n\021GetWebhookRequest\0227\n\004name\030\001 \001(\tB)\340"
          + "A\002\372A#\n!dialogflow.googleapis.com/Webhook"
          + "\"\224\001\n\024CreateWebhookRequest\0229\n\006parent\030\001 \001("
          + "\tB)\340A\002\372A#\022!dialogflow.googleapis.com/Web"
          + "hook\022A\n\007webhook\030\002 \001(\0132+.google.cloud.dia"
          + "logflow.cx.v3beta1.WebhookB\003\340A\002\"\212\001\n\024Upda"
          + "teWebhookRequest\022A\n\007webhook\030\001 \001(\0132+.goog"
          + "le.cloud.dialogflow.cx.v3beta1.WebhookB\003"
          + "\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.google.protob"
          + "uf.FieldMask\"^\n\024DeleteWebhookRequest\0227\n\004"
          + "name\030\001 \001(\tB)\340A\002\372A#\n!dialogflow.googleapi"
          + "s.com/Webhook\022\r\n\005force\030\002 \001(\010\"\222\n\n\016Webhook"
          + "Request\022!\n\031detect_intent_response_id\030\001 \001"
          + "(\t\022\016\n\004text\030\n \001(\tH\000\022?\n\016trigger_intent\030\013 \001"
          + "(\tB%\372A\"\n dialogflow.googleapis.com/Inten"
          + "tH\000\022\024\n\ntranscript\030\014 \001(\tH\000\022\027\n\rtrigger_eve"
          + "nt\030\016 \001(\tH\000\022\025\n\rlanguage_code\030\017 \001(\t\022\\\n\020ful"
          + "fillment_info\030\006 \001(\0132B.google.cloud.dialo"
          + "gflow.cx.v3beta1.WebhookRequest.Fulfillm"
          + "entInfo\022R\n\013intent_info\030\003 \001(\0132=.google.cl"
          + "oud.dialogflow.cx.v3beta1.WebhookRequest"
          + ".IntentInfo\022?\n\tpage_info\030\004 \001(\0132,.google."
          + "cloud.dialogflow.cx.v3beta1.PageInfo\022E\n\014"
          + "session_info\030\005 \001(\0132/.google.cloud.dialog"
          + "flow.cx.v3beta1.SessionInfo\022E\n\010messages\030"
          + "\007 \003(\01323.google.cloud.dialogflow.cx.v3bet"
          + "a1.ResponseMessage\022(\n\007payload\030\010 \001(\0132\027.go"
          + "ogle.protobuf.Struct\022m\n\031sentiment_analys"
          + "is_result\030\t \001(\0132J.google.cloud.dialogflo"
          + "w.cx.v3beta1.WebhookRequest.SentimentAna"
          + "lysisResult\032\036\n\017FulfillmentInfo\022\013\n\003tag\030\001 "
          + "\001(\t\032\305\003\n\nIntentInfo\022B\n\023last_matched_inten"
          + "t\030\001 \001(\tB%\372A\"\n dialogflow.googleapis.com/"
          + "Intent\022\024\n\014display_name\030\003 \001(\t\022a\n\nparamete"
          + "rs\030\002 \003(\0132M.google.cloud.dialogflow.cx.v3"
          + "beta1.WebhookRequest.IntentInfo.Paramete"
          + "rsEntry\022\022\n\nconfidence\030\004 \001(\002\032^\n\024IntentPar"
          + "ameterValue\022\026\n\016original_value\030\001 \001(\t\022.\n\016r"
          + "esolved_value\030\002 \001(\0132\026.google.protobuf.Va"
          + "lue\032\205\001\n\017ParametersEntry\022\013\n\003key\030\001 \001(\t\022a\n\005"
          + "value\030\002 \001(\0132R.google.cloud.dialogflow.cx"
          + ".v3beta1.WebhookRequest.IntentInfo.Inten"
          + "tParameterValue:\0028\001\032;\n\027SentimentAnalysis"
          + "Result\022\r\n\005score\030\001 \001(\002\022\021\n\tmagnitude\030\002 \001(\002"
          + "B\007\n\005query\"\310\005\n\017WebhookResponse\022e\n\024fulfill"
          + "ment_response\030\001 \001(\0132G.google.cloud.dialo"
          + "gflow.cx.v3beta1.WebhookResponse.Fulfill"
          + "mentResponse\022?\n\tpage_info\030\002 \001(\0132,.google"
          + ".cloud.dialogflow.cx.v3beta1.PageInfo\022E\n"
          + "\014session_info\030\003 \001(\0132/.google.cloud.dialo"
          + "gflow.cx.v3beta1.SessionInfo\022(\n\007payload\030"
          + "\004 \001(\0132\027.google.protobuf.Struct\022:\n\013target"
          + "_page\030\005 \001(\tB#\372A \n\036dialogflow.googleapis."
          + "com/PageH\000\022:\n\013target_flow\030\006 \001(\tB#\372A \n\036di"
          + "alogflow.googleapis.com/FlowH\000\032\225\002\n\023Fulfi"
          + "llmentResponse\022E\n\010messages\030\001 \003(\01323.googl"
          + "e.cloud.dialogflow.cx.v3beta1.ResponseMe"
          + "ssage\022m\n\016merge_behavior\030\002 \001(\0162U.google.c"
          + "loud.dialogflow.cx.v3beta1.WebhookRespon"
          + "se.FulfillmentResponse.MergeBehavior\"H\n\r"
          + "MergeBehavior\022\036\n\032MERGE_BEHAVIOR_UNSPECIF"
          + "IED\020\000\022\n\n\006APPEND\020\001\022\013\n\007REPLACE\020\002B\014\n\ntransi"
          + "tion\"\254\004\n\010PageInfo\0229\n\014current_page\030\001 \001(\tB"
          + "#\372A \n\036dialogflow.googleapis.com/Page\022H\n\t"
          + "form_info\030\003 \001(\01325.google.cloud.dialogflo"
          + "w.cx.v3beta1.PageInfo.FormInfo\032\232\003\n\010FormI"
          + "nfo\022[\n\016parameter_info\030\002 \003(\0132C.google.clo"
          + "ud.dialogflow.cx.v3beta1.PageInfo.FormIn"
          + "fo.ParameterInfo\032\260\002\n\rParameterInfo\022\024\n\014di"
          + "splay_name\030\001 \001(\t\022\020\n\010required\030\002 \001(\010\022a\n\005st"
          + "ate\030\003 \001(\0162R.google.cloud.dialogflow.cx.v"
          + "3beta1.PageInfo.FormInfo.ParameterInfo.P"
          + "arameterState\022%\n\005value\030\004 \001(\0132\026.google.pr"
          + "otobuf.Value\022\026\n\016just_collected\030\005 \001(\010\"U\n\016"
          + "ParameterState\022\037\n\033PARAMETER_STATE_UNSPEC"
          + "IFIED\020\000\022\t\n\005EMPTY\020\001\022\013\n\007INVALID\020\002\022\n\n\006FILLE"
          + "D\020\003\"\346\001\n\013SessionInfo\0227\n\007session\030\001 \001(\tB&\372A"
          + "#\n!dialogflow.googleapis.com/Session\022S\n\n"
          + "parameters\030\002 \003(\0132?.google.cloud.dialogfl"
          + "ow.cx.v3beta1.SessionInfo.ParametersEntr"
          + "y\032I\n\017ParametersEntry\022\013\n\003key\030\001 \001(\t\022%\n\005val"
          + "ue\030\002 \001(\0132\026.google.protobuf.Value:\0028\0012\375\010\n"
          + "\010Webhooks\022\316\001\n\014ListWebhooks\0227.google.clou"
          + "d.dialogflow.cx.v3beta1.ListWebhooksRequ"
          + "est\0328.google.cloud.dialogflow.cx.v3beta1"
          + ".ListWebhooksResponse\"K\202\323\344\223\002<\022:/v3beta1/"
          + "{parent=projects/*/locations/*/agents/*}"
          + "/webhooks\332A\006parent\022\273\001\n\nGetWebhook\0225.goog"
          + "le.cloud.dialogflow.cx.v3beta1.GetWebhoo"
          + "kRequest\032+.google.cloud.dialogflow.cx.v3"
          + "beta1.Webhook\"I\202\323\344\223\002<\022:/v3beta1/{name=pr"
          + "ojects/*/locations/*/agents/*/webhooks/*"
          + "}\332A\004name\022\324\001\n\rCreateWebhook\0228.google.clou"
          + "d.dialogflow.cx.v3beta1.CreateWebhookReq"
          + "uest\032+.google.cloud.dialogflow.cx.v3beta"
          + "1.Webhook\"\\\202\323\344\223\002E\":/v3beta1/{parent=proj"
          + "ects/*/locations/*/agents/*}/webhooks:\007w"
          + "ebhook\332A\016parent,webhook\022\341\001\n\rUpdateWebhoo"
          + "k\0228.google.cloud.dialogflow.cx.v3beta1.U"
          + "pdateWebhookRequest\032+.google.cloud.dialo"
          + "gflow.cx.v3beta1.Webhook\"i\202\323\344\223\002M2B/v3bet"
          + "a1/{webhook.name=projects/*/locations/*/"
          + "agents/*/webhooks/*}:\007webhook\332A\023webhook,"
          + "update_mask\022\254\001\n\rDeleteWebhook\0228.google.c"
          + "loud.dialogflow.cx.v3beta1.DeleteWebhook"
          + "Request\032\026.google.protobuf.Empty\"I\202\323\344\223\002<*"
          + ":/v3beta1/{name=projects/*/locations/*/a"
          + "gents/*/webhooks/*}\332A\004name\032x\312A\031dialogflo"
          + "w.googleapis.com\322AYhttps://www.googleapi"
          + "s.com/auth/cloud-platform,https://www.go"
          + "ogleapis.com/auth/dialogflowB\252\002\n&com.goo"
          + "gle.cloud.dialogflow.cx.v3beta1B\014Webhook"
          + "ProtoP\001ZDgoogle.golang.org/genproto/goog"
          + "leapis/cloud/dialogflow/cx/v3beta1;cx\370\001\001"
          + "\242\002\002DF\252\002\"Google.Cloud.Dialogflow.Cx.V3Bet"
          + "a1\352A|\n\'servicedirectory.googleapis.com/S"
          + "ervice\022Qprojects/{project}/locations/{lo"
          + "cation}/namespaces/{namespace}/services/"
          + "{service}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.ResponseMessageProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "GenericWebService",
              "ServiceDirectory",
              "Timeout",
              "Disabled",
              "Webhook",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_descriptor,
            new java.lang.String[] {
              "Uri", "Username", "Password", "RequestHeaders",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_RequestHeadersEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_RequestHeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_RequestHeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_ServiceDirectoryConfig_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_ServiceDirectoryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_ServiceDirectoryConfig_descriptor,
            new java.lang.String[] {
              "Service", "GenericWebService",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_descriptor,
            new java.lang.String[] {
              "Webhooks", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetWebhookRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Webhook",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateWebhookRequest_descriptor,
            new java.lang.String[] {
              "Webhook", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteWebhookRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor,
            new java.lang.String[] {
              "DetectIntentResponseId",
              "Text",
              "TriggerIntent",
              "Transcript",
              "TriggerEvent",
              "LanguageCode",
              "FulfillmentInfo",
              "IntentInfo",
              "PageInfo",
              "SessionInfo",
              "Messages",
              "Payload",
              "SentimentAnalysisResult",
              "Query",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_FulfillmentInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_FulfillmentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_FulfillmentInfo_descriptor,
            new java.lang.String[] {
              "Tag",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_descriptor,
            new java.lang.String[] {
              "LastMatchedIntent", "DisplayName", "Parameters", "Confidence",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_IntentParameterValue_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_IntentParameterValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_IntentParameterValue_descriptor,
            new java.lang.String[] {
              "OriginalValue", "ResolvedValue",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_ParametersEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_SentimentAnalysisResult_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_SentimentAnalysisResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_SentimentAnalysisResult_descriptor,
            new java.lang.String[] {
              "Score", "Magnitude",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_descriptor,
            new java.lang.String[] {
              "FulfillmentResponse",
              "PageInfo",
              "SessionInfo",
              "Payload",
              "TargetPage",
              "TargetFlow",
              "Transition",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_FulfillmentResponse_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_FulfillmentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_FulfillmentResponse_descriptor,
            new java.lang.String[] {
              "Messages", "MergeBehavior",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_descriptor,
            new java.lang.String[] {
              "CurrentPage", "FormInfo",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_descriptor,
            new java.lang.String[] {
              "ParameterInfo",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_ParameterInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_ParameterInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_ParameterInfo_descriptor,
            new java.lang.String[] {
              "DisplayName", "Required", "State", "Value", "JustCollected",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_descriptor,
            new java.lang.String[] {
              "Session", "Parameters",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_ParametersEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
    com.google.cloud.dialogflow.cx.v3beta1.ResponseMessageProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
