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

import com.google.cloud.dialogflow.cx.v3.CreatePageRequest;
import com.google.cloud.dialogflow.cx.v3.DeletePageRequest;
import com.google.cloud.dialogflow.cx.v3.ListPagesRequest;
import com.google.cloud.dialogflow.cx.v3.Page;
import com.google.cloud.dialogflow.cx.v3.PagesClient;
import java.io.IOException;

public class PageManagment {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "my-project-id";
    String agentId = "my-agent-id";
    String flowId = "my-flow-id";
    String pageId = "my-page-id";
    String location = "my-location";
    String displayName = "my-display-name";

    createPage(projectId, agentId, flowId, location, displayName);
    listPages(projectId, agentId, flowId, location);
    deletePage(projectId, agentId, flowId, pageId, location);
  }

  // [START dialogflow_cx_create_page]
  public static Page createPage(String projectId, String agentId, String flowId, String location,
      String displayName) throws IOException {
    com.google.cloud.dialogflow.cx.v3.CreatePageRequest.Builder createRequestBuilder = 
        CreatePageRequest.newBuilder();
    com.google.cloud.dialogflow.cx.v3.Page.Builder pageBuilder = Page.newBuilder();

    pageBuilder.setDisplayName(displayName);

    createRequestBuilder.setParent(
        "projects/" + projectId + "/locations/" + location + "/agents/" + agentId + "/flows/"
            + flowId);
    createRequestBuilder.setPage(pageBuilder);

    PagesClient client = PagesClient.create();
    
    return client.createPage(createRequestBuilder.build());
  }
  // [END dialogflow_cx_create_page]

  // [START dialogflow_cx_list_pages]
  public static String listPages(String projectId, String agentId, String flowId, String location)
      throws IOException {
    PagesClient client = PagesClient.create();
    com.google.cloud.dialogflow.cx.v3.ListPagesRequest.Builder listRequestBuilder = ListPagesRequest
        .newBuilder();

    listRequestBuilder.setParent(
        "projects/" + projectId + "/locations/" + location + "/agents/" + agentId + "/flows/"
            + flowId);
    listRequestBuilder.setLanguageCode("en");

    String result = "";

    for (Page element : client.listPages(listRequestBuilder.build()).iterateAll()) {
      result += element.toString() + "\n";
    }

    return result
  }
  // [END dialogflow_cx_list_pages]

  // [START dialogflow_cx_delete_page]
  public static void deletePage(String projectId, String agentId, String flowId, String pageId,
      String location) throws IOException {
    PagesClient client = PagesClient.create();
    com.google.cloud.dialogflow.cx.v3.DeletePageRequest.Builder deleteRequestBuilder = 
        DeletePageRequest.newBuilder();

    deleteRequestBuilder.setName(
        "projects/" + projectId + "/locations/" + location + "/agents/" + agentId + "/flows/"
            + flowId + "/pages/" + pageId);

    client.deletePage(deleteRequestBuilder.build());
  }
  // [END dialogflow_cx_delete_page]
}
