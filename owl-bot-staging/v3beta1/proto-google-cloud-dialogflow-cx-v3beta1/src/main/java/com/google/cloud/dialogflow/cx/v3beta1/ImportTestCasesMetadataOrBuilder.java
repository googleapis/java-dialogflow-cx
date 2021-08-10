// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ImportTestCasesMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ImportTestCasesMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Errors for failed test cases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseError errors = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestCaseError> 
      getErrorsList();
  /**
   * <pre>
   * Errors for failed test cases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseError errors = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TestCaseError getErrors(int index);
  /**
   * <pre>
   * Errors for failed test cases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseError errors = 1;</code>
   */
  int getErrorsCount();
  /**
   * <pre>
   * Errors for failed test cases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseError errors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.TestCaseErrorOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <pre>
   * Errors for failed test cases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseError errors = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TestCaseErrorOrBuilder getErrorsOrBuilder(
      int index);
}