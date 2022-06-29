// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/experiment.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ListExperimentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ListExperimentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of experiments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Experiment experiments = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Experiment> 
      getExperimentsList();
  /**
   * <pre>
   * The list of experiments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Experiment experiments = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Experiment getExperiments(int index);
  /**
   * <pre>
   * The list of experiments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Experiment experiments = 1;</code>
   */
  int getExperimentsCount();
  /**
   * <pre>
   * The list of experiments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Experiment experiments = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ExperimentOrBuilder> 
      getExperimentsOrBuilderList();
  /**
   * <pre>
   * The list of experiments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.Experiment experiments = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ExperimentOrBuilder getExperimentsOrBuilder(
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
