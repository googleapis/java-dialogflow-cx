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
// source: google/cloud/dialogflow/cx/v3/fulfillment.proto

package com.google.cloud.dialogflow.cx.v3;

public final class FulfillmentProto {
  private FulfillmentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_SetParameterAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_SetParameterAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_CaseContent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_CaseContent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/dialogflow/cx/v3/fulfillm"
          + "ent.proto\022\035google.cloud.dialogflow.cx.v3"
          + "\032\031google/api/resource.proto\0324google/clou"
          + "d/dialogflow/cx/v3/response_message.prot"
          + "o\032\034google/protobuf/struct.proto\032\034google/"
          + "api/annotations.proto\"\301\006\n\013Fulfillment\022@\n"
          + "\010messages\030\001 \003(\0132..google.cloud.dialogflo"
          + "w.cx.v3.ResponseMessage\0227\n\007webhook\030\002 \001(\t"
          + "B&\372A#\n!dialogflow.googleapis.com/Webhook"
          + "\022\013\n\003tag\030\003 \001(\t\022\\\n\025set_parameter_actions\030\004"
          + " \003(\0132=.google.cloud.dialogflow.cx.v3.Ful"
          + "fillment.SetParameterAction\022V\n\021condition"
          + "al_cases\030\005 \003(\0132;.google.cloud.dialogflow"
          + ".cx.v3.Fulfillment.ConditionalCases\032N\n\022S"
          + "etParameterAction\022\021\n\tparameter\030\001 \001(\t\022%\n\005"
          + "value\030\002 \001(\0132\026.google.protobuf.Value\032\243\003\n\020"
          + "ConditionalCases\022O\n\005cases\030\001 \003(\0132@.google"
          + ".cloud.dialogflow.cx.v3.Fulfillment.Cond"
          + "itionalCases.Case\032\275\002\n\004Case\022\021\n\tcondition\030"
          + "\001 \001(\t\022b\n\014case_content\030\002 \003(\0132L.google.clo"
          + "ud.dialogflow.cx.v3.Fulfillment.Conditio"
          + "nalCases.Case.CaseContent\032\275\001\n\013CaseConten"
          + "t\022A\n\007message\030\001 \001(\0132..google.cloud.dialog"
          + "flow.cx.v3.ResponseMessageH\000\022W\n\020addition"
          + "al_cases\030\002 \001(\0132;.google.cloud.dialogflow"
          + ".cx.v3.Fulfillment.ConditionalCasesH\000B\022\n"
          + "\020cases_or_messageB\240\001\n!com.google.cloud.d"
          + "ialogflow.cx.v3B\020FulfillmentProtoP\001Z?goo"
          + "gle.golang.org/genproto/googleapis/cloud"
          + "/dialogflow/cx/v3;cx\370\001\001\242\002\002DF\252\002\035Google.Cl"
          + "oud.Dialogflow.Cx.V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.ResponseMessageProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_descriptor,
            new java.lang.String[] {
              "Messages", "Webhook", "Tag", "SetParameterActions", "ConditionalCases",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_SetParameterAction_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_SetParameterAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_SetParameterAction_descriptor,
            new java.lang.String[] {
              "Parameter", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_descriptor,
            new java.lang.String[] {
              "Cases",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_descriptor,
            new java.lang.String[] {
              "Condition", "CaseContent",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_CaseContent_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_CaseContent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Fulfillment_ConditionalCases_Case_CaseContent_descriptor,
            new java.lang.String[] {
              "Message", "AdditionalCases", "CasesOrMessage",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.ResponseMessageProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
