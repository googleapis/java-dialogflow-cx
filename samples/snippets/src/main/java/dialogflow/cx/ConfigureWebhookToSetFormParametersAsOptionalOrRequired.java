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

// The following snippet is used in https://cloud.google.com/dialogflow/cx/docs/concept/webhook

// [START dialogflow_cx_v3_configure_webhooks_to_set_form_parameter_as_optional_or_required]

// TODO: Change class name to Example
// TODO: add GSON dependency to Pom file
// (https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.5)
// TODO: Uncomment the line bellow before running cloud function
// package com.example;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedWriter;

public class ConfigureWebhookToSetFormParametersAsOptionalOrRequired implements HttpFunction {
  @Override
  public void service(HttpRequest request, HttpResponse response) throws Exception {
    JsonParser parser = new JsonParser();
    Gson gson = new GsonBuilder().create();
    JsonObject parsedRequest = gson.fromJson(request.getReader(), JsonObject.class);

    // For more information on the structure of this object, visit https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/Fulfillment
    JsonObject responseObject = null;

    // Constructing the response jsonObject
    responseObject =
        parser
            .parse(
              "{\"page_info\":{\"form_info\":{\"parameter_info\":
              [{\"display_name\":\"order-number\",\"required\":\"true\",\"state\":\"VALID\"}]}}}")
            .getAsJsonObject();
    BufferedWriter writer = response.getWriter();

    System.out.println("Parameter Info: \n");
    System.out.println(responseObject.toString());
    // System.out.println(responseObject.pageInfo.formInfo.parameterInfo[0]);

    //Sends the responseObject
    writer.write(responseObject.toString());
  }
}
// [END dialogflow_cx_v3_configure_webhooks_to_set_form_parameter_as_optional_or_required]
