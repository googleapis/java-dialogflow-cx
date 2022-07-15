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
import static org.mockito.Mockito.when;

import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class WebhookValidateFormParameterIT {
  @Mock
  private HttpRequest request;

  @Mock
  private HttpResponse response;

  private BufferedReader jsonReader;
  private StringReader stringReader;
  private BufferedWriter writerOut;
  private StringWriter responseOut;


  @Before
  public void beforeTest() throws IOException {
    MockitoAnnotations.initMocks(this);

    stringReader = new StringReader("{'fulfillmentInfo': {'tag': 'validate-form-parameter'}}");
    jsonReader = new BufferedReader(stringReader);

    responseOut = new StringWriter();
    writerOut = new BufferedWriter(responseOut);

    when(request.getReader()).thenReturn(jsonReader);
    when(response.getWriter()).thenReturn(writerOut);
  }

  public String fromFile(String fileName) throws IOException {
    Path absolutePath = Paths.get("resources", fileName);

    return new String(Files.readAllBytes(absolutePath));
  }

  @Test
  public void helloHttp_bodyParamsPost() throws IOException, Exception {
    new WebhookValidateFormParameter().service(request, response);
    writerOut.flush();

    String expectedResponse = fromFile("validate_form_parameter.json");
    assertThat(responseOut.toString()).isEqualTo(expectedResponse);
  }
}
