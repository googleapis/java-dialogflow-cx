// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/transition_route_group.proto

package com.google.cloud.dialogflow.cx.v3;

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
    internal_static_google_cloud_dialogflow_cx_v3_TransitionRouteGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_TransitionRouteGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_GetTransitionRouteGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_CreateTransitionRouteGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_UpdateTransitionRouteGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_DeleteTransitionRouteGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteTransitionRouteGroupRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/dialogflow/cx/v3/transiti" +
      "on_route_group.proto\022\035google.cloud.dialo" +
      "gflow.cx.v3\032\034google/api/annotations.prot" +
      "o\032\027google/api/client.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032(google/cloud/dialogflow/cx/v3/pa" +
      "ge.proto\032\033google/protobuf/empty.proto\032 g" +
      "oogle/protobuf/field_mask.proto\"\265\002\n\024Tran" +
      "sitionRouteGroup\022\014\n\004name\030\001 \001(\t\022\031\n\014displa" +
      "y_name\030\002 \001(\tB\003\340A\002\022I\n\021transition_routes\030\005" +
      " \003(\0132..google.cloud.dialogflow.cx.v3.Tra" +
      "nsitionRoute:\250\001\352A\244\001\n.dialogflow.googleap" +
      "is.com/TransitionRouteGroup\022rprojects/{p" +
      "roject}/locations/{location}/agents/{age" +
      "nt}/flows/{flow}/transitionRouteGroups/{" +
      "transition_route_group}\"\250\001\n ListTransiti" +
      "onRouteGroupsRequest\022F\n\006parent\030\001 \001(\tB6\340A" +
      "\002\372A0\022.dialogflow.googleapis.com/Transiti" +
      "onRouteGroup\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_" +
      "token\030\003 \001(\t\022\025\n\rlanguage_code\030\004 \001(\t\"\222\001\n!L" +
      "istTransitionRouteGroupsResponse\022T\n\027tran" +
      "sition_route_groups\030\001 \003(\01323.google.cloud" +
      ".dialogflow.cx.v3.TransitionRouteGroup\022\027" +
      "\n\017next_page_token\030\002 \001(\t\"}\n\036GetTransition" +
      "RouteGroupRequest\022D\n\004name\030\001 \001(\tB6\340A\002\372A0\n" +
      ".dialogflow.googleapis.com/TransitionRou" +
      "teGroup\022\025\n\rlanguage_code\030\002 \001(\t\"\334\001\n!Creat" +
      "eTransitionRouteGroupRequest\022F\n\006parent\030\001" +
      " \001(\tB6\340A\002\372A0\022.dialogflow.googleapis.com/" +
      "TransitionRouteGroup\022X\n\026transition_route" +
      "_group\030\002 \001(\01323.google.cloud.dialogflow.c" +
      "x.v3.TransitionRouteGroupB\003\340A\002\022\025\n\rlangua" +
      "ge_code\030\003 \001(\t\"\305\001\n!UpdateTransitionRouteG" +
      "roupRequest\022X\n\026transition_route_group\030\001 " +
      "\001(\01323.google.cloud.dialogflow.cx.v3.Tran" +
      "sitionRouteGroupB\003\340A\002\022/\n\013update_mask\030\002 \001" +
      "(\0132\032.google.protobuf.FieldMask\022\025\n\rlangua" +
      "ge_code\030\003 \001(\t\"x\n!DeleteTransitionRouteGr" +
      "oupRequest\022D\n\004name\030\001 \001(\tB6\340A\002\372A0\n.dialog" +
      "flow.googleapis.com/TransitionRouteGroup" +
      "\022\r\n\005force\030\002 \001(\0102\260\013\n\025TransitionRouteGroup" +
      "s\022\373\001\n\031ListTransitionRouteGroups\022?.google" +
      ".cloud.dialogflow.cx.v3.ListTransitionRo" +
      "uteGroupsRequest\032@.google.cloud.dialogfl" +
      "ow.cx.v3.ListTransitionRouteGroupsRespon" +
      "se\"[\202\323\344\223\002L\022J/v3/{parent=projects/*/locat" +
      "ions/*/agents/*/flows/*}/transitionRoute" +
      "Groups\332A\006parent\022\350\001\n\027GetTransitionRouteGr" +
      "oup\022=.google.cloud.dialogflow.cx.v3.GetT" +
      "ransitionRouteGroupRequest\0323.google.clou" +
      "d.dialogflow.cx.v3.TransitionRouteGroup\"" +
      "Y\202\323\344\223\002L\022J/v3/{name=projects/*/locations/" +
      "*/agents/*/flows/*/transitionRouteGroups" +
      "/*}\332A\004name\022\240\002\n\032CreateTransitionRouteGrou" +
      "p\022@.google.cloud.dialogflow.cx.v3.Create" +
      "TransitionRouteGroupRequest\0323.google.clo" +
      "ud.dialogflow.cx.v3.TransitionRouteGroup" +
      "\"\212\001\202\323\344\223\002d\"J/v3/{parent=projects/*/locati" +
      "ons/*/agents/*/flows/*}/transitionRouteG" +
      "roups:\026transition_route_group\332A\035parent,t" +
      "ransition_route_group\022\274\002\n\032UpdateTransiti" +
      "onRouteGroup\022@.google.cloud.dialogflow.c" +
      "x.v3.UpdateTransitionRouteGroupRequest\0323" +
      ".google.cloud.dialogflow.cx.v3.Transitio" +
      "nRouteGroup\"\246\001\202\323\344\223\002{2a/v3/{transition_ro" +
      "ute_group.name=projects/*/locations/*/ag" +
      "ents/*/flows/*/transitionRouteGroups/*}:" +
      "\026transition_route_group\332A\"transition_rou" +
      "te_group,update_mask\022\321\001\n\032DeleteTransitio" +
      "nRouteGroup\022@.google.cloud.dialogflow.cx" +
      ".v3.DeleteTransitionRouteGroupRequest\032\026." +
      "google.protobuf.Empty\"Y\202\323\344\223\002L*J/v3/{name" +
      "=projects/*/locations/*/agents/*/flows/*" +
      "/transitionRouteGroups/*}\332A\004name\032x\312A\031dia" +
      "logflow.googleapis.com\322AYhttps://www.goo" +
      "gleapis.com/auth/cloud-platform,https://" +
      "www.googleapis.com/auth/dialogflowB\277\001\n!c" +
      "om.google.cloud.dialogflow.cx.v3B\031Transi" +
      "tionRouteGroupProtoP\001Z1cloud.google.com/" +
      "go/dialogflow/cx/apiv3/cxpb;cxpb\370\001\001\242\002\002DF" +
      "\252\002\035Google.Cloud.Dialogflow.Cx.V3\352\002!Googl" +
      "e::Cloud::Dialogflow::CX::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.cx.v3.PageProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3_TransitionRouteGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_TransitionRouteGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_TransitionRouteGroup_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "TransitionRoutes", });
    internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListTransitionRouteGroupsResponse_descriptor,
        new java.lang.String[] { "TransitionRouteGroups", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_GetTransitionRouteGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_GetTransitionRouteGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_GetTransitionRouteGroupRequest_descriptor,
        new java.lang.String[] { "Name", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3_CreateTransitionRouteGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_CreateTransitionRouteGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_CreateTransitionRouteGroupRequest_descriptor,
        new java.lang.String[] { "Parent", "TransitionRouteGroup", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateTransitionRouteGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateTransitionRouteGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_UpdateTransitionRouteGroupRequest_descriptor,
        new java.lang.String[] { "TransitionRouteGroup", "UpdateMask", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteTransitionRouteGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteTransitionRouteGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_DeleteTransitionRouteGroupRequest_descriptor,
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
    com.google.cloud.dialogflow.cx.v3.PageProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}