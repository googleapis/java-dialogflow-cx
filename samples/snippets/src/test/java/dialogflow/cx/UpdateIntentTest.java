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

package dialogflow.cx;

import com.google.cloud.dialogflow.cx.v3.Agent;
import com.google.cloud.dialogflow.cx.v3.Agent.Builder;
import com.google.cloud.dialogflow.cx.v3.AgentsClient;
import com.google.cloud.dialogflow.cx.v3.AgentsSettings;
import com.google.cloud.dialogflow.cx.v3.DeleteAgentRequest;
import com.google.cloud.dialogflow.cx.v3.Intent;
import com.google.cloud.dialogflow.cx.v3.IntentsClient;
import java.io.IOException;
import java.util.UUID;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UpdateIntentTest {

  private static String PROJECT_ID = System.getenv().get("GOOGLE_CLOUD_PROJECT");
  private static String parent = "";
  private static String intentID = "";
  private static String intentPath = "";
  private static String agentID = "";

  @Before
  public void setUp() throws IOException {

    Builder build = Agent.newBuilder();
    build.setDefaultLanguageCode("en");
    build.setDisplayName("temp_agent_" + UUID.randomUUID().toString());
    build.setTimeZone("America/Los_Angeles");

    Agent agent = build.build();

    String apiEndpoint = "global-dialogflow.googleapis.com:443";
    String parentPath = "projects/" + PROJECT_ID + "/locations/global";

    AgentsSettings agentsSettings = AgentsSettings.newBuilder().setEndpoint(apiEndpoint).build();
    AgentsClient client = AgentsClient.create(agentsSettings);

    parent = client.createAgent(parentPath, agent).getName();
    UpdateIntentTest.agentID = parent.split("/")[5];

    try (IntentsClient intentsClient = IntentsClient.create()) {
      com.google.cloud.dialogflow.cx.v3.Intent.Builder intent = Intent.newBuilder();
      intent.setDisplayName("temp_intent_" + UUID.randomUUID().toString());

      UpdateIntentTest.intentPath = intentsClient.createIntent(parent, intent.build()).getName();
      UpdateIntentTest.intentID = UpdateIntentTest.intentPath.split("/")[7];
    }
  }

  @After
  public void tearDown() throws IOException {
    String apiEndpoint = "global-dialogflow.googleapis.com:443";
    String parentPath = "projects/" + PROJECT_ID + "/locations/global";

    AgentsSettings agentsSettings = AgentsSettings.newBuilder().setEndpoint(apiEndpoint).build();
    AgentsClient client = AgentsClient.create(agentsSettings);

    client.deleteAgent(parent);
  }

  @Test
  public void testUpdateIntent() throws IOException {

    String fakeIntent = "fake_intent_" + UUID.randomUUID().toString();

    Intent actualResponse = UpdateIntent
        .updateIntent(PROJECT_ID, UpdateIntentTest.agentID, UpdateIntentTest.intentID, "global",
            fakeIntent);

    try (IntentsClient intentsClient = IntentsClient.create()) {
      // Set the project agent name using the projectID (my-project-id)
      intentsClient.deleteIntent(actualResponse.getName());
    }

    Assert.assertEquals(actualResponse.getDisplayName(), fakeIntent);
  }
}
