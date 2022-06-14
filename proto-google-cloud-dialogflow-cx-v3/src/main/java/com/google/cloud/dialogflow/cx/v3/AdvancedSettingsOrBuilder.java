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
// source: google/cloud/dialogflow/cx/v3/advanced_settings.proto

package com.google.cloud.dialogflow.cx.v3;

public interface AdvancedSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.AdvancedSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Settings for logging.
   * Settings for Dialogflow History, Contact Center messages, StackDriver logs,
   * and speech logging.
   * Exposed at the following levels:
   * - Agent level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettings logging_settings = 6;
   * </code>
   *
   * @return Whether the loggingSettings field is set.
   */
  boolean hasLoggingSettings();
  /**
   *
   *
   * <pre>
   * Settings for logging.
   * Settings for Dialogflow History, Contact Center messages, StackDriver logs,
   * and speech logging.
   * Exposed at the following levels:
   * - Agent level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettings logging_settings = 6;
   * </code>
   *
   * @return The loggingSettings.
   */
  com.google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettings getLoggingSettings();
  /**
   *
   *
   * <pre>
   * Settings for logging.
   * Settings for Dialogflow History, Contact Center messages, StackDriver logs,
   * and speech logging.
   * Exposed at the following levels:
   * - Agent level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettings logging_settings = 6;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettingsOrBuilder
      getLoggingSettingsOrBuilder();
}
