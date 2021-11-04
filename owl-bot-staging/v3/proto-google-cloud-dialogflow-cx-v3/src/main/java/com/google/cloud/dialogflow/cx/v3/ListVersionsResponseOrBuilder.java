// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/version.proto

package com.google.cloud.dialogflow.cx.v3;

public interface ListVersionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.ListVersionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of versions. There will be a maximum number of items returned based
   * on the page_size field in the request. The list may in some cases be empty
   * or contain fewer entries than page_size even if this isn't the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Version versions = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.Version> 
      getVersionsList();
  /**
   * <pre>
   * A list of versions. There will be a maximum number of items returned based
   * on the page_size field in the request. The list may in some cases be empty
   * or contain fewer entries than page_size even if this isn't the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Version versions = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.Version getVersions(int index);
  /**
   * <pre>
   * A list of versions. There will be a maximum number of items returned based
   * on the page_size field in the request. The list may in some cases be empty
   * or contain fewer entries than page_size even if this isn't the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Version versions = 1;</code>
   */
  int getVersionsCount();
  /**
   * <pre>
   * A list of versions. There will be a maximum number of items returned based
   * on the page_size field in the request. The list may in some cases be empty
   * or contain fewer entries than page_size even if this isn't the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Version versions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.VersionOrBuilder> 
      getVersionsOrBuilderList();
  /**
   * <pre>
   * A list of versions. There will be a maximum number of items returned based
   * on the page_size field in the request. The list may in some cases be empty
   * or contain fewer entries than page_size even if this isn't the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Version versions = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.VersionOrBuilder getVersionsOrBuilder(
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