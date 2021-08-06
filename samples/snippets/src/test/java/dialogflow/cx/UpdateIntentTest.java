/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.dialogflow;

import com.google.cloud.dialogflow.cx.v3.AgentName;
import com.google.cloud.dialogflow.cx.v3.Intent;
import com.google.cloud.dialogflow.cx.v3.Intent.Builder;
import com.google.cloud.dialogflow.cx.v3.IntentsClient;
import java.io.IOException;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class UpdateIntentTest {

  private static String PROJECT_ID = System.getenv().get("GOOGLE_CLOUD_PROJECT");
  private static String intentID = "";
  private static String agentID = "";
  private static String parent = "";

  @Before
  public void setUp() throws IOException {

    String apiEndpoint = "global-dialogflow.googleapis.com:443";

    String parentPath = "projects/" + parent + "/locations/global";

    AgentsSettings agentsSettings = AgentsSettings.newBuilder().setEndpoint(apiEndpoint).build();
    AgentsClient client = AgentsClient.create(agentsSettings);

    Builder build = Agent.newBuilder();
    build.setDefaultLanguageCode("en");
    build.setDisplayName("temp_agent_" + UUID.randomUUID().toString());
    build.setTimeZone("America/Los_Angeles");

    Agent agent = build.build();

    parent = client.createAgent(parentPath, agent).getName();
    agentID = parent.split("/")[5];

    try (IntentsClient intentsClient = IntentsClient.create()) {

      for (Intent intent : intentsClient.listIntents(parent).iterateAll()) {
        intentID = intent.getName().split("/")[7];
      }
    }
  }

  @Test
  public void testUpdateIntent() throws IOException {

    String fakeIntent = "fake_intent_" + UUID.randomUUID().toString();

    Intent actualResponse = UpdateIntent.updateIntent(PROJECT_ID, IntentID, "global",
        fakeIntent);

    try (IntentsClient intentsClient = IntentsClient.create()) {
      // Set the project agent name using the projectID (my-project-id)
      intentsClient.deleteIntent(actualResponse.getName());
    }

    Assert.assertEquals(actualResponse.getDisplayName(), fakeIntent);
  }
}
