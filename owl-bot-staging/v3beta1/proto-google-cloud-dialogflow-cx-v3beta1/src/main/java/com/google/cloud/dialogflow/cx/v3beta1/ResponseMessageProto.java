// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/response_message.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class ResponseMessageProto {
  private ResponseMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_Text_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_Text_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_LiveAgentHandoff_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_LiveAgentHandoff_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_ConversationSuccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_ConversationSuccess_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_OutputAudioText_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_OutputAudioText_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_EndInteraction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_EndInteraction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_PlayAudio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_PlayAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_Segment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_Segment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/dialogflow/cx/v3beta1/res" +
      "ponse_message.proto\022\"google.cloud.dialog" +
      "flow.cx.v3beta1\032\037google/api/field_behavi" +
      "or.proto\032\034google/protobuf/struct.proto\032\034" +
      "google/api/annotations.proto\"\255\n\n\017Respons" +
      "eMessage\022H\n\004text\030\001 \001(\01328.google.cloud.di" +
      "alogflow.cx.v3beta1.ResponseMessage.Text" +
      "H\000\022*\n\007payload\030\002 \001(\0132\027.google.protobuf.St" +
      "ructH\000\022g\n\024conversation_success\030\t \001(\0132G.g" +
      "oogle.cloud.dialogflow.cx.v3beta1.Respon" +
      "seMessage.ConversationSuccessH\000\022`\n\021outpu" +
      "t_audio_text\030\010 \001(\0132C.google.cloud.dialog" +
      "flow.cx.v3beta1.ResponseMessage.OutputAu" +
      "dioTextH\000\022b\n\022live_agent_handoff\030\n \001(\0132D." +
      "google.cloud.dialogflow.cx.v3beta1.Respo" +
      "nseMessage.LiveAgentHandoffH\000\022b\n\017end_int" +
      "eraction\030\013 \001(\0132B.google.cloud.dialogflow" +
      ".cx.v3beta1.ResponseMessage.EndInteracti" +
      "onB\003\340A\003H\000\022S\n\nplay_audio\030\014 \001(\0132=.google.c" +
      "loud.dialogflow.cx.v3beta1.ResponseMessa" +
      "ge.PlayAudioH\000\022Z\n\013mixed_audio\030\r \001(\0132>.go" +
      "ogle.cloud.dialogflow.cx.v3beta1.Respons" +
      "eMessage.MixedAudioB\003\340A\003H\000\032C\n\004Text\022\021\n\004te" +
      "xt\030\001 \003(\tB\003\340A\002\022(\n\033allow_playback_interrup" +
      "tion\030\002 \001(\010B\003\340A\003\032=\n\020LiveAgentHandoff\022)\n\010m" +
      "etadata\030\001 \001(\0132\027.google.protobuf.Struct\032@" +
      "\n\023ConversationSuccess\022)\n\010metadata\030\001 \001(\0132" +
      "\027.google.protobuf.Struct\032e\n\017OutputAudioT" +
      "ext\022\016\n\004text\030\001 \001(\tH\000\022\016\n\004ssml\030\002 \001(\tH\000\022(\n\033a" +
      "llow_playback_interruption\030\003 \001(\010B\003\340A\003B\010\n" +
      "\006source\032\020\n\016EndInteraction\032M\n\tPlayAudio\022\026" +
      "\n\taudio_uri\030\001 \001(\tB\003\340A\002\022(\n\033allow_playback" +
      "_interruption\030\002 \001(\010B\003\340A\003\032\306\001\n\nMixedAudio\022" +
      "X\n\010segments\030\001 \003(\0132F.google.cloud.dialogf" +
      "low.cx.v3beta1.ResponseMessage.MixedAudi" +
      "o.Segment\032^\n\007Segment\022\017\n\005audio\030\001 \001(\014H\000\022\r\n" +
      "\003uri\030\002 \001(\tH\000\022(\n\033allow_playback_interrupt" +
      "ion\030\003 \001(\010B\003\340A\003B\t\n\007contentB\t\n\007messageB\263\001\n" +
      "&com.google.cloud.dialogflow.cx.v3beta1B" +
      "\024ResponseMessageProtoP\001ZDgoogle.golang.o" +
      "rg/genproto/googleapis/cloud/dialogflow/" +
      "cx/v3beta1;cx\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dia" +
      "logflow.Cx.V3Beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor,
        new java.lang.String[] { "Text", "Payload", "ConversationSuccess", "OutputAudioText", "LiveAgentHandoff", "EndInteraction", "PlayAudio", "MixedAudio", "Message", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_Text_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_Text_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_Text_descriptor,
        new java.lang.String[] { "Text", "AllowPlaybackInterruption", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_LiveAgentHandoff_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_LiveAgentHandoff_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_LiveAgentHandoff_descriptor,
        new java.lang.String[] { "Metadata", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_ConversationSuccess_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_ConversationSuccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_ConversationSuccess_descriptor,
        new java.lang.String[] { "Metadata", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_OutputAudioText_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_OutputAudioText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_OutputAudioText_descriptor,
        new java.lang.String[] { "Text", "Ssml", "AllowPlaybackInterruption", "Source", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_EndInteraction_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_EndInteraction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_EndInteraction_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_PlayAudio_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_PlayAudio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_PlayAudio_descriptor,
        new java.lang.String[] { "AudioUri", "AllowPlaybackInterruption", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_descriptor,
        new java.lang.String[] { "Segments", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_Segment_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_Segment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_Segment_descriptor,
        new java.lang.String[] { "Audio", "Uri", "AllowPlaybackInterruption", "Content", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
