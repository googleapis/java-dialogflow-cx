// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/audio_config.proto

package com.google.cloud.dialogflow.cx.v3;

public interface VoiceSelectionParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.VoiceSelectionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The name of the voice. If not set, the service will choose a
   * voice based on the other parameters such as language_code and
   * [ssml_gender][google.cloud.dialogflow.cx.v3.VoiceSelectionParams.ssml_gender].
   * For the list of available voices, please refer to [Supported voices and
   * languages](https://cloud.google.com/text-to-speech/docs/voices).
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Optional. The name of the voice. If not set, the service will choose a
   * voice based on the other parameters such as language_code and
   * [ssml_gender][google.cloud.dialogflow.cx.v3.VoiceSelectionParams.ssml_gender].
   * For the list of available voices, please refer to [Supported voices and
   * languages](https://cloud.google.com/text-to-speech/docs/voices).
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. The preferred gender of the voice. If not set, the service will
   * choose a voice based on the other parameters such as language_code and
   * [name][google.cloud.dialogflow.cx.v3.VoiceSelectionParams.name]. Note that this is only a preference, not requirement. If a
   * voice of the appropriate gender is not available, the synthesizer
   * substitutes a voice with a different gender rather than failing the
   * request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SsmlVoiceGender ssml_gender = 2;</code>
   * @return The enum numeric value on the wire for ssmlGender.
   */
  int getSsmlGenderValue();
  /**
   * <pre>
   * Optional. The preferred gender of the voice. If not set, the service will
   * choose a voice based on the other parameters such as language_code and
   * [name][google.cloud.dialogflow.cx.v3.VoiceSelectionParams.name]. Note that this is only a preference, not requirement. If a
   * voice of the appropriate gender is not available, the synthesizer
   * substitutes a voice with a different gender rather than failing the
   * request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SsmlVoiceGender ssml_gender = 2;</code>
   * @return The ssmlGender.
   */
  com.google.cloud.dialogflow.cx.v3.SsmlVoiceGender getSsmlGender();
}
