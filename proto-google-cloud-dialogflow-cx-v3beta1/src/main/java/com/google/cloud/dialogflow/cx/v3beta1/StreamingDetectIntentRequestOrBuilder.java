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
// source: google/cloud/dialogflow/cx/v3beta1/session.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface StreamingDetectIntentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.StreamingDetectIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the session this query is sent to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment.
   * It's up to the API caller to choose an appropriate `Session ID`. It can be
   * a random number or some type of session identifiers (preferably hashed).
   * The length of the `Session ID` must not exceed 36 characters.
   * Note: session must be set in the first request.
   * For more information, see the [sessions
   * guide](https://cloud.google.com/dialogflow/cx/docs/concept/session).
   * Note: Always use agent versions for production traffic.
   * See [Versions and
   * environments](https://cloud.google.com/dialogflow/cx/docs/concept/version).
   * </pre>
   *
   * <code>string session = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The session.
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * The name of the session this query is sent to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment.
   * It's up to the API caller to choose an appropriate `Session ID`. It can be
   * a random number or some type of session identifiers (preferably hashed).
   * The length of the `Session ID` must not exceed 36 characters.
   * Note: session must be set in the first request.
   * For more information, see the [sessions
   * guide](https://cloud.google.com/dialogflow/cx/docs/concept/session).
   * Note: Always use agent versions for production traffic.
   * See [Versions and
   * environments](https://cloud.google.com/dialogflow/cx/docs/concept/version).
   * </pre>
   *
   * <code>string session = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.QueryParameters query_params = 2;</code>
   *
   * @return Whether the queryParams field is set.
   */
  boolean hasQueryParams();
  /**
   *
   *
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.QueryParameters query_params = 2;</code>
   *
   * @return The queryParams.
   */
  com.google.cloud.dialogflow.cx.v3beta1.QueryParameters getQueryParams();
  /**
   *
   *
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The input specification.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the queryInput field is set.
   */
  boolean hasQueryInput();
  /**
   *
   *
   * <pre>
   * Required. The input specification.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The queryInput.
   */
  com.google.cloud.dialogflow.cx.v3beta1.QueryInput getQueryInput();
  /**
   *
   *
   * <pre>
   * Required. The input specification.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.QueryInputOrBuilder getQueryInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate the output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig output_audio_config = 4;</code>
   *
   * @return Whether the outputAudioConfig field is set.
   */
  boolean hasOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate the output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig output_audio_config = 4;</code>
   *
   * @return The outputAudioConfig.
   */
  com.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig getOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate the output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig output_audio_config = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();
}
