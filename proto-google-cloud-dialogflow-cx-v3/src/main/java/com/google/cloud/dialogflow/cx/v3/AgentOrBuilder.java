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
// source: google/cloud/dialogflow/cx/v3/agent.proto

package com.google.cloud.dialogflow.cx.v3;

public interface AgentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.Agent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the agent.
   * Required for the [Agents.UpdateAgent][google.cloud.dialogflow.cx.v3.Agents.UpdateAgent] method. [Agents.CreateAgent][google.cloud.dialogflow.cx.v3.Agents.CreateAgent]
   * populates the name automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the agent.
   * Required for the [Agents.UpdateAgent][google.cloud.dialogflow.cx.v3.Agents.UpdateAgent] method. [Agents.CreateAgent][google.cloud.dialogflow.cx.v3.Agents.CreateAgent]
   * populates the name automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the agent, unique within the location.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the agent, unique within the location.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The default language of the agent as a language tag.
   * See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * for a list of the currently supported language codes.
   * This field cannot be set by the [Agents.UpdateAgent][google.cloud.dialogflow.cx.v3.Agents.UpdateAgent] method.
   * </pre>
   *
   * <code>
   * string default_language_code = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The defaultLanguageCode.
   */
  java.lang.String getDefaultLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The default language of the agent as a language tag.
   * See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * for a list of the currently supported language codes.
   * This field cannot be set by the [Agents.UpdateAgent][google.cloud.dialogflow.cx.v3.Agents.UpdateAgent] method.
   * </pre>
   *
   * <code>
   * string default_language_code = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for defaultLanguageCode.
   */
  com.google.protobuf.ByteString getDefaultLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The list of all languages supported by the agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4;</code>
   *
   * @return A list containing the supportedLanguageCodes.
   */
  java.util.List<java.lang.String> getSupportedLanguageCodesList();
  /**
   *
   *
   * <pre>
   * The list of all languages supported by the agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4;</code>
   *
   * @return The count of supportedLanguageCodes.
   */
  int getSupportedLanguageCodesCount();
  /**
   *
   *
   * <pre>
   * The list of all languages supported by the agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The supportedLanguageCodes at the given index.
   */
  java.lang.String getSupportedLanguageCodes(int index);
  /**
   *
   *
   * <pre>
   * The list of all languages supported by the agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the supportedLanguageCodes at the given index.
   */
  com.google.protobuf.ByteString getSupportedLanguageCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. The time zone of the agent from the [time zone
   * database](https://www.iana.org/time-zones), e.g., America/New_York,
   * Europe/Paris.
   * </pre>
   *
   * <code>string time_zone = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Required. The time zone of the agent from the [time zone
   * database](https://www.iana.org/time-zones), e.g., America/New_York,
   * Europe/Paris.
   * </pre>
   *
   * <code>string time_zone = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * The description of the agent. The maximum length is 500 characters. If
   * exceeded, the request is rejected.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the agent. The maximum length is 500 characters. If
   * exceeded, the request is rejected.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The URI of the agent's avatar. Avatars are used throughout the Dialogflow
   * console and in the self-hosted [Web
   * Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo)
   * integration.
   * </pre>
   *
   * <code>string avatar_uri = 7;</code>
   *
   * @return The avatarUri.
   */
  java.lang.String getAvatarUri();
  /**
   *
   *
   * <pre>
   * The URI of the agent's avatar. Avatars are used throughout the Dialogflow
   * console and in the self-hosted [Web
   * Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo)
   * integration.
   * </pre>
   *
   * <code>string avatar_uri = 7;</code>
   *
   * @return The bytes for avatarUri.
   */
  com.google.protobuf.ByteString getAvatarUriBytes();

  /**
   *
   *
   * <pre>
   * Speech recognition related settings.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SpeechToTextSettings speech_to_text_settings = 13;</code>
   *
   * @return Whether the speechToTextSettings field is set.
   */
  boolean hasSpeechToTextSettings();
  /**
   *
   *
   * <pre>
   * Speech recognition related settings.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SpeechToTextSettings speech_to_text_settings = 13;</code>
   *
   * @return The speechToTextSettings.
   */
  com.google.cloud.dialogflow.cx.v3.SpeechToTextSettings getSpeechToTextSettings();
  /**
   *
   *
   * <pre>
   * Speech recognition related settings.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SpeechToTextSettings speech_to_text_settings = 13;</code>
   */
  com.google.cloud.dialogflow.cx.v3.SpeechToTextSettingsOrBuilder
      getSpeechToTextSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. Name of the start flow in this agent. A start flow will be automatically
   * created when the agent is created, and can only be deleted by deleting the
   * agent.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>
   * string start_flow = 16 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The startFlow.
   */
  java.lang.String getStartFlow();
  /**
   *
   *
   * <pre>
   * Immutable. Name of the start flow in this agent. A start flow will be automatically
   * created when the agent is created, and can only be deleted by deleting the
   * agent.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>
   * string start_flow = 16 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for startFlow.
   */
  com.google.protobuf.ByteString getStartFlowBytes();

  /**
   *
   *
   * <pre>
   * Name of the [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] reference for the agent.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/securitySettings/&lt;Security Settings ID&gt;`.
   * </pre>
   *
   * <code>string security_settings = 17 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The securitySettings.
   */
  java.lang.String getSecuritySettings();
  /**
   *
   *
   * <pre>
   * Name of the [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] reference for the agent.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/securitySettings/&lt;Security Settings ID&gt;`.
   * </pre>
   *
   * <code>string security_settings = 17 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for securitySettings.
   */
  com.google.protobuf.ByteString getSecuritySettingsBytes();

  /**
   *
   *
   * <pre>
   * Indicates if stackdriver logging is enabled for the agent.
   * Please use [agent.advanced_settings][google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettings]
   * instead.
   * </pre>
   *
   * <code>bool enable_stackdriver_logging = 18 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.cx.v3.Agent.enable_stackdriver_logging is deprecated. See
   *     google/cloud/dialogflow/cx/v3/agent.proto;l=245
   * @return The enableStackdriverLogging.
   */
  @java.lang.Deprecated
  boolean getEnableStackdriverLogging();

  /**
   *
   *
   * <pre>
   * Indicates if automatic spell correction is enabled in detect intent
   * requests.
   * </pre>
   *
   * <code>bool enable_spell_correction = 20;</code>
   *
   * @return The enableSpellCorrection.
   */
  boolean getEnableSpellCorrection();

  /**
   *
   *
   * <pre>
   * Indiciates whether the agent is locked for changes. If the agent is locked,
   * modifications to the agent will be rejected except for [RestoreAgent][].
   * </pre>
   *
   * <code>bool locked = 27;</code>
   *
   * @return The locked.
   */
  boolean getLocked();

  /**
   *
   *
   * <pre>
   * Hierarchical advanced settings for this agent. The settings exposed at the
   * lower level overrides the settings exposed at the higher level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings advanced_settings = 22;</code>
   *
   * @return Whether the advancedSettings field is set.
   */
  boolean hasAdvancedSettings();
  /**
   *
   *
   * <pre>
   * Hierarchical advanced settings for this agent. The settings exposed at the
   * lower level overrides the settings exposed at the higher level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings advanced_settings = 22;</code>
   *
   * @return The advancedSettings.
   */
  com.google.cloud.dialogflow.cx.v3.AdvancedSettings getAdvancedSettings();
  /**
   *
   *
   * <pre>
   * Hierarchical advanced settings for this agent. The settings exposed at the
   * lower level overrides the settings exposed at the higher level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings advanced_settings = 22;</code>
   */
  com.google.cloud.dialogflow.cx.v3.AdvancedSettingsOrBuilder getAdvancedSettingsOrBuilder();
}
