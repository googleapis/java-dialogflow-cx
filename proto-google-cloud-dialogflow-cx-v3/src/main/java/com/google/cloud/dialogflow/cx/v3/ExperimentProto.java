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
// source: google/cloud/dialogflow/cx/v3/experiment.proto

package com.google.cloud.dialogflow.cx.v3;

public final class ExperimentProto {
  private ExperimentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_Definition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_Definition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_ConfidenceInterval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_ConfidenceInterval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_Metric_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_Metric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_VersionMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_VersionMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_Variant_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_Variant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_VariantsHistory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_VariantsHistory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_RolloutStep_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_RolloutStep_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_RolloutState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RolloutState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreateExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeleteExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_StartExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_StartExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_StopExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_StopExperimentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/dialogflow/cx/v3/experime"
          + "nt.proto\022\035google.cloud.dialogflow.cx.v3\032"
          + "\034google/api/annotations.proto\032\027google/ap"
          + "i/client.proto\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\032\036goog"
          + "le/protobuf/duration.proto\032\033google/proto"
          + "buf/empty.proto\032 google/protobuf/field_m"
          + "ask.proto\032\037google/protobuf/timestamp.pro"
          + "to\"\373\020\n\nExperiment\022\014\n\004name\030\001 \001(\t\022\031\n\014displ"
          + "ay_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022"
          + ">\n\005state\030\004 \001(\0162/.google.cloud.dialogflow"
          + ".cx.v3.Experiment.State\022H\n\ndefinition\030\005 "
          + "\001(\01324.google.cloud.dialogflow.cx.v3.Expe"
          + "riment.Definition\022D\n\016rollout_config\030\016 \001("
          + "\0132,.google.cloud.dialogflow.cx.v3.Rollou"
          + "tConfig\022B\n\rrollout_state\030\017 \001(\0132+.google."
          + "cloud.dialogflow.cx.v3.RolloutState\022\036\n\026r"
          + "ollout_failure_reason\030\020 \001(\t\022@\n\006result\030\006 "
          + "\001(\01320.google.cloud.dialogflow.cx.v3.Expe"
          + "riment.Result\022/\n\013create_time\030\007 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\022.\n\nstart_time\030\010 \001"
          + "(\0132\032.google.protobuf.Timestamp\022,\n\010end_ti"
          + "me\030\t \001(\0132\032.google.protobuf.Timestamp\0224\n\020"
          + "last_update_time\030\n \001(\0132\032.google.protobuf"
          + ".Timestamp\0224\n\021experiment_length\030\013 \001(\0132\031."
          + "google.protobuf.Duration\022H\n\020variants_his"
          + "tory\030\014 \003(\0132..google.cloud.dialogflow.cx."
          + "v3.VariantsHistory\032w\n\nDefinition\022\021\n\tcond"
          + "ition\030\001 \001(\t\022J\n\020version_variants\030\002 \001(\0132.."
          + "google.cloud.dialogflow.cx.v3.VersionVar"
          + "iantsH\000B\n\n\010variants\032\213\010\n\006Result\022X\n\017versio"
          + "n_metrics\030\001 \003(\0132?.google.cloud.dialogflo"
          + "w.cx.v3.Experiment.Result.VersionMetrics"
          + "\0224\n\020last_update_time\030\002 \001(\0132\032.google.prot"
          + "obuf.Timestamp\032g\n\022ConfidenceInterval\022\030\n\020"
          + "confidence_level\030\001 \001(\001\022\r\n\005ratio\030\002 \001(\001\022\023\n"
          + "\013lower_bound\030\003 \001(\001\022\023\n\013upper_bound\030\004 \001(\001\032"
          + "\260\002\n\006Metric\022I\n\004type\030\001 \001(\0162;.google.cloud."
          + "dialogflow.cx.v3.Experiment.Result.Metri"
          + "cType\022N\n\ncount_type\030\005 \001(\0162:.google.cloud"
          + ".dialogflow.cx.v3.Experiment.Result.Coun"
          + "tType\022\017\n\005ratio\030\002 \001(\001H\000\022\017\n\005count\030\004 \001(\001H\000\022"
          + "`\n\023confidence_interval\030\003 \001(\0132C.google.cl"
          + "oud.dialogflow.cx.v3.Experiment.Result.C"
          + "onfidenceIntervalB\007\n\005value\032\252\001\n\016VersionMe"
          + "trics\0227\n\007version\030\001 \001(\tB&\372A#\n!dialogflow."
          + "googleapis.com/Version\022H\n\007metrics\030\002 \003(\0132"
          + "7.google.cloud.dialogflow.cx.v3.Experime"
          + "nt.Result.Metric\022\025\n\rsession_count\030\003 \001(\005\""
          + "\266\001\n\nMetricType\022\026\n\022METRIC_UNSPECIFIED\020\000\022&"
          + "\n\"CONTAINED_SESSION_NO_CALLBACK_RATE\020\001\022\033"
          + "\n\027LIVE_AGENT_HANDOFF_RATE\020\002\022\031\n\025CALLBACK_"
          + "SESSION_RATE\020\003\022\032\n\026ABANDONED_SESSION_RATE"
          + "\020\004\022\024\n\020SESSION_END_RATE\020\005\"o\n\tCountType\022\032\n"
          + "\026COUNT_TYPE_UNSPECIFIED\020\000\022\030\n\024TOTAL_NO_MA"
          + "TCH_COUNT\020\001\022\024\n\020TOTAL_TURN_COUNT\020\002\022\026\n\022AVE"
          + "RAGE_TURN_COUNT\020\003\"T\n\005State\022\025\n\021STATE_UNSP"
          + "ECIFIED\020\000\022\t\n\005DRAFT\020\001\022\013\n\007RUNNING\020\002\022\010\n\004DON"
          + "E\020\003\022\022\n\016ROLLOUT_FAILED\020\004:\226\001\352A\222\001\n$dialogfl"
          + "ow.googleapis.com/Experiment\022jprojects/{"
          + "project}/locations/{location}/agents/{ag"
          + "ent}/environments/{environment}/experime"
          + "nts/{experiment}\"\255\001\n\017VersionVariants\022H\n\010"
          + "variants\030\001 \003(\01326.google.cloud.dialogflow"
          + ".cx.v3.VersionVariants.Variant\032P\n\007Varian"
          + "t\022\017\n\007version\030\001 \001(\t\022\032\n\022traffic_allocation"
          + "\030\002 \001(\002\022\030\n\020is_control_group\030\003 \001(\010\"\232\001\n\017Var"
          + "iantsHistory\022J\n\020version_variants\030\001 \001(\0132."
          + ".google.cloud.dialogflow.cx.v3.VersionVa"
          + "riantsH\000\022/\n\013update_time\030\002 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\n\n\010variants\"\205\002\n\rRollou"
          + "tConfig\022O\n\rrollout_steps\030\001 \003(\01328.google."
          + "cloud.dialogflow.cx.v3.RolloutConfig.Rol"
          + "loutStep\022\031\n\021rollout_condition\030\002 \001(\t\022\031\n\021f"
          + "ailure_condition\030\003 \001(\t\032m\n\013RolloutStep\022\024\n"
          + "\014display_name\030\001 \001(\t\022\027\n\017traffic_percent\030\002"
          + " \001(\005\022/\n\014min_duration\030\003 \001(\0132\031.google.prot"
          + "obuf.Duration\"`\n\014RolloutState\022\014\n\004step\030\001 "
          + "\001(\t\022\022\n\nstep_index\030\003 \001(\005\022.\n\nstart_time\030\002 "
          + "\001(\0132\032.google.protobuf.Timestamp\"}\n\026ListE"
          + "xperimentsRequest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A"
          + "&\022$dialogflow.googleapis.com/Experiment\022"
          + "\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"r"
          + "\n\027ListExperimentsResponse\022>\n\013experiments"
          + "\030\001 \003(\0132).google.cloud.dialogflow.cx.v3.E"
          + "xperiment\022\027\n\017next_page_token\030\002 \001(\t\"R\n\024Ge"
          + "tExperimentRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&"
          + "\n$dialogflow.googleapis.com/Experiment\"\233"
          + "\001\n\027CreateExperimentRequest\022<\n\006parent\030\001 \001"
          + "(\tB,\340A\002\372A&\022$dialogflow.googleapis.com/Ex"
          + "periment\022B\n\nexperiment\030\002 \001(\0132).google.cl"
          + "oud.dialogflow.cx.v3.ExperimentB\003\340A\002\"\223\001\n"
          + "\027UpdateExperimentRequest\022B\n\nexperiment\030\001"
          + " \001(\0132).google.cloud.dialogflow.cx.v3.Exp"
          + "erimentB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.goog"
          + "le.protobuf.FieldMaskB\003\340A\002\"U\n\027DeleteExpe"
          + "rimentRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$dia"
          + "logflow.googleapis.com/Experiment\"T\n\026Sta"
          + "rtExperimentRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A"
          + "&\n$dialogflow.googleapis.com/Experiment\""
          + "S\n\025StopExperimentRequest\022:\n\004name\030\001 \001(\tB,"
          + "\340A\002\372A&\n$dialogflow.googleapis.com/Experi"
          + "ment2\370\014\n\013Experiments\022\332\001\n\017ListExperiments"
          + "\0225.google.cloud.dialogflow.cx.v3.ListExp"
          + "erimentsRequest\0326.google.cloud.dialogflo"
          + "w.cx.v3.ListExperimentsResponse\"X\202\323\344\223\002I\022"
          + "G/v3/{parent=projects/*/locations/*/agen"
          + "ts/*/environments/*}/experiments\332A\006paren"
          + "t\022\307\001\n\rGetExperiment\0223.google.cloud.dialo"
          + "gflow.cx.v3.GetExperimentRequest\032).googl"
          + "e.cloud.dialogflow.cx.v3.Experiment\"V\202\323\344"
          + "\223\002I\022G/v3/{name=projects/*/locations/*/ag"
          + "ents/*/environments/*/experiments/*}\332A\004n"
          + "ame\022\346\001\n\020CreateExperiment\0226.google.cloud."
          + "dialogflow.cx.v3.CreateExperimentRequest"
          + "\032).google.cloud.dialogflow.cx.v3.Experim"
          + "ent\"o\202\323\344\223\002U\"G/v3/{parent=projects/*/loca"
          + "tions/*/agents/*/environments/*}/experim"
          + "ents:\nexperiment\332A\021parent,experiment\022\366\001\n"
          + "\020UpdateExperiment\0226.google.cloud.dialogf"
          + "low.cx.v3.UpdateExperimentRequest\032).goog"
          + "le.cloud.dialogflow.cx.v3.Experiment\"\177\202\323"
          + "\344\223\002`2R/v3/{experiment.name=projects/*/lo"
          + "cations/*/agents/*/environments/*/experi"
          + "ments/*}:\nexperiment\332A\026experiment,update"
          + "_mask\022\272\001\n\020DeleteExperiment\0226.google.clou"
          + "d.dialogflow.cx.v3.DeleteExperimentReque"
          + "st\032\026.google.protobuf.Empty\"V\202\323\344\223\002I*G/v3/"
          + "{name=projects/*/locations/*/agents/*/en"
          + "vironments/*/experiments/*}\332A\004name\022\324\001\n\017S"
          + "tartExperiment\0225.google.cloud.dialogflow"
          + ".cx.v3.StartExperimentRequest\032).google.c"
          + "loud.dialogflow.cx.v3.Experiment\"_\202\323\344\223\002R"
          + "\"M/v3/{name=projects/*/locations/*/agent"
          + "s/*/environments/*/experiments/*}:start:"
          + "\001*\332A\004name\022\321\001\n\016StopExperiment\0224.google.cl"
          + "oud.dialogflow.cx.v3.StopExperimentReque"
          + "st\032).google.cloud.dialogflow.cx.v3.Exper"
          + "iment\"^\202\323\344\223\002Q\"L/v3/{name=projects/*/loca"
          + "tions/*/agents/*/environments/*/experime"
          + "nts/*}:stop:\001*\332A\004name\032x\312A\031dialogflow.goo"
          + "gleapis.com\322AYhttps://www.googleapis.com"
          + "/auth/cloud-platform,https://www.googlea"
          + "pis.com/auth/dialogflowB\265\001\n!com.google.c"
          + "loud.dialogflow.cx.v3B\017ExperimentProtoP\001"
          + "Z1cloud.google.com/go/dialogflow/cx/apiv"
          + "3/cxpb;cxpb\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialo"
          + "gflow.Cx.V3\352\002!Google::Cloud::Dialogflow:"
          + ":CX::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Experiment_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "State",
              "Definition",
              "RolloutConfig",
              "RolloutState",
              "RolloutFailureReason",
              "Result",
              "CreateTime",
              "StartTime",
              "EndTime",
              "LastUpdateTime",
              "ExperimentLength",
              "VariantsHistory",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_Definition_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Experiment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_Definition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Experiment_Definition_descriptor,
            new java.lang.String[] {
              "Condition", "VersionVariants", "Variants",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Experiment_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_descriptor,
            new java.lang.String[] {
              "VersionMetrics", "LastUpdateTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_ConfidenceInterval_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_ConfidenceInterval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_ConfidenceInterval_descriptor,
            new java.lang.String[] {
              "ConfidenceLevel", "Ratio", "LowerBound", "UpperBound",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_Metric_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_Metric_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_Metric_descriptor,
            new java.lang.String[] {
              "Type", "CountType", "Ratio", "Count", "ConfidenceInterval", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_VersionMetrics_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_VersionMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Experiment_Result_VersionMetrics_descriptor,
            new java.lang.String[] {
              "Version", "Metrics", "SessionCount",
            });
    internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_descriptor,
            new java.lang.String[] {
              "Variants",
            });
    internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_Variant_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_Variant_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_VersionVariants_Variant_descriptor,
            new java.lang.String[] {
              "Version", "TrafficAllocation", "IsControlGroup",
            });
    internal_static_google_cloud_dialogflow_cx_v3_VariantsHistory_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_VariantsHistory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_VariantsHistory_descriptor,
            new java.lang.String[] {
              "VersionVariants", "UpdateTime", "Variants",
            });
    internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_descriptor,
            new java.lang.String[] {
              "RolloutSteps", "RolloutCondition", "FailureCondition",
            });
    internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_RolloutStep_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_RolloutStep_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_RolloutConfig_RolloutStep_descriptor,
            new java.lang.String[] {
              "DisplayName", "TrafficPercent", "MinDuration",
            });
    internal_static_google_cloud_dialogflow_cx_v3_RolloutState_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_RolloutState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_RolloutState_descriptor,
            new java.lang.String[] {
              "Step", "StepIndex", "StartTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsResponse_descriptor,
            new java.lang.String[] {
              "Experiments", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_GetExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetExperimentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreateExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_CreateExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreateExperimentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Experiment",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateExperimentRequest_descriptor,
            new java.lang.String[] {
              "Experiment", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeleteExperimentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3_StartExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3_StartExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_StartExperimentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3_StopExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3_StopExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_StopExperimentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
