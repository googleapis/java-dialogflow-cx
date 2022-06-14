// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/transition_route_group.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class TransitionRouteGroupProto {
  private TransitionRouteGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRouteGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRouteGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetTransitionRouteGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateTransitionRouteGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateTransitionRouteGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteTransitionRouteGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteTransitionRouteGroupRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/dialogflow/cx/v3beta1/tra" +
      "nsition_route_group.proto\022\"google.cloud." +
      "dialogflow.cx.v3beta1\032\034google/api/annota" +
      "tions.proto\032\027google/api/client.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\032-google/cloud/dialogflo" +
      "w/cx/v3beta1/page.proto\032\033google/protobuf" +
      "/empty.proto\032 google/protobuf/field_mask" +
      ".proto\"\272\002\n\024TransitionRouteGroup\022\014\n\004name\030" +
      "\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022N\n\021tran" +
      "sition_routes\030\005 \003(\01323.google.cloud.dialo" +
      "gflow.cx.v3beta1.TransitionRoute:\250\001\352A\244\001\n" +
      ".dialogflow.googleapis.com/TransitionRou" +
      "teGroup\022rprojects/{project}/locations/{l" +
      "ocation}/agents/{agent}/flows/{flow}/tra" +
      "nsitionRouteGroups/{transition_route_gro" +
      "up}\"\250\001\n ListTransitionRouteGroupsRequest" +
      "\022F\n\006parent\030\001 \001(\tB6\340A\002\372A0\022.dialogflow.goo" +
      "gleapis.com/TransitionRouteGroup\022\021\n\tpage" +
      "_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\025\n\rlangu" +
      "age_code\030\004 \001(\t\"\227\001\n!ListTransitionRouteGr" +
      "oupsResponse\022Y\n\027transition_route_groups\030" +
      "\001 \003(\01328.google.cloud.dialogflow.cx.v3bet" +
      "a1.TransitionRouteGroup\022\027\n\017next_page_tok" +
      "en\030\002 \001(\t\"}\n\036GetTransitionRouteGroupReque" +
      "st\022D\n\004name\030\001 \001(\tB6\340A\002\372A0\n.dialogflow.goo" +
      "gleapis.com/TransitionRouteGroup\022\025\n\rlang" +
      "uage_code\030\002 \001(\t\"\341\001\n!CreateTransitionRout" +
      "eGroupRequest\022F\n\006parent\030\001 \001(\tB6\340A\002\372A0\022.d" +
      "ialogflow.googleapis.com/TransitionRoute" +
      "Group\022]\n\026transition_route_group\030\002 \001(\01328." +
      "google.cloud.dialogflow.cx.v3beta1.Trans" +
      "itionRouteGroupB\003\340A\002\022\025\n\rlanguage_code\030\003 " +
      "\001(\t\"\312\001\n!UpdateTransitionRouteGroupReques" +
      "t\022]\n\026transition_route_group\030\001 \001(\01328.goog" +
      "le.cloud.dialogflow.cx.v3beta1.Transitio" +
      "nRouteGroupB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032." +
      "google.protobuf.FieldMask\022\025\n\rlanguage_co" +
      "de\030\003 \001(\t\"x\n!DeleteTransitionRouteGroupRe" +
      "quest\022D\n\004name\030\001 \001(\tB6\340A\002\372A0\n.dialogflow." +
      "googleapis.com/TransitionRouteGroup\022\r\n\005f" +
      "orce\030\002 \001(\0102\367\013\n\025TransitionRouteGroups\022\212\002\n" +
      "\031ListTransitionRouteGroups\022D.google.clou" +
      "d.dialogflow.cx.v3beta1.ListTransitionRo" +
      "uteGroupsRequest\032E.google.cloud.dialogfl" +
      "ow.cx.v3beta1.ListTransitionRouteGroupsR" +
      "esponse\"`\202\323\344\223\002Q\022O/v3beta1/{parent=projec" +
      "ts/*/locations/*/agents/*/flows/*}/trans" +
      "itionRouteGroups\332A\006parent\022\367\001\n\027GetTransit" +
      "ionRouteGroup\022B.google.cloud.dialogflow." +
      "cx.v3beta1.GetTransitionRouteGroupReques" +
      "t\0328.google.cloud.dialogflow.cx.v3beta1.T" +
      "ransitionRouteGroup\"^\202\323\344\223\002Q\022O/v3beta1/{n" +
      "ame=projects/*/locations/*/agents/*/flow" +
      "s/*/transitionRouteGroups/*}\332A\004name\022\257\002\n\032" +
      "CreateTransitionRouteGroup\022E.google.clou" +
      "d.dialogflow.cx.v3beta1.CreateTransition" +
      "RouteGroupRequest\0328.google.cloud.dialogf" +
      "low.cx.v3beta1.TransitionRouteGroup\"\217\001\202\323" +
      "\344\223\002i\"O/v3beta1/{parent=projects/*/locati" +
      "ons/*/agents/*/flows/*}/transitionRouteG" +
      "roups:\026transition_route_group\332A\035parent,t" +
      "ransition_route_group\022\314\002\n\032UpdateTransiti" +
      "onRouteGroup\022E.google.cloud.dialogflow.c" +
      "x.v3beta1.UpdateTransitionRouteGroupRequ" +
      "est\0328.google.cloud.dialogflow.cx.v3beta1" +
      ".TransitionRouteGroup\"\254\001\202\323\344\223\002\200\0012f/v3beta" +
      "1/{transition_route_group.name=projects/" +
      "*/locations/*/agents/*/flows/*/transitio" +
      "nRouteGroups/*}:\026transition_route_group\332" +
      "A\"transition_route_group,update_mask\022\333\001\n" +
      "\032DeleteTransitionRouteGroup\022E.google.clo" +
      "ud.dialogflow.cx.v3beta1.DeleteTransitio" +
      "nRouteGroupRequest\032\026.google.protobuf.Emp" +
      "ty\"^\202\323\344\223\002Q*O/v3beta1/{name=projects/*/lo" +
      "cations/*/agents/*/flows/*/transitionRou" +
      "teGroups/*}\332A\004name\032x\312A\031dialogflow.google" +
      "apis.com\322AYhttps://www.googleapis.com/au" +
      "th/cloud-platform,https://www.googleapis" +
      ".com/auth/dialogflowB\341\001\n&com.google.clou" +
      "d.dialogflow.cx.v3beta1B\031TransitionRoute" +
      "GroupProtoP\001ZDgoogle.golang.org/genproto" +
      "/googleapis/cloud/dialogflow/cx/v3beta1;" +
      "cx\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialogflow.Cx." +
      "V3Beta1\352\002&Google::Cloud::Dialogflow::CX:" +
      ":V3beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.cx.v3beta1.PageProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRouteGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRouteGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRouteGroup_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "TransitionRoutes", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsResponse_descriptor,
        new java.lang.String[] { "TransitionRouteGroups", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetTransitionRouteGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetTransitionRouteGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_GetTransitionRouteGroupRequest_descriptor,
        new java.lang.String[] { "Name", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateTransitionRouteGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateTransitionRouteGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_CreateTransitionRouteGroupRequest_descriptor,
        new java.lang.String[] { "Parent", "TransitionRouteGroup", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateTransitionRouteGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateTransitionRouteGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateTransitionRouteGroupRequest_descriptor,
        new java.lang.String[] { "TransitionRouteGroup", "UpdateMask", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteTransitionRouteGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteTransitionRouteGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteTransitionRouteGroupRequest_descriptor,
        new java.lang.String[] { "Name", "Force", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.PageProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
