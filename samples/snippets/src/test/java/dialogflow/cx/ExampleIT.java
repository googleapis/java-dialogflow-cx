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
import static org.mockito.Mockito.when;

import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.io.StringWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ExampleIT {

  @Mock private HttpRequest request;
  @Mock private HttpResponse response;

  private BufferedWriter writerOut;
  private StringWriter responseOut;
  private static final Gson gson = new Gson();
  private static ByteArrayOutputStream stdOut;

  @Before
  public void beforeTest() throws IOException {
    MockitoAnnotations.initMocks(this);

    stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));

  }
  
  @After
  public void tearDown() throws IOException {
    stdOut = null;
    System.setOut(null);
  }

  @Test
  public void helloHttp_bodyParamsPost() throws IOException, Exception {

    String firstHalf = "{\fulfillmentInfo\": {\"tag\": \"Default Welcome Intent\",}";
    String secondHalf = ",\"text\": \"hi\",\"languageCode\": \"en\",}";

    BufferedReader jsonReader = new BufferedReader(new StringReader(firstHalf + secondHalf));

    when(request.getReader()).thenReturn(jsonReader);

    new Example().service(request, response);

    assertThat(stdOut.toString()).contains("Hello from a Java GCF Webhook");
  }
}
