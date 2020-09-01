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

import com.example.dialogflow.cx.CreatePage;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.cloud.dialogflow.cx.v3beta1.CreatePageRequest;
import com.google.cloud.dialogflow.cx.v3beta1.FlowName;
import com.google.cloud.dialogflow.cx.v3beta1.Form;
import com.google.cloud.dialogflow.cx.v3beta1.Form.Parameter;
import com.google.cloud.dialogflow.cx.v3beta1.Form.Parameter.FillBehavior;
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
import com.google.cloud.dialogflow.cx.v3beta1.Page;
import com.google.cloud.dialogflow.cx.v3beta1.PageName;
import com.google.cloud.dialogflow.cx.v3beta1.PagesClient;
import com.google.cloud.dialogflow.cx.v3beta1.PagesSettings;
import com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage;
import com.google.cloud.dialogflow.cx.v3beta1.ResponseMessage.Text;
import com.google.protobuf.AbstractMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for {@link CreatePage}. */
@RunWith(JUnit4.class)
public class CreatePageTest {
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
  private PagesClient client;
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
    PagesSettings settings =
        PagesSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = PagesClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void testCreatePage() {
    PageName name = PageName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[PAGE]");
    String displayName = "displayName1615086568";
    Fulfillment entryFulfillment =
        Fulfillment.newBuilder()
            .addMessages(
                ResponseMessage.newBuilder()
                    .setText(Text.newBuilder().addText("Hi!").build())
                    .build())
            .build();
    FillBehavior fillBehavior =
        FillBehavior.newBuilder()
            .setInitialPromptFulfillment(
                Fulfillment.newBuilder()
                    .addMessages(
                        ResponseMessage.newBuilder()
                            .setText(Text.newBuilder().addText("What would you like?").build())
                            .build())
                    .build())
            .build();
    Form form =
        Form.newBuilder()
            .addParameters(
                Parameter.newBuilder()
                    .setDisplayName("param")
                    .setRequired(true)
                    .setEntityType("projects/-/locations/-/agents/-/entityTypes/sys.any")
                    .setFillBehavior(fillBehavior)
                    .build())
            .build();
    Page expectedResponse =
        Page.newBuilder()
            .setName(name.toString())
            .setDisplayName(displayName)
            .setEntryFulfillment(entryFulfillment)
            .setForm(form)
            .build();
    mockPages.addResponse(expectedResponse);

    List<String> entryTexts = new ArrayList<String>();
    entryTexts.add("Hi!");
    Page actualResponse =
        CreatePage.createPage(
            client, displayName, "[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", entryTexts);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPages.getRequests();
    Assert.assertEquals(1, actualRequests.size());

    CreatePageRequest actualRequest = (CreatePageRequest) actualRequests.get(0);
    FlowName parent = FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]");
    Assert.assertEquals(parent, FlowName.parse(actualRequest.getParent()));

    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }
}
