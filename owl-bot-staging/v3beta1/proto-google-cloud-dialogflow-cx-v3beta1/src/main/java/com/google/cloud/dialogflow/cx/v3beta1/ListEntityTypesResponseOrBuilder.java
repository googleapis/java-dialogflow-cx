// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/entity_type.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ListEntityTypesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ListEntityTypesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of entity types. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EntityType entity_types = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.EntityType> 
      getEntityTypesList();
  /**
   * <pre>
   * The list of entity types. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EntityType entity_types = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.EntityType getEntityTypes(int index);
  /**
   * <pre>
   * The list of entity types. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EntityType entity_types = 1;</code>
   */
  int getEntityTypesCount();
  /**
   * <pre>
   * The list of entity types. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EntityType entity_types = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.EntityTypeOrBuilder> 
      getEntityTypesOrBuilderList();
  /**
   * <pre>
   * The list of entity types. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EntityType entity_types = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.EntityTypeOrBuilder getEntityTypesOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
