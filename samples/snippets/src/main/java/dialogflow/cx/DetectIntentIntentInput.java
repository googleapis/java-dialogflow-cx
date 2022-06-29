/*
 * Copyright 2022 Google LLC
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

// [START dialogflow_cx_detect_intent_intent_input]

import com.google.api.gax.rpc.ApiException;
import com.google.cloud.dialogflow.cx.v3beta1.DetectIntentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.DetectIntentResponse;
import com.google.cloud.dialogflow.cx.v3beta1.IntentInput;
import com.google.cloud.dialogflow.cx.v3beta1.QueryInput;
import com.google.cloud.dialogflow.cx.v3beta1.QueryResult;
import com.google.cloud.dialogflow.cx.v3beta1.SessionName;
import com.google.cloud.dialogflow.cx.v3beta1.SessionsClient;
import com.google.cloud.dialogflow.cx.v3beta1.SessionsSettings;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class DetectIntentIntentInput {

  // DialogFlow API Detect Intent sample with Intent input.
  public static void main(String[] args) throws IOException, ApiException {
    String projectId = "my-project-id";
    String locationId = "my-location-id";
    String agentId = "my-agent-id";
    String sessionId = "my-session-id";
    String intent = "my-intent-id";
    String languageCode = "my-language-code";

    detectIntent(projectId, locationId, agentId, sessionId, intent, languageCode);
  }

  public static void detectIntent(
      String projectId,
      String locationId,
      String agentId,
      String sessionId,
      String intent,
      String languageCode)
      throws IOException, ApiException {

    SessionsSettings.Builder sessionsSettingsBuilder = SessionsSettings.newBuilder();
    if (locationId.equals("global")) {
      sessionsSettingsBuilder.setEndpoint("dialogflow.googleapis.com:443");
    } else {
      sessionsSettingsBuilder.setEndpoint(locationId + "-dialogflow.googleapis.com:443");
    }
    SessionsSettings sessionsSettings = sessionsSettingsBuilder.build();

    // Instantiates a client
    try (SessionsClient sessionsClient = SessionsClient.create(sessionsSettings)) {
      // Set the session name using the projectID (my-project-id), locationID (global), agentID
      // (UUID), and sessionId (UUID).
      SessionName session =
          SessionName.ofProjectLocationAgentSessionName(projectId, locationId, agentId, sessionId);

      // TODO : Uncomment if you want to print session path
      // System.out.println("Session Path: " + session.toString());

      IntentInput.Builder intentInput = IntentInput.newBuilder().setIntent(intent);

      // Build the query with the TextInput and language code (en-US).
      QueryInput queryInput =
          QueryInput.newBuilder().setIntent(intentInput).setLanguageCode(languageCode).build();

      // Build the DetectIntentRequest with the SessionName and QueryInput.
      DetectIntentRequest request =
           DetectIntentRequest.newBuilder()
          .setSession(session.toString())
          .setQueryInput(queryInput)
          .build();

      // Performs the detect intent request.
      DetectIntentResponse response = sessionsClient.detectIntent(request);

      // Display the query result.
      QueryResult queryResult = response.getQueryResult();

      // TODO : Uncomment if you want to print queryResult
      System.out.println("====================");
      System.out.format(
          "Detected Intent: %s (confidence: %f)\n",
          queryResult.getIntent().getDisplayName(),
          queryResult.getIntentDetectionConfidence());
    }
  }
}

// [END dialogflow_cx_detect_intent_intent_input]
