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
// source: google/cloud/dialogflow/cx/v3beta1/audio_config.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class AudioConfigProto {
  private AudioConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechWordInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechWordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SynthesizeSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_OutputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_OutputAudioConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/dialogflow/cx/v3beta1/aud"
          + "io_config.proto\022\"google.cloud.dialogflow"
          + ".cx.v3beta1\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032\036google/"
          + "protobuf/duration.proto\"\222\001\n\016SpeechWordIn"
          + "fo\022\014\n\004word\030\003 \001(\t\022/\n\014start_offset\030\001 \001(\0132\031"
          + ".google.protobuf.Duration\022-\n\nend_offset\030"
          + "\002 \001(\0132\031.google.protobuf.Duration\022\022\n\nconf"
          + "idence\030\004 \001(\002\"\245\002\n\020InputAudioConfig\022N\n\016aud"
          + "io_encoding\030\001 \001(\01621.google.cloud.dialogf"
          + "low.cx.v3beta1.AudioEncodingB\003\340A\002\022\031\n\021sam"
          + "ple_rate_hertz\030\002 \001(\005\022\030\n\020enable_word_info"
          + "\030\r \001(\010\022\024\n\014phrase_hints\030\004 \003(\t\022\r\n\005model\030\007 "
          + "\001(\t\022M\n\rmodel_variant\030\n \001(\01626.google.clou"
          + "d.dialogflow.cx.v3beta1.SpeechModelVaria"
          + "nt\022\030\n\020single_utterance\030\010 \001(\010\"n\n\024VoiceSel"
          + "ectionParams\022\014\n\004name\030\001 \001(\t\022H\n\013ssml_gende"
          + "r\030\002 \001(\01623.google.cloud.dialogflow.cx.v3b"
          + "eta1.SsmlVoiceGender\"\273\001\n\026SynthesizeSpeec"
          + "hConfig\022\025\n\rspeaking_rate\030\001 \001(\001\022\r\n\005pitch\030"
          + "\002 \001(\001\022\026\n\016volume_gain_db\030\003 \001(\001\022\032\n\022effects"
          + "_profile_id\030\005 \003(\t\022G\n\005voice\030\004 \001(\01328.googl"
          + "e.cloud.dialogflow.cx.v3beta1.VoiceSelec"
          + "tionParams\"\342\001\n\021OutputAudioConfig\022T\n\016audi"
          + "o_encoding\030\001 \001(\01627.google.cloud.dialogfl"
          + "ow.cx.v3beta1.OutputAudioEncodingB\003\340A\002\022\031"
          + "\n\021sample_rate_hertz\030\002 \001(\005\022\\\n\030synthesize_"
          + "speech_config\030\003 \001(\0132:.google.cloud.dialo"
          + "gflow.cx.v3beta1.SynthesizeSpeechConfig*"
          + "\373\001\n\rAudioEncoding\022\036\n\032AUDIO_ENCODING_UNSP"
          + "ECIFIED\020\000\022\034\n\030AUDIO_ENCODING_LINEAR_16\020\001\022"
          + "\027\n\023AUDIO_ENCODING_FLAC\020\002\022\030\n\024AUDIO_ENCODI"
          + "NG_MULAW\020\003\022\026\n\022AUDIO_ENCODING_AMR\020\004\022\031\n\025AU"
          + "DIO_ENCODING_AMR_WB\020\005\022\033\n\027AUDIO_ENCODING_"
          + "OGG_OPUS\020\006\022)\n%AUDIO_ENCODING_SPEEX_WITH_"
          + "HEADER_BYTE\020\007*v\n\022SpeechModelVariant\022$\n S"
          + "PEECH_MODEL_VARIANT_UNSPECIFIED\020\000\022\026\n\022USE"
          + "_BEST_AVAILABLE\020\001\022\020\n\014USE_STANDARD\020\002\022\020\n\014U"
          + "SE_ENHANCED\020\003*\215\001\n\017SsmlVoiceGender\022!\n\035SSM"
          + "L_VOICE_GENDER_UNSPECIFIED\020\000\022\032\n\026SSML_VOI"
          + "CE_GENDER_MALE\020\001\022\034\n\030SSML_VOICE_GENDER_FE"
          + "MALE\020\002\022\035\n\031SSML_VOICE_GENDER_NEUTRAL\020\003*\354\001"
          + "\n\023OutputAudioEncoding\022%\n!OUTPUT_AUDIO_EN"
          + "CODING_UNSPECIFIED\020\000\022#\n\037OUTPUT_AUDIO_ENC"
          + "ODING_LINEAR_16\020\001\022\035\n\031OUTPUT_AUDIO_ENCODI"
          + "NG_MP3\020\002\022%\n!OUTPUT_AUDIO_ENCODING_MP3_64"
          + "_KBPS\020\004\022\"\n\036OUTPUT_AUDIO_ENCODING_OGG_OPU"
          + "S\020\003\022\037\n\033OUTPUT_AUDIO_ENCODING_MULAW\020\005B\242\002\n"
          + "&com.google.cloud.dialogflow.cx.v3beta1B"
          + "\020AudioConfigProtoP\001Z6cloud.google.com/go"
          + "/dialogflow/cx/apiv3beta1/cxpb;cxpb\370\001\001\242\002"
          + "\002DF\252\002\"Google.Cloud.Dialogflow.Cx.V3Beta1"
          + "\352\002&Google::Cloud::Dialogflow::CX::V3beta"
          + "1\352AU\n\033automl.googleapis.com/Model\0226proje"
          + "cts/{project}/locations/{location}/model"
          + "s/{model}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechWordInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechWordInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechWordInfo_descriptor,
            new java.lang.String[] {
              "Word", "StartOffset", "EndOffset", "Confidence",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SampleRateHertz",
              "EnableWordInfo",
              "PhraseHints",
              "Model",
              "ModelVariant",
              "SingleUtterance",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "Name", "SsmlGender",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SynthesizeSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SynthesizeSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SynthesizeSpeechConfig_descriptor,
            new java.lang.String[] {
              "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_OutputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_OutputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_OutputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
