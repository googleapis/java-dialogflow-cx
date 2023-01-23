// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/session.proto

package com.google.cloud.dialogflow.cx.v3;

public interface StreamingRecognitionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.StreamingRecognitionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of the result message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.StreamingRecognitionResult.MessageType message_type = 1;</code>
   * @return The enum numeric value on the wire for messageType.
   */
  int getMessageTypeValue();
  /**
   * <pre>
   * Type of the result message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.StreamingRecognitionResult.MessageType message_type = 1;</code>
   * @return The messageType.
   */
  com.google.cloud.dialogflow.cx.v3.StreamingRecognitionResult.MessageType getMessageType();

  /**
   * <pre>
   * Transcript text representing the words that the user spoke.
   * Populated if and only if `message_type` = `TRANSCRIPT`.
   * </pre>
   *
   * <code>string transcript = 2;</code>
   * @return The transcript.
   */
  java.lang.String getTranscript();
  /**
   * <pre>
   * Transcript text representing the words that the user spoke.
   * Populated if and only if `message_type` = `TRANSCRIPT`.
   * </pre>
   *
   * <code>string transcript = 2;</code>
   * @return The bytes for transcript.
   */
  com.google.protobuf.ByteString
      getTranscriptBytes();

  /**
   * <pre>
   * If `false`, the `StreamingRecognitionResult` represents an
   * interim result that may change. If `true`, the recognizer will not return
   * any further hypotheses about this piece of the audio. May only be populated
   * for `message_type` = `TRANSCRIPT`.
   * </pre>
   *
   * <code>bool is_final = 3;</code>
   * @return The isFinal.
   */
  boolean getIsFinal();

  /**
   * <pre>
   * The Speech confidence between 0.0 and 1.0 for the current portion of audio.
   * A higher number indicates an estimated greater likelihood that the
   * recognized words are correct. The default of 0.0 is a sentinel value
   * indicating that confidence was not set.
   * This field is typically only provided if `is_final` is true and you should
   * not rely on it being accurate or even set.
   * </pre>
   *
   * <code>float confidence = 4;</code>
   * @return The confidence.
   */
  float getConfidence();

  /**
   * <pre>
   * An estimate of the likelihood that the speech recognizer will
   * not change its guess about this interim recognition result:
   * * If the value is unspecified or 0.0, Dialogflow didn't compute the
   *   stability. In particular, Dialogflow will only provide stability for
   *   `TRANSCRIPT` results with `is_final = false`.
   * * Otherwise, the value is in (0.0, 1.0] where 0.0 means completely
   *   unstable and 1.0 means completely stable.
   * </pre>
   *
   * <code>float stability = 6;</code>
   * @return The stability.
   */
  float getStability();

  /**
   * <pre>
   * Word-specific information for the words recognized by Speech in
   * [transcript][google.cloud.dialogflow.cx.v3.StreamingRecognitionResult.transcript].
   * Populated if and only if `message_type` = `TRANSCRIPT` and
   * [InputAudioConfig.enable_word_info] is set.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.SpeechWordInfo speech_word_info = 7;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.SpeechWordInfo> 
      getSpeechWordInfoList();
  /**
   * <pre>
   * Word-specific information for the words recognized by Speech in
   * [transcript][google.cloud.dialogflow.cx.v3.StreamingRecognitionResult.transcript].
   * Populated if and only if `message_type` = `TRANSCRIPT` and
   * [InputAudioConfig.enable_word_info] is set.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.SpeechWordInfo speech_word_info = 7;</code>
   */
  com.google.cloud.dialogflow.cx.v3.SpeechWordInfo getSpeechWordInfo(int index);
  /**
   * <pre>
   * Word-specific information for the words recognized by Speech in
   * [transcript][google.cloud.dialogflow.cx.v3.StreamingRecognitionResult.transcript].
   * Populated if and only if `message_type` = `TRANSCRIPT` and
   * [InputAudioConfig.enable_word_info] is set.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.SpeechWordInfo speech_word_info = 7;</code>
   */
  int getSpeechWordInfoCount();
  /**
   * <pre>
   * Word-specific information for the words recognized by Speech in
   * [transcript][google.cloud.dialogflow.cx.v3.StreamingRecognitionResult.transcript].
   * Populated if and only if `message_type` = `TRANSCRIPT` and
   * [InputAudioConfig.enable_word_info] is set.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.SpeechWordInfo speech_word_info = 7;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.SpeechWordInfoOrBuilder> 
      getSpeechWordInfoOrBuilderList();
  /**
   * <pre>
   * Word-specific information for the words recognized by Speech in
   * [transcript][google.cloud.dialogflow.cx.v3.StreamingRecognitionResult.transcript].
   * Populated if and only if `message_type` = `TRANSCRIPT` and
   * [InputAudioConfig.enable_word_info] is set.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.SpeechWordInfo speech_word_info = 7;</code>
   */
  com.google.cloud.dialogflow.cx.v3.SpeechWordInfoOrBuilder getSpeechWordInfoOrBuilder(
      int index);

  /**
   * <pre>
   * Time offset of the end of this Speech recognition result relative to the
   * beginning of the audio. Only populated for `message_type` =
   * `TRANSCRIPT`.
   * </pre>
   *
   * <code>.google.protobuf.Duration speech_end_offset = 8;</code>
   * @return Whether the speechEndOffset field is set.
   */
  boolean hasSpeechEndOffset();
  /**
   * <pre>
   * Time offset of the end of this Speech recognition result relative to the
   * beginning of the audio. Only populated for `message_type` =
   * `TRANSCRIPT`.
   * </pre>
   *
   * <code>.google.protobuf.Duration speech_end_offset = 8;</code>
   * @return The speechEndOffset.
   */
  com.google.protobuf.Duration getSpeechEndOffset();
  /**
   * <pre>
   * Time offset of the end of this Speech recognition result relative to the
   * beginning of the audio. Only populated for `message_type` =
   * `TRANSCRIPT`.
   * </pre>
   *
   * <code>.google.protobuf.Duration speech_end_offset = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getSpeechEndOffsetOrBuilder();

  /**
   * <pre>
   * Detected language code for the transcript.
   * </pre>
   *
   * <code>string language_code = 10;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Detected language code for the transcript.
   * </pre>
   *
   * <code>string language_code = 10;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();
}