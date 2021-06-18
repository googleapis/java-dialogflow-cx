// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/session.proto

package com.google.cloud.dialogflow.cx.v3;

public interface QueryResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.QueryResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If [natural language text][google.cloud.dialogflow.cx.v3.TextInput] was provided as input, this field
   * will contain a copy of the text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * If [natural language text][google.cloud.dialogflow.cx.v3.TextInput] was provided as input, this field
   * will contain a copy of the text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * If [natural language text][google.cloud.dialogflow.cx.v3.TextInput] was provided as input, this field
   * will contain a copy of the text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * If an [intent][google.cloud.dialogflow.cx.v3.IntentInput] was provided as input, this field will
   * contain a copy of the intent identifier.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string trigger_intent = 11 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the triggerIntent field is set.
   */
  boolean hasTriggerIntent();
  /**
   * <pre>
   * If an [intent][google.cloud.dialogflow.cx.v3.IntentInput] was provided as input, this field will
   * contain a copy of the intent identifier.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string trigger_intent = 11 [(.google.api.resource_reference) = { ... }</code>
   * @return The triggerIntent.
   */
  java.lang.String getTriggerIntent();
  /**
   * <pre>
   * If an [intent][google.cloud.dialogflow.cx.v3.IntentInput] was provided as input, this field will
   * contain a copy of the intent identifier.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string trigger_intent = 11 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for triggerIntent.
   */
  com.google.protobuf.ByteString
      getTriggerIntentBytes();

  /**
   * <pre>
   * If [natural language speech audio][google.cloud.dialogflow.cx.v3.AudioInput] was provided as input,
   * this field will contain the transcript for the audio.
   * </pre>
   *
   * <code>string transcript = 12;</code>
   * @return Whether the transcript field is set.
   */
  boolean hasTranscript();
  /**
   * <pre>
   * If [natural language speech audio][google.cloud.dialogflow.cx.v3.AudioInput] was provided as input,
   * this field will contain the transcript for the audio.
   * </pre>
   *
   * <code>string transcript = 12;</code>
   * @return The transcript.
   */
  java.lang.String getTranscript();
  /**
   * <pre>
   * If [natural language speech audio][google.cloud.dialogflow.cx.v3.AudioInput] was provided as input,
   * this field will contain the transcript for the audio.
   * </pre>
   *
   * <code>string transcript = 12;</code>
   * @return The bytes for transcript.
   */
  com.google.protobuf.ByteString
      getTranscriptBytes();

  /**
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as input, this field will contain
   * the name of the event.
   * </pre>
   *
   * <code>string trigger_event = 14;</code>
   * @return Whether the triggerEvent field is set.
   */
  boolean hasTriggerEvent();
  /**
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as input, this field will contain
   * the name of the event.
   * </pre>
   *
   * <code>string trigger_event = 14;</code>
   * @return The triggerEvent.
   */
  java.lang.String getTriggerEvent();
  /**
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as input, this field will contain
   * the name of the event.
   * </pre>
   *
   * <code>string trigger_event = 14;</code>
   * @return The bytes for triggerEvent.
   */
  com.google.protobuf.ByteString
      getTriggerEventBytes();

  /**
   * <pre>
   * The language that was triggered during intent detection.
   * See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * The language that was triggered during intent detection.
   * See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * The collected [session parameters][google.cloud.dialogflow.cx.v3.SessionInfo.parameters].
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: depending on parameter value type, could be one of string,
   *         number, boolean, null, list or map
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * The collected [session parameters][google.cloud.dialogflow.cx.v3.SessionInfo.parameters].
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: depending on parameter value type, could be one of string,
   *         number, boolean, null, list or map
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   * @return The parameters.
   */
  com.google.protobuf.Struct getParameters();
  /**
   * <pre>
   * The collected [session parameters][google.cloud.dialogflow.cx.v3.SessionInfo.parameters].
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: depending on parameter value type, could be one of string,
   *         number, boolean, null, list or map
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();

  /**
   * <pre>
   * The list of rich messages returned to the client. Responses vary from
   * simple text messages to more sophisticated, structured payloads used
   * to drive complex logic.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage response_messages = 4;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.ResponseMessage> 
      getResponseMessagesList();
  /**
   * <pre>
   * The list of rich messages returned to the client. Responses vary from
   * simple text messages to more sophisticated, structured payloads used
   * to drive complex logic.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage response_messages = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ResponseMessage getResponseMessages(int index);
  /**
   * <pre>
   * The list of rich messages returned to the client. Responses vary from
   * simple text messages to more sophisticated, structured payloads used
   * to drive complex logic.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage response_messages = 4;</code>
   */
  int getResponseMessagesCount();
  /**
   * <pre>
   * The list of rich messages returned to the client. Responses vary from
   * simple text messages to more sophisticated, structured payloads used
   * to drive complex logic.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage response_messages = 4;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.ResponseMessageOrBuilder> 
      getResponseMessagesOrBuilderList();
  /**
   * <pre>
   * The list of rich messages returned to the client. Responses vary from
   * simple text messages to more sophisticated, structured payloads used
   * to drive complex logic.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage response_messages = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ResponseMessageOrBuilder getResponseMessagesOrBuilder(
      int index);

  /**
   * <pre>
   * The list of webhook call status in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.rpc.Status webhook_statuses = 13;</code>
   */
  java.util.List<com.google.rpc.Status> 
      getWebhookStatusesList();
  /**
   * <pre>
   * The list of webhook call status in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.rpc.Status webhook_statuses = 13;</code>
   */
  com.google.rpc.Status getWebhookStatuses(int index);
  /**
   * <pre>
   * The list of webhook call status in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.rpc.Status webhook_statuses = 13;</code>
   */
  int getWebhookStatusesCount();
  /**
   * <pre>
   * The list of webhook call status in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.rpc.Status webhook_statuses = 13;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> 
      getWebhookStatusesOrBuilderList();
  /**
   * <pre>
   * The list of webhook call status in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.rpc.Status webhook_statuses = 13;</code>
   */
  com.google.rpc.StatusOrBuilder getWebhookStatusesOrBuilder(
      int index);

  /**
   * <pre>
   * The list of webhook payload in [WebhookResponse.payload][google.cloud.dialogflow.cx.v3.WebhookResponse.payload], in
   * the order of call sequence. If some webhook call fails or doesn't return
   * any payload, an empty `Struct` would be used instead.
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct webhook_payloads = 6;</code>
   */
  java.util.List<com.google.protobuf.Struct> 
      getWebhookPayloadsList();
  /**
   * <pre>
   * The list of webhook payload in [WebhookResponse.payload][google.cloud.dialogflow.cx.v3.WebhookResponse.payload], in
   * the order of call sequence. If some webhook call fails or doesn't return
   * any payload, an empty `Struct` would be used instead.
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct webhook_payloads = 6;</code>
   */
  com.google.protobuf.Struct getWebhookPayloads(int index);
  /**
   * <pre>
   * The list of webhook payload in [WebhookResponse.payload][google.cloud.dialogflow.cx.v3.WebhookResponse.payload], in
   * the order of call sequence. If some webhook call fails or doesn't return
   * any payload, an empty `Struct` would be used instead.
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct webhook_payloads = 6;</code>
   */
  int getWebhookPayloadsCount();
  /**
   * <pre>
   * The list of webhook payload in [WebhookResponse.payload][google.cloud.dialogflow.cx.v3.WebhookResponse.payload], in
   * the order of call sequence. If some webhook call fails or doesn't return
   * any payload, an empty `Struct` would be used instead.
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct webhook_payloads = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.StructOrBuilder> 
      getWebhookPayloadsOrBuilderList();
  /**
   * <pre>
   * The list of webhook payload in [WebhookResponse.payload][google.cloud.dialogflow.cx.v3.WebhookResponse.payload], in
   * the order of call sequence. If some webhook call fails or doesn't return
   * any payload, an empty `Struct` would be used instead.
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct webhook_payloads = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getWebhookPayloadsOrBuilder(
      int index);

  /**
   * <pre>
   * The current [Page][google.cloud.dialogflow.cx.v3.Page]. Some, not all fields are filled in this message,
   * including but not limited to `name` and `display_name`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page current_page = 7;</code>
   * @return Whether the currentPage field is set.
   */
  boolean hasCurrentPage();
  /**
   * <pre>
   * The current [Page][google.cloud.dialogflow.cx.v3.Page]. Some, not all fields are filled in this message,
   * including but not limited to `name` and `display_name`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page current_page = 7;</code>
   * @return The currentPage.
   */
  com.google.cloud.dialogflow.cx.v3.Page getCurrentPage();
  /**
   * <pre>
   * The current [Page][google.cloud.dialogflow.cx.v3.Page]. Some, not all fields are filled in this message,
   * including but not limited to `name` and `display_name`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page current_page = 7;</code>
   */
  com.google.cloud.dialogflow.cx.v3.PageOrBuilder getCurrentPageOrBuilder();

  /**
   * <pre>
   * The [Intent][google.cloud.dialogflow.cx.v3.Intent] that matched the conversational query. Some, not all fields
   * are filled in this message, including but not limited to: `name` and
   * `display_name`.
   * This field is deprecated, please use [QueryResult.match][google.cloud.dialogflow.cx.v3.QueryResult.match] instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 8 [deprecated = true];</code>
   * @return Whether the intent field is set.
   */
  @java.lang.Deprecated boolean hasIntent();
  /**
   * <pre>
   * The [Intent][google.cloud.dialogflow.cx.v3.Intent] that matched the conversational query. Some, not all fields
   * are filled in this message, including but not limited to: `name` and
   * `display_name`.
   * This field is deprecated, please use [QueryResult.match][google.cloud.dialogflow.cx.v3.QueryResult.match] instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 8 [deprecated = true];</code>
   * @return The intent.
   */
  @java.lang.Deprecated com.google.cloud.dialogflow.cx.v3.Intent getIntent();
  /**
   * <pre>
   * The [Intent][google.cloud.dialogflow.cx.v3.Intent] that matched the conversational query. Some, not all fields
   * are filled in this message, including but not limited to: `name` and
   * `display_name`.
   * This field is deprecated, please use [QueryResult.match][google.cloud.dialogflow.cx.v3.QueryResult.match] instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 8 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.cloud.dialogflow.cx.v3.IntentOrBuilder getIntentOrBuilder();

  /**
   * <pre>
   * The intent detection confidence. Values range from 0.0 (completely
   * uncertain) to 1.0 (completely certain).
   * This value is for informational purpose only and is only used to
   * help match the best intent within the classification threshold.
   * This value may change for the same end-user expression at any time due to a
   * model retraining or change in implementation.
   * This field is deprecated, please use [QueryResult.match][google.cloud.dialogflow.cx.v3.QueryResult.match] instead.
   * </pre>
   *
   * <code>float intent_detection_confidence = 9 [deprecated = true];</code>
   * @return The intentDetectionConfidence.
   */
  @java.lang.Deprecated float getIntentDetectionConfidence();

  /**
   * <pre>
   * Intent match result, could be an intent or an event.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match match = 15;</code>
   * @return Whether the match field is set.
   */
  boolean hasMatch();
  /**
   * <pre>
   * Intent match result, could be an intent or an event.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match match = 15;</code>
   * @return The match.
   */
  com.google.cloud.dialogflow.cx.v3.Match getMatch();
  /**
   * <pre>
   * Intent match result, could be an intent or an event.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match match = 15;</code>
   */
  com.google.cloud.dialogflow.cx.v3.MatchOrBuilder getMatchOrBuilder();

  /**
   * <pre>
   * The free-form diagnostic info. For example, this field could contain
   * webhook call latency. The string keys of the Struct's fields map can change
   * without notice.
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 10;</code>
   * @return Whether the diagnosticInfo field is set.
   */
  boolean hasDiagnosticInfo();
  /**
   * <pre>
   * The free-form diagnostic info. For example, this field could contain
   * webhook call latency. The string keys of the Struct's fields map can change
   * without notice.
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 10;</code>
   * @return The diagnosticInfo.
   */
  com.google.protobuf.Struct getDiagnosticInfo();
  /**
   * <pre>
   * The free-form diagnostic info. For example, this field could contain
   * webhook call latency. The string keys of the Struct's fields map can change
   * without notice.
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 10;</code>
   */
  com.google.protobuf.StructOrBuilder getDiagnosticInfoOrBuilder();

  /**
   * <pre>
   * The sentiment analyss result, which depends on
   * [`analyze_query_text_sentiment`]
   * [google.cloud.dialogflow.cx.v3.QueryParameters.analyze_query_text_sentiment], specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult sentiment_analysis_result = 17;</code>
   * @return Whether the sentimentAnalysisResult field is set.
   */
  boolean hasSentimentAnalysisResult();
  /**
   * <pre>
   * The sentiment analyss result, which depends on
   * [`analyze_query_text_sentiment`]
   * [google.cloud.dialogflow.cx.v3.QueryParameters.analyze_query_text_sentiment], specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult sentiment_analysis_result = 17;</code>
   * @return The sentimentAnalysisResult.
   */
  com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult getSentimentAnalysisResult();
  /**
   * <pre>
   * The sentiment analyss result, which depends on
   * [`analyze_query_text_sentiment`]
   * [google.cloud.dialogflow.cx.v3.QueryParameters.analyze_query_text_sentiment], specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult sentiment_analysis_result = 17;</code>
   */
  com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResultOrBuilder getSentimentAnalysisResultOrBuilder();

  public com.google.cloud.dialogflow.cx.v3.QueryResult.QueryCase getQueryCase();
}