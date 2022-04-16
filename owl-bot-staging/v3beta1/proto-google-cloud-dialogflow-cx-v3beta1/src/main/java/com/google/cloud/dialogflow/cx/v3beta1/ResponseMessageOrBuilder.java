// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/response_message.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returns a text response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.Text text = 1;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Returns a text response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.Text text = 1;</code>
   * @return The text.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.Text getText();
  /**
   * <pre>
   * Returns a text response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.Text text = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.TextOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * Returns a response containing a custom, platform-specific payload.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 2;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * Returns a response containing a custom, platform-specific payload.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 2;</code>
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   * <pre>
   * Returns a response containing a custom, platform-specific payload.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   * <pre>
   * Indicates that the conversation succeeded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.ConversationSuccess conversation_success = 9;</code>
   * @return Whether the conversationSuccess field is set.
   */
  boolean hasConversationSuccess();
  /**
   * <pre>
   * Indicates that the conversation succeeded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.ConversationSuccess conversation_success = 9;</code>
   * @return The conversationSuccess.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.ConversationSuccess getConversationSuccess();
  /**
   * <pre>
   * Indicates that the conversation succeeded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.ConversationSuccess conversation_success = 9;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.ConversationSuccessOrBuilder getConversationSuccessOrBuilder();

  /**
   * <pre>
   * A text or ssml response that is preferentially used for TTS output audio
   * synthesis, as described in the comment on the ResponseMessage message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.OutputAudioText output_audio_text = 8;</code>
   * @return Whether the outputAudioText field is set.
   */
  boolean hasOutputAudioText();
  /**
   * <pre>
   * A text or ssml response that is preferentially used for TTS output audio
   * synthesis, as described in the comment on the ResponseMessage message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.OutputAudioText output_audio_text = 8;</code>
   * @return The outputAudioText.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.OutputAudioText getOutputAudioText();
  /**
   * <pre>
   * A text or ssml response that is preferentially used for TTS output audio
   * synthesis, as described in the comment on the ResponseMessage message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.OutputAudioText output_audio_text = 8;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.OutputAudioTextOrBuilder getOutputAudioTextOrBuilder();

  /**
   * <pre>
   * Hands off conversation to a human agent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.LiveAgentHandoff live_agent_handoff = 10;</code>
   * @return Whether the liveAgentHandoff field is set.
   */
  boolean hasLiveAgentHandoff();
  /**
   * <pre>
   * Hands off conversation to a human agent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.LiveAgentHandoff live_agent_handoff = 10;</code>
   * @return The liveAgentHandoff.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.LiveAgentHandoff getLiveAgentHandoff();
  /**
   * <pre>
   * Hands off conversation to a human agent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.LiveAgentHandoff live_agent_handoff = 10;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.LiveAgentHandoffOrBuilder getLiveAgentHandoffOrBuilder();

  /**
   * <pre>
   * Output only. A signal that indicates the interaction with the Dialogflow agent has
   * ended.
   * This message is generated by Dialogflow only when the conversation
   * reaches `END_SESSION` page. It is not supposed to be defined by the user.
   * It's guaranteed that there is at most one such message in each response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.EndInteraction end_interaction = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endInteraction field is set.
   */
  boolean hasEndInteraction();
  /**
   * <pre>
   * Output only. A signal that indicates the interaction with the Dialogflow agent has
   * ended.
   * This message is generated by Dialogflow only when the conversation
   * reaches `END_SESSION` page. It is not supposed to be defined by the user.
   * It's guaranteed that there is at most one such message in each response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.EndInteraction end_interaction = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endInteraction.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.EndInteraction getEndInteraction();
  /**
   * <pre>
   * Output only. A signal that indicates the interaction with the Dialogflow agent has
   * ended.
   * This message is generated by Dialogflow only when the conversation
   * reaches `END_SESSION` page. It is not supposed to be defined by the user.
   * It's guaranteed that there is at most one such message in each response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.EndInteraction end_interaction = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.EndInteractionOrBuilder getEndInteractionOrBuilder();

  /**
   * <pre>
   * Signal that the client should play an audio clip hosted at a
   * client-specific URI. Dialogflow uses this to construct
   * [mixed_audio][google.cloud.dialogflow.cx.v3beta1.ResponseMessage.mixed_audio]. However, Dialogflow itself
   * does not try to read or process the URI in any way.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.PlayAudio play_audio = 12;</code>
   * @return Whether the playAudio field is set.
   */
  boolean hasPlayAudio();
  /**
   * <pre>
   * Signal that the client should play an audio clip hosted at a
   * client-specific URI. Dialogflow uses this to construct
   * [mixed_audio][google.cloud.dialogflow.cx.v3beta1.ResponseMessage.mixed_audio]. However, Dialogflow itself
   * does not try to read or process the URI in any way.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.PlayAudio play_audio = 12;</code>
   * @return The playAudio.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.PlayAudio getPlayAudio();
  /**
   * <pre>
   * Signal that the client should play an audio clip hosted at a
   * client-specific URI. Dialogflow uses this to construct
   * [mixed_audio][google.cloud.dialogflow.cx.v3beta1.ResponseMessage.mixed_audio]. However, Dialogflow itself
   * does not try to read or process the URI in any way.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.PlayAudio play_audio = 12;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.PlayAudioOrBuilder getPlayAudioOrBuilder();

  /**
   * <pre>
   * Output only. An audio response message composed of both the synthesized Dialogflow
   * agent responses and responses defined via
   * [play_audio][google.cloud.dialogflow.cx.v3beta1.ResponseMessage.play_audio].
   * This message is generated by Dialogflow only and not supposed to be
   * defined by the user.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.MixedAudio mixed_audio = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the mixedAudio field is set.
   */
  boolean hasMixedAudio();
  /**
   * <pre>
   * Output only. An audio response message composed of both the synthesized Dialogflow
   * agent responses and responses defined via
   * [play_audio][google.cloud.dialogflow.cx.v3beta1.ResponseMessage.play_audio].
   * This message is generated by Dialogflow only and not supposed to be
   * defined by the user.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.MixedAudio mixed_audio = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The mixedAudio.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.MixedAudio getMixedAudio();
  /**
   * <pre>
   * Output only. An audio response message composed of both the synthesized Dialogflow
   * agent responses and responses defined via
   * [play_audio][google.cloud.dialogflow.cx.v3beta1.ResponseMessage.play_audio].
   * This message is generated by Dialogflow only and not supposed to be
   * defined by the user.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.MixedAudio mixed_audio = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.MixedAudioOrBuilder getMixedAudioOrBuilder();

  /**
   * <pre>
   * A signal that the client should transfer the phone call connected to
   * this agent to a third-party endpoint.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.TelephonyTransferCall telephony_transfer_call = 18;</code>
   * @return Whether the telephonyTransferCall field is set.
   */
  boolean hasTelephonyTransferCall();
  /**
   * <pre>
   * A signal that the client should transfer the phone call connected to
   * this agent to a third-party endpoint.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.TelephonyTransferCall telephony_transfer_call = 18;</code>
   * @return The telephonyTransferCall.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.TelephonyTransferCall getTelephonyTransferCall();
  /**
   * <pre>
   * A signal that the client should transfer the phone call connected to
   * this agent to a third-party endpoint.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.TelephonyTransferCall telephony_transfer_call = 18;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.TelephonyTransferCallOrBuilder getTelephonyTransferCallOrBuilder();

  public com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.MessageCase getMessageCase();
}
