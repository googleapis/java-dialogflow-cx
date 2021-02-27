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
// source: google/cloud/dialogflow/cx/v3/security_settings.proto

package com.google.cloud.dialogflow.cx.v3;

public interface SecuritySettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.SecuritySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the settings.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/securitySettings/&lt;Security Settings ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the settings.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/securitySettings/&lt;Security Settings ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the security settings, unique within the
   * location.
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
   * Required. The human-readable name of the security settings, unique within the
   * location.
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
   * Strategy that defines how we do redaction.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionStrategy redaction_strategy = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for redactionStrategy.
   */
  int getRedactionStrategyValue();
  /**
   *
   *
   * <pre>
   * Strategy that defines how we do redaction.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionStrategy redaction_strategy = 3;
   * </code>
   *
   * @return The redactionStrategy.
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionStrategy getRedactionStrategy();

  /**
   *
   *
   * <pre>
   * Defines on what data we apply redaction. Note that we don't
   * redact data to which we don't have access, e.g., Stackdriver logs.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionScope redaction_scope = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for redactionScope.
   */
  int getRedactionScopeValue();
  /**
   *
   *
   * <pre>
   * Defines on what data we apply redaction. Note that we don't
   * redact data to which we don't have access, e.g., Stackdriver logs.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionScope redaction_scope = 4;
   * </code>
   *
   * @return The redactionScope.
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionScope getRedactionScope();

  /**
   *
   *
   * <pre>
   * DLP inspect template name. Use this template to define inspect base
   * settings.
   * If empty, we use the default DLP inspect config.
   * The template name will have one of the following formats:
   * `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
   * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`
   * </pre>
   *
   * <code>string inspect_template = 9;</code>
   *
   * @return The inspectTemplate.
   */
  java.lang.String getInspectTemplate();
  /**
   *
   *
   * <pre>
   * DLP inspect template name. Use this template to define inspect base
   * settings.
   * If empty, we use the default DLP inspect config.
   * The template name will have one of the following formats:
   * `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
   * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`
   * </pre>
   *
   * <code>string inspect_template = 9;</code>
   *
   * @return The bytes for inspectTemplate.
   */
  com.google.protobuf.ByteString getInspectTemplateBytes();

  /**
   *
   *
   * <pre>
   * Retains the data for the specified number of days.
   * User must Set a value lower than Dialogflow's default 30d TTL. Setting a
   * value higher than that has no effect.
   * A missing value or setting to 0 also means we use Dialogflow's default
   * TTL.
   * </pre>
   *
   * <code>int32 retention_window_days = 6;</code>
   *
   * @return Whether the retentionWindowDays field is set.
   */
  boolean hasRetentionWindowDays();
  /**
   *
   *
   * <pre>
   * Retains the data for the specified number of days.
   * User must Set a value lower than Dialogflow's default 30d TTL. Setting a
   * value higher than that has no effect.
   * A missing value or setting to 0 also means we use Dialogflow's default
   * TTL.
   * </pre>
   *
   * <code>int32 retention_window_days = 6;</code>
   *
   * @return The retentionWindowDays.
   */
  int getRetentionWindowDays();

  /**
   *
   *
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType purge_data_types = 8;
   * </code>
   *
   * @return A list containing the purgeDataTypes.
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType>
      getPurgeDataTypesList();
  /**
   *
   *
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType purge_data_types = 8;
   * </code>
   *
   * @return The count of purgeDataTypes.
   */
  int getPurgeDataTypesCount();
  /**
   *
   *
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType purge_data_types = 8;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The purgeDataTypes at the given index.
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType getPurgeDataTypes(int index);
  /**
   *
   *
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType purge_data_types = 8;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for purgeDataTypes.
   */
  java.util.List<java.lang.Integer> getPurgeDataTypesValueList();
  /**
   *
   *
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType purge_data_types = 8;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of purgeDataTypes at the given index.
   */
  int getPurgeDataTypesValue(int index);

  public com.google.cloud.dialogflow.cx.v3.SecuritySettings.DataRetentionCase
      getDataRetentionCase();
}
