// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/flow.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ListFlowsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ListFlowsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of flows. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Flow flows = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Flow> 
      getFlowsList();
  /**
   * <pre>
   * The list of flows. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Flow flows = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Flow getFlows(int index);
  /**
   * <pre>
   * The list of flows. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Flow flows = 1;</code>
   */
  int getFlowsCount();
  /**
   * <pre>
   * The list of flows. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Flow flows = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.FlowOrBuilder> 
      getFlowsOrBuilderList();
  /**
   * <pre>
   * The list of flows. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Flow flows = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.FlowOrBuilder getFlowsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
