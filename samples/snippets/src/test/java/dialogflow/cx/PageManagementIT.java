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

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertTrue;

import com.google.cloud.dialogflow.cx.v3.Agent;
import com.google.cloud.dialogflow.cx.v3.Agent.Builder;
import com.google.cloud.dialogflow.cx.v3.AgentsClient;
import com.google.cloud.dialogflow.cx.v3.AgentsSettings;
import com.google.cloud.dialogflow.cx.v3.Intent;
import com.google.cloud.dialogflow.cx.v3.IntentsClient;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Integration (system) tests for {@link PageManagment}.
 */
public class PageManagementIT {

  private static String PROJECT_ID = System.getenv().get("GOOGLE_CLOUD_PROJECT");
  private static String parent = "";
  private static String agentID = "";
  private static String pageID = "";
  private static String flowID = "";
  private static String location = "";
  private static String displayName = "temp_page_" + UUID.randomUUID().toString();

  private ByteArrayOutputStream stdOut;

  @Before
  public void setUp() throws IOException {

    stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));

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
    PageManagementIT.agentID = parent.split("/")[5];

  }

  @After
  public void tearDown() throws IOException {
    stdOut = null;
    System.setOut(null);
    String apiEndpoint = "global-dialogflow.googleapis.com:443";
    String parentPath = "projects/" + PROJECT_ID + "/locations/global";

    AgentsSettings agentsSettings = AgentsSettings.newBuilder().setEndpoint(apiEndpoint).build();
    AgentsClient client = AgentsClient.create(agentsSettings);

    client.deleteAgent(parent);
  }

  @Test
  public void testCreatePage() throws IOException {
    PageManagment
        .createPage(PageManagementIT.PROJECT_ID, PageManagementIT.agentID, PageManagementIT.flowID,
            PageManagementIT.location, PageManagementIT.displayName);

    Gson g = new Gson();
    com.google.cloud.dialogflow.cx.v3.Page p = g.fromJson(stdOut.toString(), com.google.cloud.dialogflow.cx.v3.Page);

    PageManagementIT.pageID = p.name.split("/")[9];

    assertThat(p.display_name).equals(PageManagementIT.displayName);

    stdOut = null;
    System.setOut(null);
  }

  @Test
  public void testListPages() throws IOException {
    PageManagment
        .listPages(PageManagementIT.PROJECT_ID, PageManagementIT.agentID, PageManagementIT.flowID,
            PageManagementIT.location);
    assertThat(stdOut.toString()).contains(PageManagementIT.displayName);

    stdOut = null;
    System.setOut(null);
  }

  @Test
  public void testDeletePage() throws IOException {
    try {
      PageManagment
          .deletePage(PageManagementIT.PROJECT_ID, PageManagementIT.agentID, 
            PageManagementIT.flowID, PageManagementIT.pageID, PageManagementIT.location);
      assertTrue(true);
    } catch (Exception e) {
      assertTrue(false);
    }
  }
}
