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

import com.google.cloud.dialogflow.cx.v3beta1.QueryResult;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Integration (system) tests for {@link DetectIntent}. */
@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class DetectIntentIT {

  private static String PROJECT_ID = System.getenv().get("GOOGLE_CLOUD_PROJECT");
  private static String LOCATION = "global";
  private static String AGENT_ID = System.getenv().get("DIALOGFLOW_CX_AGENT_ID");
  private static String SESSION_ID = UUID.randomUUID().toString();
  private static String LANGUAGE_CODE = "en-US";
  private static List<String> TEXTS = Arrays.asList("hello", "book a meeting room");

  @Test
  public void testDetectIntent() throws Exception {
    Map<String, QueryResult> queryResults =
        DetectIntent.detectIntent(PROJECT_ID, LOCATION, AGENT_ID, SESSION_ID, TEXTS, LANGUAGE_CODE);
    assertEquals(queryResults.size(), TEXTS.size());
    for (int i = 0; i < TEXTS.size(); i++) {
      String text = TEXTS.get(i);
      assertEquals(queryResults.get(text).getText(), text);
    }
  }
}
