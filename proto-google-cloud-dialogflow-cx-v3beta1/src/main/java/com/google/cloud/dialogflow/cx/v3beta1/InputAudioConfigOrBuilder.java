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

public interface InputAudioConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.InputAudioConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the audio content to process.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.AudioEncoding audio_encoding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for audioEncoding.
   */
  int getAudioEncodingValue();
  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the audio content to process.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.AudioEncoding audio_encoding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The audioEncoding.
   */
  com.google.cloud.dialogflow.cx.v3beta1.AudioEncoding getAudioEncoding();

  /**
   *
   *
   * <pre>
   * Sample rate (in Hertz) of the audio content sent in the query.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
   * more details.
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   *
   * @return The sampleRateHertz.
   */
  int getSampleRateHertz();

  /**
   *
   *
   * <pre>
   * Optional. If `true`, Dialogflow returns [SpeechWordInfo][google.cloud.dialogflow.cx.v3beta1.SpeechWordInfo] in
   * [StreamingRecognitionResult][google.cloud.dialogflow.cx.v3beta1.StreamingRecognitionResult] with information about the recognized speech
   * words, e.g. start and end time offsets. If false or unspecified, Speech
   * doesn't return any word-level information.
   * </pre>
   *
   * <code>bool enable_word_info = 13;</code>
   *
   * @return The enableWordInfo.
   */
  boolean getEnableWordInfo();

  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   *
   * @return A list containing the phraseHints.
   */
  java.util.List<java.lang.String> getPhraseHintsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   *
   * @return The count of phraseHints.
   */
  int getPhraseHintsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The phraseHints at the given index.
   */
  java.lang.String getPhraseHints(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the phraseHints at the given index.
   */
  com.google.protobuf.ByteString getPhraseHintsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Which Speech model to select for the given request. Select the
   * model best suited to your domain to get best results. If a model is not
   * explicitly specified, then we auto-select a model based on the parameters
   * in the InputAudioConfig.
   * If enhanced speech model is enabled for the agent and an enhanced
   * version of the specified model for the language does not exist, then the
   * speech is recognized using the standard version of the specified model.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
   * for more details.
   * </pre>
   *
   * <code>string model = 7;</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Optional. Which Speech model to select for the given request. Select the
   * model best suited to your domain to get best results. If a model is not
   * explicitly specified, then we auto-select a model based on the parameters
   * in the InputAudioConfig.
   * If enhanced speech model is enabled for the agent and an enhanced
   * version of the specified model for the language does not exist, then the
   * speech is recognized using the standard version of the specified model.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
   * for more details.
   * </pre>
   *
   * <code>string model = 7;</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Optional. Which variant of the [Speech model][google.cloud.dialogflow.cx.v3beta1.InputAudioConfig.model] to use.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.SpeechModelVariant model_variant = 10;</code>
   *
   * @return The enum numeric value on the wire for modelVariant.
   */
  int getModelVariantValue();
  /**
   *
   *
   * <pre>
   * Optional. Which variant of the [Speech model][google.cloud.dialogflow.cx.v3beta1.InputAudioConfig.model] to use.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.SpeechModelVariant model_variant = 10;</code>
   *
   * @return The modelVariant.
   */
  com.google.cloud.dialogflow.cx.v3beta1.SpeechModelVariant getModelVariant();

  /**
   *
   *
   * <pre>
   * Optional. If `false` (default), recognition does not cease until the
   * client closes the stream.
   * If `true`, the recognizer will detect a single spoken utterance in input
   * audio. Recognition ceases when it detects the audio's voice has
   * stopped or paused. In this case, once a detected intent is received, the
   * client should close the stream and start a new request with a new stream as
   * needed.
   * Note: This setting is relevant only for streaming methods.
   * </pre>
   *
   * <code>bool single_utterance = 8;</code>
   *
   * @return The singleUtterance.
   */
  boolean getSingleUtterance();
}
