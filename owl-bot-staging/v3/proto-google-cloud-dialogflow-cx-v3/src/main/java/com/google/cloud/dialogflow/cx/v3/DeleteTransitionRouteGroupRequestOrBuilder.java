// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/transition_route_group.proto

package com.google.cloud.dialogflow.cx.v3;

public interface DeleteTransitionRouteGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.DeleteTransitionRouteGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the [TransitionRouteGroup][google.cloud.dialogflow.cx.v3.TransitionRouteGroup] to delete.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;Transition Route Group ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the [TransitionRouteGroup][google.cloud.dialogflow.cx.v3.TransitionRouteGroup] to delete.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;Transition Route Group ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * This field has no effect for transition route group that no page is using.
   * If the transition route group is referenced by any page:
   * *  If `force` is set to false, an error will be returned with message
   *    indicating pages that reference the transition route group.
   * *  If `force` is set to true, Dialogflow will remove the transition route
   *    group, as well as any reference to it.
   * </pre>
   *
   * <code>bool force = 2;</code>
   * @return The force.
   */
  boolean getForce();
}
