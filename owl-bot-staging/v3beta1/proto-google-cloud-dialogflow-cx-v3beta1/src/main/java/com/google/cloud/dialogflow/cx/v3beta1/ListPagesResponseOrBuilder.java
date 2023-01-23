// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/page.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ListPagesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ListPagesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of pages. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Page> 
      getPagesList();
  /**
   * <pre>
   * The list of pages. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Page getPages(int index);
  /**
   * <pre>
   * The list of pages. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
   */
  int getPagesCount();
  /**
   * <pre>
   * The list of pages. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.PageOrBuilder> 
      getPagesOrBuilderList();
  /**
   * <pre>
   * The list of pages. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Page pages = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.PageOrBuilder getPagesOrBuilder(
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