/*
 * Copyright 2021 Google LLC
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

package dialogflow.cx;

// [START dialogflow_cx_create_agent]

import com.google.cloud.dialogflow.cx.v3.Agent;
import com.google.cloud.dialogflow.cx.v3.Agent.Builder;
import com.google.cloud.dialogflow.cx.v3.AgentsClient;
import com.google.cloud.dialogflow.cx.v3.AgentsSettings;
import java.io.IOException;


public class CreateAgent {

  public static void main(String[] args) throws IOException {
    createAgent("My-Project-Id", "Agent-Name");
  }

  public static Agent createAgent(String parent, String agentName) throws IOException {

    String apiEndpoint = "global-dialogflow.googleapis.com:443";

    String parentPath = "projects/" + parent + "/locations/global";

    AgentsSettings agentsSettings = AgentsSettings.newBuilder().setEndpoint(apiEndpoint).build();
    AgentsClient client = AgentsClient.create(agentsSettings);

    Builder build = Agent.newBuilder();
    build.setDefaultLanguageCode("en");
    build.setDisplayName(agentName);
    build.setTimeZone("America/Los_Angeles");

    Agent agent = build.build();

    return client.createAgent(parentPath, agent);
  }

}
// [END dialogflow_cx_create_agent]
