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

import com.google.cloud.dialogflow.cx.v3beta1.WebhookRequest;
import com.google.cloud.dialogflow.cx.v3beta1.WebhookRequest.FulfillmentInfo;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ConfigureWebhookToSetFormParametersAsOptionalOrRequiredTest {

  @Mock private HttpRequest request;
  @Mock private HttpResponse response;

  private BufferedWriter writerOut;
  private StringWriter responseOut;
  private static final Gson gson = new Gson();

  @Before
  public void beforeTest() throws IOException {
    MockitoAnnotations.initMocks(this);

    // use an empty string as the default request content
    BufferedReader reader = new BufferedReader(new StringReader(""));
    when(request.getReader()).thenReturn(reader);

    responseOut = new StringWriter();
    writerOut = new BufferedWriter(responseOut);
    when(response.getWriter()).thenReturn(writerOut);
  }

  @Test
  public void helloHttp_bodyParamsPost() throws IOException, Exception {
    FulfillmentInfo fulfillmentInfo =
        FulfillmentInfo.newBuilder().setTag("configure-session-parameters").build();

    WebhookRequest webhookRequest =
        WebhookRequest.newBuilder().setFulfillmentInfo(fulfillmentInfo).build();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    String jsonString = gson.toJson(webhookRequest);
    BufferedReader jsonReader = new BufferedReader(new StringReader(jsonString));

    when(request.getReader()).thenReturn(jsonReader);

    new ConfigureWebhookToSetFormParametersAsOptionalOrRequired().service(request, response);
    writerOut.flush();

    JsonObject parameterObject = new JsonObject();
    parameterObject.addProperty("display_name", "order_number");
    parameterObject.addProperty("required", "true");
    parameterObject.addProperty("state", "VALID");

    JsonArray parameterInfoList = new JsonArray();
    parameterInfoList.add(parameterObject);

    JsonObject parameterInfoObject = new JsonObject();
    parameterInfoObject.add("parameter_info", parameterInfoList);

    JsonObject formInfo = new JsonObject();
    formInfo.add("form_info", parameterInfoObject);

    JsonObject webhookResponse = new JsonObject();
    webhookResponse.add("page_info", formInfo);

    String jsonResponseObject = gson.toJson(webhookResponse);

    assertThat(responseOut.toString()).isEqualTo(jsonResponseObject.toString());
  }
}
