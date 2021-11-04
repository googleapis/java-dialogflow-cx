// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/changelog.proto

package com.google.cloud.dialogflow.cx.v3;

public interface ListChangelogsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.ListChangelogsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of changelogs. There will be a maximum number of items returned
   * based on the page_size field in the request. The changelogs will be ordered
   * by timestamp.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.Changelog> 
      getChangelogsList();
  /**
   * <pre>
   * The list of changelogs. There will be a maximum number of items returned
   * based on the page_size field in the request. The changelogs will be ordered
   * by timestamp.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.Changelog getChangelogs(int index);
  /**
   * <pre>
   * The list of changelogs. There will be a maximum number of items returned
   * based on the page_size field in the request. The changelogs will be ordered
   * by timestamp.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
   */
  int getChangelogsCount();
  /**
   * <pre>
   * The list of changelogs. There will be a maximum number of items returned
   * based on the page_size field in the request. The changelogs will be ordered
   * by timestamp.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.ChangelogOrBuilder> 
      getChangelogsOrBuilderList();
  /**
   * <pre>
   * The list of changelogs. There will be a maximum number of items returned
   * based on the page_size field in the request. The changelogs will be ordered
   * by timestamp.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ChangelogOrBuilder getChangelogsOrBuilder(
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
