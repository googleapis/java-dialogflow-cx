// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/security_settings.proto

package com.google.cloud.dialogflow.cx.v3;

public interface SecuritySettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.SecuritySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the settings.
   * Required for the [SecuritySettingsService.UpdateSecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettingsService.UpdateSecuritySettings] method.
   * [SecuritySettingsService.CreateSecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettingsService.CreateSecuritySettings] populates the name
   * automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/securitySettings/&lt;Security Settings ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the settings.
   * Required for the [SecuritySettingsService.UpdateSecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettingsService.UpdateSecuritySettings] method.
   * [SecuritySettingsService.CreateSecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettingsService.CreateSecuritySettings] populates the name
   * automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/securitySettings/&lt;Security Settings ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The human-readable name of the security settings, unique within the
   * location.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The human-readable name of the security settings, unique within the
   * location.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Strategy that defines how we do redaction.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionStrategy redaction_strategy = 3;</code>
   * @return The enum numeric value on the wire for redactionStrategy.
   */
  int getRedactionStrategyValue();
  /**
   * <pre>
   * Strategy that defines how we do redaction.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionStrategy redaction_strategy = 3;</code>
   * @return The redactionStrategy.
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionStrategy getRedactionStrategy();

  /**
   * <pre>
   * Defines the data for which Dialogflow applies redaction. Dialogflow does
   * not redact data that it does not have access to – for example, Cloud
   * logging.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionScope redaction_scope = 4;</code>
   * @return The enum numeric value on the wire for redactionScope.
   */
  int getRedactionScopeValue();
  /**
   * <pre>
   * Defines the data for which Dialogflow applies redaction. Dialogflow does
   * not redact data that it does not have access to – for example, Cloud
   * logging.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionScope redaction_scope = 4;</code>
   * @return The redactionScope.
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettings.RedactionScope getRedactionScope();

  /**
   * <pre>
   * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this
   * template to define inspect base settings.
   * The `DLP Inspect Templates Reader` role is needed on the Dialogflow
   * service identity service account (has the form
   * `service-PROJECT_NUMBER&#64;gcp-sa-dialogflow.iam.gserviceaccount.com`)
   * for your agent's project.
   * If empty, we use the default DLP inspect config.
   * The template name will have one of the following formats:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/inspectTemplates/&lt;Template
   * ID&gt;` OR `organizations/&lt;Organization ID&gt;/locations/&lt;Location
   * ID&gt;/inspectTemplates/&lt;Template ID&gt;`
   * Note: `inspect_template` must be located in the same region as the
   * `SecuritySettings`.
   * </pre>
   *
   * <code>string inspect_template = 9 [(.google.api.resource_reference) = { ... }</code>
   * @return The inspectTemplate.
   */
  java.lang.String getInspectTemplate();
  /**
   * <pre>
   * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this
   * template to define inspect base settings.
   * The `DLP Inspect Templates Reader` role is needed on the Dialogflow
   * service identity service account (has the form
   * `service-PROJECT_NUMBER&#64;gcp-sa-dialogflow.iam.gserviceaccount.com`)
   * for your agent's project.
   * If empty, we use the default DLP inspect config.
   * The template name will have one of the following formats:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/inspectTemplates/&lt;Template
   * ID&gt;` OR `organizations/&lt;Organization ID&gt;/locations/&lt;Location
   * ID&gt;/inspectTemplates/&lt;Template ID&gt;`
   * Note: `inspect_template` must be located in the same region as the
   * `SecuritySettings`.
   * </pre>
   *
   * <code>string inspect_template = 9 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for inspectTemplate.
   */
  com.google.protobuf.ByteString
      getInspectTemplateBytes();

  /**
   * <pre>
   * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this
   * template to define de-identification configuration for the content.
   * The `DLP De-identify Templates Reader` role is needed on the Dialogflow
   * service identity service account (has the form
   * `service-PROJECT_NUMBER&#64;gcp-sa-dialogflow.iam.gserviceaccount.com`)
   * for your agent's project.
   * If empty, Dialogflow replaces sensitive info with `[redacted]` text.
   * The template name will have one of the following formats:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/deidentifyTemplates/&lt;Template ID&gt;` OR `organizations/&lt;Organization
   * ID&gt;/locations/&lt;Location ID&gt;/deidentifyTemplates/&lt;Template ID&gt;`
   * Note: `deidentify_template` must be located in the same region as the
   * `SecuritySettings`.
   * </pre>
   *
   * <code>string deidentify_template = 17 [(.google.api.resource_reference) = { ... }</code>
   * @return The deidentifyTemplate.
   */
  java.lang.String getDeidentifyTemplate();
  /**
   * <pre>
   * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this
   * template to define de-identification configuration for the content.
   * The `DLP De-identify Templates Reader` role is needed on the Dialogflow
   * service identity service account (has the form
   * `service-PROJECT_NUMBER&#64;gcp-sa-dialogflow.iam.gserviceaccount.com`)
   * for your agent's project.
   * If empty, Dialogflow replaces sensitive info with `[redacted]` text.
   * The template name will have one of the following formats:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/deidentifyTemplates/&lt;Template ID&gt;` OR `organizations/&lt;Organization
   * ID&gt;/locations/&lt;Location ID&gt;/deidentifyTemplates/&lt;Template ID&gt;`
   * Note: `deidentify_template` must be located in the same region as the
   * `SecuritySettings`.
   * </pre>
   *
   * <code>string deidentify_template = 17 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for deidentifyTemplate.
   */
  com.google.protobuf.ByteString
      getDeidentifyTemplateBytes();

  /**
   * <pre>
   * Retains data in interaction logging for the specified number of days.
   * This does not apply to Cloud logging, which is owned by the user - not
   * Dialogflow.
   * User must set a value lower than Dialogflow's default 365d TTL. Setting a
   * value higher than that has no effect.
   * A missing value or setting to 0 also means we use Dialogflow's default
   * TTL.
   * Note: Interaction logging is a limited access feature. Talk to your
   * Google representative to check availability for you.
   * </pre>
   *
   * <code>int32 retention_window_days = 6;</code>
   * @return Whether the retentionWindowDays field is set.
   */
  boolean hasRetentionWindowDays();
  /**
   * <pre>
   * Retains data in interaction logging for the specified number of days.
   * This does not apply to Cloud logging, which is owned by the user - not
   * Dialogflow.
   * User must set a value lower than Dialogflow's default 365d TTL. Setting a
   * value higher than that has no effect.
   * A missing value or setting to 0 also means we use Dialogflow's default
   * TTL.
   * Note: Interaction logging is a limited access feature. Talk to your
   * Google representative to check availability for you.
   * </pre>
   *
   * <code>int32 retention_window_days = 6;</code>
   * @return The retentionWindowDays.
   */
  int getRetentionWindowDays();

  /**
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType purge_data_types = 8;</code>
   * @return A list containing the purgeDataTypes.
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType> getPurgeDataTypesList();
  /**
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType purge_data_types = 8;</code>
   * @return The count of purgeDataTypes.
   */
  int getPurgeDataTypesCount();
  /**
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType purge_data_types = 8;</code>
   * @param index The index of the element to return.
   * @return The purgeDataTypes at the given index.
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType getPurgeDataTypes(int index);
  /**
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType purge_data_types = 8;</code>
   * @return A list containing the enum numeric values on the wire for purgeDataTypes.
   */
  java.util.List<java.lang.Integer>
  getPurgeDataTypesValueList();
  /**
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.SecuritySettings.PurgeDataType purge_data_types = 8;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of purgeDataTypes at the given index.
   */
  int getPurgeDataTypesValue(int index);

  /**
   * <pre>
   * Controls conversation exporting settings to Insights after conversation is
   * completed.
   * If [retention_strategy][google.cloud.dialogflow.cx.v3.SecuritySettings.retention_strategy] is set to REMOVE_AFTER_CONVERSATION,
   * Insights export is disabled no matter what you configure here.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.InsightsExportSettings insights_export_settings = 13;</code>
   * @return Whether the insightsExportSettings field is set.
   */
  boolean hasInsightsExportSettings();
  /**
   * <pre>
   * Controls conversation exporting settings to Insights after conversation is
   * completed.
   * If [retention_strategy][google.cloud.dialogflow.cx.v3.SecuritySettings.retention_strategy] is set to REMOVE_AFTER_CONVERSATION,
   * Insights export is disabled no matter what you configure here.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.InsightsExportSettings insights_export_settings = 13;</code>
   * @return The insightsExportSettings.
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettings.InsightsExportSettings getInsightsExportSettings();
  /**
   * <pre>
   * Controls conversation exporting settings to Insights after conversation is
   * completed.
   * If [retention_strategy][google.cloud.dialogflow.cx.v3.SecuritySettings.retention_strategy] is set to REMOVE_AFTER_CONVERSATION,
   * Insights export is disabled no matter what you configure here.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SecuritySettings.InsightsExportSettings insights_export_settings = 13;</code>
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettings.InsightsExportSettingsOrBuilder getInsightsExportSettingsOrBuilder();

  public com.google.cloud.dialogflow.cx.v3.SecuritySettings.DataRetentionCase getDataRetentionCase();
}
