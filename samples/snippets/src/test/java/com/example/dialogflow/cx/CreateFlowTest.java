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

import com.example.dialogflow.cx.CreateFlow;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.cloud.dialogflow.cx.v3beta1.AgentName;
import com.google.cloud.dialogflow.cx.v3beta1.CreateFlowRequest;
import com.google.cloud.dialogflow.cx.v3beta1.EventHandler;
import com.google.cloud.dialogflow.cx.v3beta1.Flow;
import com.google.cloud.dialogflow.cx.v3beta1.FlowName;
import com.google.cloud.dialogflow.cx.v3beta1.FlowsClient;
import com.google.cloud.dialogflow.cx.v3beta1.FlowsSettings;
import com.google.cloud.dialogflow.cx.v3beta1.Fulfillment;
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
import com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage;
import com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.Text;
import com.google.protobuf.AbstractMessage;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
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

/** Tests for {@link CreateFlow}. */
@RunWith(JUnit4.class)
public class CreateFlowTest {
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
  private FlowsClient client;
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
    FlowsSettings settings =
        FlowsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FlowsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void testCreateFlow() {
    FlowName name = FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]");
    String displayName = "displayName1615086568";
    String description = "description-1724546052";
    EventHandler eventHandler =
        EventHandler.newBuilder()
            .setEvent("sys.no-match-default")
            .setTriggerFulfillment(
                Fulfillment.newBuilder()
                    .addMessages(
                        ResponseMessage.newBuilder()
                            .setText(
                                Text.newBuilder()
                                    .addText("Sorry, could you say that again?")
                                    .build())
                            .build())
                    .build())
            .build();
    Flow expectedResponse =
        Flow.newBuilder()
            .setName(name.toString())
            .setDisplayName(displayName)
            .setDescription(description)
            .addEventHandlers(eventHandler)
            .build();
    mockFlows.addResponse(expectedResponse);

    Map<String, String> eventsToFulfillmentMessages = new HashMap<String, String>();
    eventsToFulfillmentMessages.put("sys.no-match-default", "Sorry, could you say that again?");
    Flow actualResponse =
        CreateFlow.createFlow(
            client, displayName, "[PROJECT]", "[LOCATION]", "[AGENT]", eventsToFulfillmentMessages);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFlows.getRequests();
    Assert.assertEquals(1, actualRequests.size());

    CreateFlowRequest actualRequest = (CreateFlowRequest) actualRequests.get(0);
    AgentName parent = AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]");
    Assert.assertEquals(parent, AgentName.parse(actualRequest.getParent()));

    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }
}