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

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/** Unit test for {@link DetectIntentIntentInput}. */
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class DetectIntentIntentInputTest {

  private static String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static String LOCATION = "global";
  private static String AGENT_ID =
      System.getenv()
          .getOrDefault("DIALOGFLOW_CX_AGENT_ID_GLOBAL", "b8d0e85d-0741-4e6d-a66a-3671184b7b93");
  private static String INTENT_ID = "00000000-0000-0000-0000-000000000000";
  private static String SESSION_ID = UUID.randomUUID().toString();
  private static String LANGUAGE_CODE = "en-US";
  private static String INTENT = "projects/"
      + PROJECT_ID + "/locations/" + LOCATION + "/agents/" + AGENT_ID + "/intents/" + INTENT_ID;


  private ByteArrayOutputStream stdOut;

  @Before
  public void setUp() throws IOException {

    stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));

  }

  @After
  public void tearDown() throws IOException {
    stdOut = null;
    System.setOut(null);

  }

  @Test
  public void testDetectIntentIntentInput() throws Exception {
    String intentName = "Default Welcome Intent";

    DetectIntentIntentInput.detectIntent(
        PROJECT_ID, LOCATION, AGENT_ID, SESSION_ID, INTENT, LANGUAGE_CODE);
    System.out.println(stdOut.toString());
    assertThat(stdOut.toString()).contains(intentName);
  }

}
