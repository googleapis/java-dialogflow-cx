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
// source: google/cloud/dialogflow/cx/v3/flow.proto

package com.google.cloud.dialogflow.cx.v3;

public interface NluSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.NluSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Indicates the type of NLU model.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.NluSettings.ModelType model_type = 1;</code>
   *
   * @return The enum numeric value on the wire for modelType.
   */
  int getModelTypeValue();
  /**
   *
   *
   * <pre>
   * Indicates the type of NLU model.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.NluSettings.ModelType model_type = 1;</code>
   *
   * @return The modelType.
   */
  com.google.cloud.dialogflow.cx.v3.NluSettings.ModelType getModelType();

  /**
   *
   *
   * <pre>
   * To filter out false positive results and still get variety in matched
   * natural language inputs for your agent, you can tune the machine learning
   * classification threshold. If the returned score value is less than the
   * threshold value, then a no-match event will be triggered. The score values
   * range from 0.0 (completely uncertain) to 1.0 (completely certain). If set
   * to 0.0, the default of 0.3 is used.
   * </pre>
   *
   * <code>float classification_threshold = 3;</code>
   *
   * @return The classificationThreshold.
   */
  float getClassificationThreshold();

  /**
   *
   *
   * <pre>
   * Indicates NLU model training mode.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.NluSettings.ModelTrainingMode model_training_mode = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for modelTrainingMode.
   */
  int getModelTrainingModeValue();
  /**
   *
   *
   * <pre>
   * Indicates NLU model training mode.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.NluSettings.ModelTrainingMode model_training_mode = 4;
   * </code>
   *
   * @return The modelTrainingMode.
   */
  com.google.cloud.dialogflow.cx.v3.NluSettings.ModelTrainingMode getModelTrainingMode();
}
