/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dialogflow.cx.v3beta1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3beta1.stub.DeploymentsStub;
import com.google.cloud.dialogflow.cx.v3beta1.stub.DeploymentsStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for managing
 * [Deployments][google.cloud.dialogflow.cx.v3beta1.Deployment].
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (DeploymentsClient deploymentsClient = DeploymentsClient.create()) {
 *   DeploymentName name =
 *       DeploymentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[DEPLOYMENT]");
 *   Deployment response = deploymentsClient.getDeployment(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the DeploymentsClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of DeploymentsSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * DeploymentsSettings deploymentsSettings =
 *     DeploymentsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DeploymentsClient deploymentsClient = DeploymentsClient.create(deploymentsSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * DeploymentsSettings deploymentsSettings =
 *     DeploymentsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * DeploymentsClient deploymentsClient = DeploymentsClient.create(deploymentsSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class DeploymentsClient implements BackgroundResource {
  private final DeploymentsSettings settings;
  private final DeploymentsStub stub;

  /** Constructs an instance of DeploymentsClient with default settings. */
  public static final DeploymentsClient create() throws IOException {
    return create(DeploymentsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DeploymentsClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final DeploymentsClient create(DeploymentsSettings settings) throws IOException {
    return new DeploymentsClient(settings);
  }

  /**
   * Constructs an instance of DeploymentsClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(DeploymentsSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final DeploymentsClient create(DeploymentsStub stub) {
    return new DeploymentsClient(stub);
  }

  /**
   * Constructs an instance of DeploymentsClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected DeploymentsClient(DeploymentsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((DeploymentsStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected DeploymentsClient(DeploymentsStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DeploymentsSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public DeploymentsStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all deployments in the specified
   * [Environment][google.cloud.dialogflow.cx.v3beta1.Environment].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DeploymentsClient deploymentsClient = DeploymentsClient.create()) {
   *   EnvironmentName parent =
   *       EnvironmentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]");
   *   for (Deployment element : deploymentsClient.listDeployments(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The [Environment][google.cloud.dialogflow.cx.v3beta1.Environment] to
   *     list all environments for. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   *     ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDeploymentsPagedResponse listDeployments(EnvironmentName parent) {
    ListDeploymentsRequest request =
        ListDeploymentsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listDeployments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all deployments in the specified
   * [Environment][google.cloud.dialogflow.cx.v3beta1.Environment].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DeploymentsClient deploymentsClient = DeploymentsClient.create()) {
   *   String parent =
   *       EnvironmentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]").toString();
   *   for (Deployment element : deploymentsClient.listDeployments(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The [Environment][google.cloud.dialogflow.cx.v3beta1.Environment] to
   *     list all environments for. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   *     ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDeploymentsPagedResponse listDeployments(String parent) {
    ListDeploymentsRequest request = ListDeploymentsRequest.newBuilder().setParent(parent).build();
    return listDeployments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all deployments in the specified
   * [Environment][google.cloud.dialogflow.cx.v3beta1.Environment].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DeploymentsClient deploymentsClient = DeploymentsClient.create()) {
   *   ListDeploymentsRequest request =
   *       ListDeploymentsRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Deployment element : deploymentsClient.listDeployments(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDeploymentsPagedResponse listDeployments(ListDeploymentsRequest request) {
    return listDeploymentsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all deployments in the specified
   * [Environment][google.cloud.dialogflow.cx.v3beta1.Environment].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DeploymentsClient deploymentsClient = DeploymentsClient.create()) {
   *   ListDeploymentsRequest request =
   *       ListDeploymentsRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Deployment> future =
   *       deploymentsClient.listDeploymentsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Deployment element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListDeploymentsRequest, ListDeploymentsPagedResponse>
      listDeploymentsPagedCallable() {
    return stub.listDeploymentsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all deployments in the specified
   * [Environment][google.cloud.dialogflow.cx.v3beta1.Environment].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DeploymentsClient deploymentsClient = DeploymentsClient.create()) {
   *   ListDeploymentsRequest request =
   *       ListDeploymentsRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListDeploymentsResponse response =
   *         deploymentsClient.listDeploymentsCallable().call(request);
   *     for (Deployment element : response.getResponsesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListDeploymentsRequest, ListDeploymentsResponse>
      listDeploymentsCallable() {
    return stub.listDeploymentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified [Deployment][google.cloud.dialogflow.cx.v3beta1.Deployment].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DeploymentsClient deploymentsClient = DeploymentsClient.create()) {
   *   DeploymentName name =
   *       DeploymentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[DEPLOYMENT]");
   *   Deployment response = deploymentsClient.getDeployment(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the
   *     [Deployment][google.cloud.dialogflow.cx.v3beta1.Deployment]. Format: `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment
   *     ID&gt;/deployments/&lt;Deployment ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Deployment getDeployment(DeploymentName name) {
    GetDeploymentRequest request =
        GetDeploymentRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getDeployment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified [Deployment][google.cloud.dialogflow.cx.v3beta1.Deployment].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DeploymentsClient deploymentsClient = DeploymentsClient.create()) {
   *   String name =
   *       DeploymentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[DEPLOYMENT]")
   *           .toString();
   *   Deployment response = deploymentsClient.getDeployment(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the
   *     [Deployment][google.cloud.dialogflow.cx.v3beta1.Deployment]. Format: `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment
   *     ID&gt;/deployments/&lt;Deployment ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Deployment getDeployment(String name) {
    GetDeploymentRequest request = GetDeploymentRequest.newBuilder().setName(name).build();
    return getDeployment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified [Deployment][google.cloud.dialogflow.cx.v3beta1.Deployment].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DeploymentsClient deploymentsClient = DeploymentsClient.create()) {
   *   GetDeploymentRequest request =
   *       GetDeploymentRequest.newBuilder()
   *           .setName(
   *               DeploymentName.of(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[DEPLOYMENT]")
   *                   .toString())
   *           .build();
   *   Deployment response = deploymentsClient.getDeployment(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Deployment getDeployment(GetDeploymentRequest request) {
    return getDeploymentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified [Deployment][google.cloud.dialogflow.cx.v3beta1.Deployment].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DeploymentsClient deploymentsClient = DeploymentsClient.create()) {
   *   GetDeploymentRequest request =
   *       GetDeploymentRequest.newBuilder()
   *           .setName(
   *               DeploymentName.of(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[DEPLOYMENT]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Deployment> future = deploymentsClient.getDeploymentCallable().futureCall(request);
   *   // Do something.
   *   Deployment response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetDeploymentRequest, Deployment> getDeploymentCallable() {
    return stub.getDeploymentCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListDeploymentsPagedResponse
      extends AbstractPagedListResponse<
          ListDeploymentsRequest,
          ListDeploymentsResponse,
          Deployment,
          ListDeploymentsPage,
          ListDeploymentsFixedSizeCollection> {

    public static ApiFuture<ListDeploymentsPagedResponse> createAsync(
        PageContext<ListDeploymentsRequest, ListDeploymentsResponse, Deployment> context,
        ApiFuture<ListDeploymentsResponse> futureResponse) {
      ApiFuture<ListDeploymentsPage> futurePage =
          ListDeploymentsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListDeploymentsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListDeploymentsPagedResponse(ListDeploymentsPage page) {
      super(page, ListDeploymentsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListDeploymentsPage
      extends AbstractPage<
          ListDeploymentsRequest, ListDeploymentsResponse, Deployment, ListDeploymentsPage> {

    private ListDeploymentsPage(
        PageContext<ListDeploymentsRequest, ListDeploymentsResponse, Deployment> context,
        ListDeploymentsResponse response) {
      super(context, response);
    }

    private static ListDeploymentsPage createEmptyPage() {
      return new ListDeploymentsPage(null, null);
    }

    @Override
    protected ListDeploymentsPage createPage(
        PageContext<ListDeploymentsRequest, ListDeploymentsResponse, Deployment> context,
        ListDeploymentsResponse response) {
      return new ListDeploymentsPage(context, response);
    }

    @Override
    public ApiFuture<ListDeploymentsPage> createPageAsync(
        PageContext<ListDeploymentsRequest, ListDeploymentsResponse, Deployment> context,
        ApiFuture<ListDeploymentsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListDeploymentsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListDeploymentsRequest,
          ListDeploymentsResponse,
          Deployment,
          ListDeploymentsPage,
          ListDeploymentsFixedSizeCollection> {

    private ListDeploymentsFixedSizeCollection(
        List<ListDeploymentsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListDeploymentsFixedSizeCollection createEmptyCollection() {
      return new ListDeploymentsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListDeploymentsFixedSizeCollection createCollection(
        List<ListDeploymentsPage> pages, int collectionSize) {
      return new ListDeploymentsFixedSizeCollection(pages, collectionSize);
    }
  }
}
