// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/environment.proto

package com.google.cloud.dialogflow.cx.v3;

public final class EnvironmentProto {
  private EnvironmentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_Environment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_Environment_VersionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Environment_VersionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListEnvironmentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListEnvironmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListEnvironmentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListEnvironmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_GetEnvironmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_CreateEnvironmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_UpdateEnvironmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_DeleteEnvironmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_LookupEnvironmentHistoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_LookupEnvironmentHistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_LookupEnvironmentHistoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_LookupEnvironmentHistoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ContinuousTestResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ContinuousTestResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListContinuousTestResultsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListContinuousTestResultsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListContinuousTestResultsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListContinuousTestResultsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/dialogflow/cx/v3/environm" +
      "ent.proto\022\035google.cloud.dialogflow.cx.v3" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032-goo" +
      "gle/cloud/dialogflow/cx/v3/test_case.pro" +
      "to\032#google/longrunning/operations.proto\032" +
      "\033google/protobuf/empty.proto\032 google/pro" +
      "tobuf/field_mask.proto\032\037google/protobuf/" +
      "timestamp.proto\"\245\003\n\013Environment\022\014\n\004name\030" +
      "\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013desc" +
      "ription\030\003 \001(\t\022V\n\017version_configs\030\006 \003(\01328" +
      ".google.cloud.dialogflow.cx.v3.Environme" +
      "nt.VersionConfigB\003\340A\002\0224\n\013update_time\030\005 \001" +
      "(\0132\032.google.protobuf.TimestampB\003\340A\003\032K\n\rV" +
      "ersionConfig\022:\n\007version\030\001 \001(\tB)\340A\002\372A#\n!d" +
      "ialogflow.googleapis.com/Version:}\352Az\n%d" +
      "ialogflow.googleapis.com/Environment\022Qpr" +
      "ojects/{project}/locations/{location}/ag" +
      "ents/{agent}/environments/{environment}\"" +
      "\177\n\027ListEnvironmentsRequest\022=\n\006parent\030\001 \001" +
      "(\tB-\340A\002\372A\'\022%dialogflow.googleapis.com/En" +
      "vironment\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_tok" +
      "en\030\003 \001(\t\"u\n\030ListEnvironmentsResponse\022@\n\014" +
      "environments\030\001 \003(\0132*.google.cloud.dialog" +
      "flow.cx.v3.Environment\022\027\n\017next_page_toke" +
      "n\030\002 \001(\t\"T\n\025GetEnvironmentRequest\022;\n\004name" +
      "\030\001 \001(\tB-\340A\002\372A\'\n%dialogflow.googleapis.co" +
      "m/Environment\"\237\001\n\030CreateEnvironmentReque" +
      "st\022=\n\006parent\030\001 \001(\tB-\340A\002\372A\'\022%dialogflow.g" +
      "oogleapis.com/Environment\022D\n\013environment" +
      "\030\002 \001(\0132*.google.cloud.dialogflow.cx.v3.E" +
      "nvironmentB\003\340A\002\"\226\001\n\030UpdateEnvironmentReq" +
      "uest\022D\n\013environment\030\001 \001(\0132*.google.cloud" +
      ".dialogflow.cx.v3.EnvironmentB\003\340A\002\0224\n\013up" +
      "date_mask\030\002 \001(\0132\032.google.protobuf.FieldM" +
      "askB\003\340A\002\"W\n\030DeleteEnvironmentRequest\022;\n\004" +
      "name\030\001 \001(\tB-\340A\002\372A\'\n%dialogflow.googleapi" +
      "s.com/Environment\"\205\001\n\037LookupEnvironmentH" +
      "istoryRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%dia" +
      "logflow.googleapis.com/Environment\022\021\n\tpa" +
      "ge_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"}\n Loo" +
      "kupEnvironmentHistoryResponse\022@\n\014environ" +
      "ments\030\001 \003(\0132*.google.cloud.dialogflow.cx" +
      ".v3.Environment\022\027\n\017next_page_token\030\002 \001(\t" +
      "\"\210\004\n\024ContinuousTestResult\022\014\n\004name\030\001 \001(\t\022" +
      "X\n\006result\030\002 \001(\0162H.google.cloud.dialogflo" +
      "w.cx.v3.ContinuousTestResult.AggregatedT" +
      "estResult\022H\n\021test_case_results\030\003 \003(\tB-\372A" +
      "*\n(dialogflow.googleapis.com/TestCaseRes" +
      "ult\022,\n\010run_time\030\004 \001(\0132\032.google.protobuf." +
      "Timestamp\"V\n\024AggregatedTestResult\022&\n\"AGG" +
      "REGATED_TEST_RESULT_UNSPECIFIED\020\000\022\n\n\006PAS" +
      "SED\020\001\022\n\n\006FAILED\020\002:\267\001\352A\263\001\n.dialogflow.goo" +
      "gleapis.com/ContinuousTestResult\022\200\001proje" +
      "cts/{project}/locations/{location}/agent" +
      "s/{agent}/environments/{environment}/con" +
      "tinuousTestResults/{continuous_test_resu" +
      "lt}\"^\n\030RunContinuousTestRequest\022B\n\013envir" +
      "onment\030\001 \001(\tB-\340A\002\372A\'\n%dialogflow.googlea" +
      "pis.com/Environment\"p\n\031RunContinuousTest" +
      "Response\022S\n\026continuous_test_result\030\001 \001(\013" +
      "23.google.cloud.dialogflow.cx.v3.Continu" +
      "ousTestResult\"U\n\031RunContinuousTestMetada" +
      "ta\0228\n\006errors\030\001 \003(\0132(.google.cloud.dialog" +
      "flow.cx.v3.TestError\"\221\001\n ListContinuousT" +
      "estResultsRequest\022F\n\006parent\030\001 \001(\tB6\340A\002\372A" +
      "0\022.dialogflow.googleapis.com/ContinuousT" +
      "estResult\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_tok" +
      "en\030\003 \001(\t\"\222\001\n!ListContinuousTestResultsRe" +
      "sponse\022T\n\027continuous_test_results\030\001 \003(\0132" +
      "3.google.cloud.dialogflow.cx.v3.Continuo" +
      "usTestResult\022\027\n\017next_page_token\030\002 \001(\t2\340\017" +
      "\n\014Environments\022\317\001\n\020ListEnvironments\0226.go" +
      "ogle.cloud.dialogflow.cx.v3.ListEnvironm" +
      "entsRequest\0327.google.cloud.dialogflow.cx" +
      ".v3.ListEnvironmentsResponse\"J\202\323\344\223\002;\0229/v" +
      "3/{parent=projects/*/locations/*/agents/" +
      "*}/environments\332A\006parent\022\274\001\n\016GetEnvironm" +
      "ent\0224.google.cloud.dialogflow.cx.v3.GetE" +
      "nvironmentRequest\032*.google.cloud.dialogf" +
      "low.cx.v3.Environment\"H\202\323\344\223\002;\0229/v3/{name" +
      "=projects/*/locations/*/agents/*/environ" +
      "ments/*}\332A\004name\022\371\001\n\021CreateEnvironment\0227." +
      "google.cloud.dialogflow.cx.v3.CreateEnvi" +
      "ronmentRequest\032\035.google.longrunning.Oper" +
      "ation\"\213\001\202\323\344\223\002H\"9/v3/{parent=projects/*/l" +
      "ocations/*/agents/*}/environments:\013envir" +
      "onment\332A\022parent,environment\312A%\n\013Environm" +
      "ent\022\026google.protobuf.Struct\022\212\002\n\021UpdateEn" +
      "vironment\0227.google.cloud.dialogflow.cx.v" +
      "3.UpdateEnvironmentRequest\032\035.google.long" +
      "running.Operation\"\234\001\202\323\344\223\002T2E/v3/{environ" +
      "ment.name=projects/*/locations/*/agents/" +
      "*/environments/*}:\013environment\332A\027environ" +
      "ment,update_mask\312A%\n\013Environment\022\026google" +
      ".protobuf.Struct\022\256\001\n\021DeleteEnvironment\0227" +
      ".google.cloud.dialogflow.cx.v3.DeleteEnv" +
      "ironmentRequest\032\026.google.protobuf.Empty\"" +
      "H\202\323\344\223\002;*9/v3/{name=projects/*/locations/" +
      "*/agents/*/environments/*}\332A\004name\022\376\001\n\030Lo" +
      "okupEnvironmentHistory\022>.google.cloud.di" +
      "alogflow.cx.v3.LookupEnvironmentHistoryR" +
      "equest\032?.google.cloud.dialogflow.cx.v3.L" +
      "ookupEnvironmentHistoryResponse\"a\202\323\344\223\002T\022" +
      "R/v3/{name=projects/*/locations/*/agents" +
      "/*/environments/*}:lookupEnvironmentHist" +
      "ory\332A\004name\022\204\002\n\021RunContinuousTest\0227.googl" +
      "e.cloud.dialogflow.cx.v3.RunContinuousTe" +
      "stRequest\032\035.google.longrunning.Operation" +
      "\"\226\001\202\323\344\223\002W\"R/v3/{environment=projects/*/l" +
      "ocations/*/agents/*/environments/*}:runC" +
      "ontinuousTest:\001*\312A6\n\031RunContinuousTestRe" +
      "sponse\022\031RunContinuousTestMetadata\022\202\002\n\031Li" +
      "stContinuousTestResults\022?.google.cloud.d" +
      "ialogflow.cx.v3.ListContinuousTestResult" +
      "sRequest\032@.google.cloud.dialogflow.cx.v3" +
      ".ListContinuousTestResultsResponse\"b\202\323\344\223" +
      "\002S\022Q/v3/{parent=projects/*/locations/*/a" +
      "gents/*/environments/*}/continuousTestRe" +
      "sults\332A\006parent\032x\312A\031dialogflow.googleapis" +
      ".com\322AYhttps://www.googleapis.com/auth/c" +
      "loud-platform,https://www.googleapis.com" +
      "/auth/dialogflowB\304\001\n!com.google.cloud.di" +
      "alogflow.cx.v3B\020EnvironmentProtoP\001Z?goog" +
      "le.golang.org/genproto/googleapis/cloud/" +
      "dialogflow/cx/v3;cx\370\001\001\242\002\002DF\252\002\035Google.Clo" +
      "ud.Dialogflow.Cx.V3\352\002!Google::Cloud::Dia" +
      "logflow::CX::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.cx.v3.TestCaseProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3_Environment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Environment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_Environment_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "VersionConfigs", "UpdateTime", });
    internal_static_google_cloud_dialogflow_cx_v3_Environment_VersionConfig_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_Environment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Environment_VersionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_Environment_VersionConfig_descriptor,
        new java.lang.String[] { "Version", });
    internal_static_google_cloud_dialogflow_cx_v3_ListEnvironmentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_ListEnvironmentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListEnvironmentsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_ListEnvironmentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListEnvironmentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListEnvironmentsResponse_descriptor,
        new java.lang.String[] { "Environments", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_GetEnvironmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_GetEnvironmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_GetEnvironmentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3_CreateEnvironmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_CreateEnvironmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_CreateEnvironmentRequest_descriptor,
        new java.lang.String[] { "Parent", "Environment", });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateEnvironmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateEnvironmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_UpdateEnvironmentRequest_descriptor,
        new java.lang.String[] { "Environment", "UpdateMask", });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteEnvironmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteEnvironmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_DeleteEnvironmentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3_LookupEnvironmentHistoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_LookupEnvironmentHistoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_LookupEnvironmentHistoryRequest_descriptor,
        new java.lang.String[] { "Name", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_LookupEnvironmentHistoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_LookupEnvironmentHistoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_LookupEnvironmentHistoryResponse_descriptor,
        new java.lang.String[] { "Environments", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_ContinuousTestResult_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_ContinuousTestResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ContinuousTestResult_descriptor,
        new java.lang.String[] { "Name", "Result", "TestCaseResults", "RunTime", });
    internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestRequest_descriptor,
        new java.lang.String[] { "Environment", });
    internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestResponse_descriptor,
        new java.lang.String[] { "ContinuousTestResult", });
    internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestMetadata_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_RunContinuousTestMetadata_descriptor,
        new java.lang.String[] { "Errors", });
    internal_static_google_cloud_dialogflow_cx_v3_ListContinuousTestResultsRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_cx_v3_ListContinuousTestResultsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListContinuousTestResultsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_ListContinuousTestResultsResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_cx_v3_ListContinuousTestResultsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListContinuousTestResultsResponse_descriptor,
        new java.lang.String[] { "ContinuousTestResults", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.TestCaseProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
