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

package com.example.dialogflow.cx;

import static org.junit.Assert.assertEquals;

import com.google.cloud.dialogflow.cx.v3beta1.Flow;
import com.google.cloud.dialogflow.cx.v3beta1.FlowsClient;
import java.util.Map;
import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Integration (system) tests for {@link CreateFlow}. */
@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class CreateFlowIT {

  private static String DISPLAY_NAME = "flow-" + UUID.randomUUID().toString();
  private static String PROJECT_ID = System.getenv().get("GOOGLE_CLOUD_PROJECT");
  private static String LOCATION = "global";
  private static String AGENT_ID = System.getenv().get("DIALOGFLOW_CX_AGENT_ID");
  private static Map<String, String> EVENT_TO_FULFILLMENT_MESSAGES =
      Map.of("event-1", "message-1", "event-2", "message-2");

  @Test
  public void testCreateFlow() throws Exception {
    Flow result =
        CreateFlow.createFlow(
            DISPLAY_NAME, PROJECT_ID, LOCATION, AGENT_ID, EVENT_TO_FULFILLMENT_MESSAGES);
    assertEquals(result.getDisplayName(), DISPLAY_NAME);
    // Number of added event handlers + 2 default event handlers.
    assertEquals(result.getEventHandlersCount(), EVENT_TO_FULFILLMENT_MESSAGES.size() + 2);

    // Delete the newly created Flow.
    deleteFlow(result.getName());
  }

  private void deleteFlow(String flowName) throws Exception {
    try (FlowsClient flowsClient = FlowsClient.create()) {
      flowsClient.deleteFlow(flowName);
    }
  }
}
