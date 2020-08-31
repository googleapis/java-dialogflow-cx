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

// [START dialogflow_cx_detect_intent_text]

import com.google.api.gax.rpc.ApiException;
import com.google.cloud.dialogflow.cx.v3beta1.DetectIntentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.DetectIntentResponse;
import com.google.cloud.dialogflow.cx.v3beta1.QueryInput;
import com.google.cloud.dialogflow.cx.v3beta1.QueryResult;
import com.google.cloud.dialogflow.cx.v3beta1.SessionName;
import com.google.cloud.dialogflow.cx.v3beta1.SessionsClient;
import com.google.cloud.dialogflow.cx.v3beta1.TextInput;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class DetectIntent {

  // DialogFlow API Detect Intent sample with text inputs.
  public static Map<String, QueryResult> detectIntent(
      String projectId,
      String locationId,
      String agentId,
      String sessionId,
      List<String> texts,
      String languageCode)
      throws IOException, ApiException {
    Map<String, QueryResult> queryResults = Maps.newHashMap();
    // Instantiates a client
    try (SessionsClient sessionsClient = SessionsClient.create()) {
      // Set the session name using the projectID (my-project-id), locationID (global), agentID
      // (UUID), and sessionId (UUID).
      SessionName session = SessionName.of(projectId, locationId, agentId, sessionId);
      System.out.println("Session Path: " + session.toString());

      // Detect intents for each text input.
      for (String text : texts) {
        // Set the text (hello) for the query.
        TextInput.Builder textInput = TextInput.newBuilder().setText(text);

        // Build the query with the TextInput and language code (en-US).
        QueryInput queryInput =
            QueryInput.newBuilder().setText(textInput).setLanguageCode(languageCode).build();

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

        System.out.println("====================");
        System.out.format("Query Text: '%s'\n", queryResult.getText());
        System.out.format(
            "Detected Intent: %s (confidence: %f)\n",
            queryResult.getIntent().getDisplayName(), queryResult.getIntentDetectionConfidence());

        queryResults.put(text, queryResult);
      }
    }
    return queryResults;
  }
}
// [END dialogflow_cx_detect_intent_text]
