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
// source: google/cloud/dialogflow/cx/v3beta1/intent.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface IntentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.Intent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the intent.
   * Required for the [Intents.UpdateIntent][google.cloud.dialogflow.cx.v3beta1.Intents.UpdateIntent] method. [Intents.CreateIntent][google.cloud.dialogflow.cx.v3beta1.Intents.CreateIntent]
   * populates the name automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
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
   * The unique identifier of the intent.
   * Required for the [Intents.UpdateIntent][google.cloud.dialogflow.cx.v3beta1.Intents.UpdateIntent] method. [Intents.CreateIntent][google.cloud.dialogflow.cx.v3beta1.Intents.CreateIntent]
   * populates the name automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
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
   * Required. The human-readable name of the intent, unique within the agent.
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
   * Required. The human-readable name of the intent, unique within the agent.
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
   * The collection of training phrases the agent is trained on to identify the
   * intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase training_phrases = 3;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase>
      getTrainingPhrasesList();
  /**
   *
   *
   * <pre>
   * The collection of training phrases the agent is trained on to identify the
   * intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase training_phrases = 3;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase getTrainingPhrases(int index);
  /**
   *
   *
   * <pre>
   * The collection of training phrases the agent is trained on to identify the
   * intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase training_phrases = 3;
   * </code>
   */
  int getTrainingPhrasesCount();
  /**
   *
   *
   * <pre>
   * The collection of training phrases the agent is trained on to identify the
   * intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase training_phrases = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhraseOrBuilder>
      getTrainingPhrasesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The collection of training phrases the agent is trained on to identify the
   * intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase training_phrases = 3;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhraseOrBuilder getTrainingPhrasesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Intent.Parameter parameters = 4;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Intent.Parameter> getParametersList();
  /**
   *
   *
   * <pre>
   * The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Intent.Parameter parameters = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Intent.Parameter getParameters(int index);
  /**
   *
   *
   * <pre>
   * The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Intent.Parameter parameters = 4;</code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Intent.Parameter parameters = 4;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.Intent.ParameterOrBuilder>
      getParametersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Intent.Parameter parameters = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Intent.ParameterOrBuilder getParametersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The priority of this intent. Higher numbers represent higher
   * priorities.
   * - If the supplied value is unspecified or 0, the service
   *   translates the value to 500,000, which corresponds to the
   *   `Normal` priority in the console.
   * - If the supplied value is negative, the intent is ignored
   *   in runtime detect intent requests.
   * </pre>
   *
   * <code>int32 priority = 5;</code>
   *
   * @return The priority.
   */
  int getPriority();

  /**
   *
   *
   * <pre>
   * Indicates whether this is a fallback intent. Currently only default
   * fallback intent is allowed in the agent, which is added upon agent
   * creation.
   * Adding training phrases to fallback intent is useful in the case of
   * requests that are mistakenly matched, since training phrases assigned to
   * fallback intents act as negative examples that triggers no-match event.
   * </pre>
   *
   * <code>bool is_fallback = 6;</code>
   *
   * @return The isFallback.
   */
  boolean getIsFallback();

  /**
   *
   *
   * <pre>
   * The key/value metadata to label an intent. Labels can contain
   * lowercase letters, digits and the symbols '-' and '_'. International
   * characters are allowed, including letters from unicase alphabets. Keys must
   * start with a letter. Keys and values can be no longer than 63 characters
   * and no more than 128 bytes.
   * Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed
   * Dialogflow defined labels include:
   * * sys-head
   * * sys-contextual
   * The above labels do not require value. "sys-head" means the intent is a
   * head intent. "sys-contextual" means the intent is a contextual intent.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The key/value metadata to label an intent. Labels can contain
   * lowercase letters, digits and the symbols '-' and '_'. International
   * characters are allowed, including letters from unicase alphabets. Keys must
   * start with a letter. Keys and values can be no longer than 63 characters
   * and no more than 128 bytes.
   * Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed
   * Dialogflow defined labels include:
   * * sys-head
   * * sys-contextual
   * The above labels do not require value. "sys-head" means the intent is a
   * head intent. "sys-contextual" means the intent is a contextual intent.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The key/value metadata to label an intent. Labels can contain
   * lowercase letters, digits and the symbols '-' and '_'. International
   * characters are allowed, including letters from unicase alphabets. Keys must
   * start with a letter. Keys and values can be no longer than 63 characters
   * and no more than 128 bytes.
   * Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed
   * Dialogflow defined labels include:
   * * sys-head
   * * sys-contextual
   * The above labels do not require value. "sys-head" means the intent is a
   * head intent. "sys-contextual" means the intent is a contextual intent.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The key/value metadata to label an intent. Labels can contain
   * lowercase letters, digits and the symbols '-' and '_'. International
   * characters are allowed, including letters from unicase alphabets. Keys must
   * start with a letter. Keys and values can be no longer than 63 characters
   * and no more than 128 bytes.
   * Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed
   * Dialogflow defined labels include:
   * * sys-head
   * * sys-contextual
   * The above labels do not require value. "sys-head" means the intent is a
   * head intent. "sys-contextual" means the intent is a contextual intent.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The key/value metadata to label an intent. Labels can contain
   * lowercase letters, digits and the symbols '-' and '_'. International
   * characters are allowed, including letters from unicase alphabets. Keys must
   * start with a letter. Keys and values can be no longer than 63 characters
   * and no more than 128 bytes.
   * Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed
   * Dialogflow defined labels include:
   * * sys-head
   * * sys-contextual
   * The above labels do not require value. "sys-head" means the intent is a
   * head intent. "sys-contextual" means the intent is a contextual intent.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Human readable description for better understanding an intent like its
   * scope, content, result etc. Maximum character limit: 140 characters.
   * </pre>
   *
   * <code>string description = 8;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Human readable description for better understanding an intent like its
   * scope, content, result etc. Maximum character limit: 140 characters.
   * </pre>
   *
   * <code>string description = 8;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
