/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dialogflow.cx;

import com.example.dialogflow.cx.DetectIntent;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.cloud.dialogflow.cx.v3beta1.DetectIntentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.DetectIntentResponse;
import com.google.cloud.dialogflow.cx.v3beta1.MockAgents;
import com.google.cloud.dialogflow.cx.v3beta1.MockEntityTypes;
import com.google.cloud.dialogflow.cx.v3beta1.MockEnvironments;
import com.google.cloud.dialogflow.cx.v3beta1.MockFlows;
import com.google.cloud.dialogflow.cx.v3beta1.MockIntents;
import com.google.cloud.dialogflow.cx.v3beta1.MockPages;
import com.google.cloud.dialogflow.cx.v3beta1.MockSessionEntityTypes;
import com.google.cloud.dialogflow.cx.v3beta1.MockSessions;
import com.google.cloud.dialogflow.cx.v3beta1.MockTransitionRouteGroups;
import com.google.cloud.dialogflow.cx.v3beta1.MockVersions;
import com.google.cloud.dialogflow.cx.v3beta1.MockWebhooks;
import com.google.cloud.dialogflow.cx.v3beta1.QueryInput;
import com.google.cloud.dialogflow.cx.v3beta1.QueryResult;
import com.google.cloud.dialogflow.cx.v3beta1.SessionName;
import com.google.cloud.dialogflow.cx.v3beta1.SessionsClient;
import com.google.cloud.dialogflow.cx.v3beta1.SessionsSettings;
import com.google.cloud.dialogflow.cx.v3beta1.TextInput;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for {@link DetectIntent}. */
@RunWith(JUnit4.class)
public class DetectIntentTest {
  private static MockPages mockPages;
  private static MockFlows mockFlows;
  private static MockAgents mockAgents;
  private static MockEntityTypes mockEntityTypes;
  private static MockEnvironments mockEnvironments;
  private static MockIntents mockIntents;
  private static MockSessionEntityTypes mockSessionEntityTypes;
  private static MockSessions mockSessions;
  private static MockTransitionRouteGroups mockTransitionRouteGroups;
  private static MockVersions mockVersions;
  private static MockWebhooks mockWebhooks;
  private static MockServiceHelper serviceHelper;
  private SessionsClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockPages = new MockPages();
    mockFlows = new MockFlows();
    mockAgents = new MockAgents();
    mockEntityTypes = new MockEntityTypes();
    mockEnvironments = new MockEnvironments();
    mockIntents = new MockIntents();
    mockSessionEntityTypes = new MockSessionEntityTypes();
    mockSessions = new MockSessions();
    mockTransitionRouteGroups = new MockTransitionRouteGroups();
    mockVersions = new MockVersions();
    mockWebhooks = new MockWebhooks();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(
                mockPages,
                mockFlows,
                mockAgents,
                mockEntityTypes,
                mockEnvironments,
                mockIntents,
                mockSessionEntityTypes,
                mockSessions,
                mockTransitionRouteGroups,
                mockVersions,
                mockWebhooks));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    SessionsSettings settings =
        SessionsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SessionsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void testDetectIntent() {
    String responseId = "responseId1847552473";
    ByteString outputAudio = ByteString.copyFromUtf8("24");
    DetectIntentResponse expectedResponse =
        DetectIntentResponse.newBuilder()
            .setResponseId(responseId)
            .setOutputAudio(outputAudio)
            .build();
    mockSessions.addResponse(expectedResponse);

    List<String> texts = new ArrayList<>();
    texts.add("Hi");
    Map<String, QueryResult> actualResponse =
        DetectIntent.detectIntent(
            client, "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]", texts, "en-US");
    Assert.assertEquals(1, actualResponse.size());
    Assert.assertTrue(actualResponse.containsKey("Hi"));

    List<AbstractMessage> actualRequests = mockSessions.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DetectIntentRequest actualRequest = (DetectIntentRequest) actualRequests.get(0);

    SessionName session =
        SessionName.ofProjectLocationAgentSessionName(
            "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]");
    Assert.assertEquals(session, SessionName.parse(actualRequest.getSession()));
    TextInput.Builder textInput = TextInput.newBuilder().setText("Hi");
    QueryInput queryInput =
        QueryInput.newBuilder().setText(textInput).setLanguageCode("en-US").build();
    Assert.assertEquals(queryInput, actualRequest.getQueryInput());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }
}
