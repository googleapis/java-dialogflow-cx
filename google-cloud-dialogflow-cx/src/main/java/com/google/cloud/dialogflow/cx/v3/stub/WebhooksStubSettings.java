/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.dialogflow.cx.v3.stub;

import static com.google.cloud.dialogflow.cx.v3.WebhooksClient.ListWebhooksPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3.CreateWebhookRequest;
import com.google.cloud.dialogflow.cx.v3.DeleteWebhookRequest;
import com.google.cloud.dialogflow.cx.v3.GetWebhookRequest;
import com.google.cloud.dialogflow.cx.v3.ListWebhooksRequest;
import com.google.cloud.dialogflow.cx.v3.ListWebhooksResponse;
import com.google.cloud.dialogflow.cx.v3.UpdateWebhookRequest;
import com.google.cloud.dialogflow.cx.v3.Webhook;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link WebhooksStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dialogflow.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getWebhook to 30 seconds:
 *
 * <pre>{@code
 * WebhooksStubSettings.Builder webhooksSettingsBuilder = WebhooksStubSettings.newBuilder();
 * webhooksSettingsBuilder
 *     .getWebhookSettings()
 *     .setRetrySettings(
 *         webhooksSettingsBuilder
 *             .getWebhookSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * WebhooksStubSettings webhooksSettings = webhooksSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class WebhooksStubSettings extends StubSettings<WebhooksStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/dialogflow")
          .build();

  private final PagedCallSettings<
          ListWebhooksRequest, ListWebhooksResponse, ListWebhooksPagedResponse>
      listWebhooksSettings;
  private final UnaryCallSettings<GetWebhookRequest, Webhook> getWebhookSettings;
  private final UnaryCallSettings<CreateWebhookRequest, Webhook> createWebhookSettings;
  private final UnaryCallSettings<UpdateWebhookRequest, Webhook> updateWebhookSettings;
  private final UnaryCallSettings<DeleteWebhookRequest, Empty> deleteWebhookSettings;

  private static final PagedListDescriptor<ListWebhooksRequest, ListWebhooksResponse, Webhook>
      LIST_WEBHOOKS_PAGE_STR_DESC =
          new PagedListDescriptor<ListWebhooksRequest, ListWebhooksResponse, Webhook>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListWebhooksRequest injectToken(ListWebhooksRequest payload, String token) {
              return ListWebhooksRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListWebhooksRequest injectPageSize(ListWebhooksRequest payload, int pageSize) {
              return ListWebhooksRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListWebhooksRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListWebhooksResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Webhook> extractResources(ListWebhooksResponse payload) {
              return payload.getWebhooksList() == null
                  ? ImmutableList.<Webhook>of()
                  : payload.getWebhooksList();
            }
          };

  private static final PagedListResponseFactory<
          ListWebhooksRequest, ListWebhooksResponse, ListWebhooksPagedResponse>
      LIST_WEBHOOKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListWebhooksRequest, ListWebhooksResponse, ListWebhooksPagedResponse>() {
            @Override
            public ApiFuture<ListWebhooksPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListWebhooksRequest, ListWebhooksResponse> callable,
                ListWebhooksRequest request,
                ApiCallContext context,
                ApiFuture<ListWebhooksResponse> futureResponse) {
              PageContext<ListWebhooksRequest, ListWebhooksResponse, Webhook> pageContext =
                  PageContext.create(callable, LIST_WEBHOOKS_PAGE_STR_DESC, request, context);
              return ListWebhooksPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listWebhooks. */
  public PagedCallSettings<ListWebhooksRequest, ListWebhooksResponse, ListWebhooksPagedResponse>
      listWebhooksSettings() {
    return listWebhooksSettings;
  }

  /** Returns the object with the settings used for calls to getWebhook. */
  public UnaryCallSettings<GetWebhookRequest, Webhook> getWebhookSettings() {
    return getWebhookSettings;
  }

  /** Returns the object with the settings used for calls to createWebhook. */
  public UnaryCallSettings<CreateWebhookRequest, Webhook> createWebhookSettings() {
    return createWebhookSettings;
  }

  /** Returns the object with the settings used for calls to updateWebhook. */
  public UnaryCallSettings<UpdateWebhookRequest, Webhook> updateWebhookSettings() {
    return updateWebhookSettings;
  }

  /** Returns the object with the settings used for calls to deleteWebhook. */
  public UnaryCallSettings<DeleteWebhookRequest, Empty> deleteWebhookSettings() {
    return deleteWebhookSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public WebhooksStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcWebhooksStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "dialogflow.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(WebhooksStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected WebhooksStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listWebhooksSettings = settingsBuilder.listWebhooksSettings().build();
    getWebhookSettings = settingsBuilder.getWebhookSettings().build();
    createWebhookSettings = settingsBuilder.createWebhookSettings().build();
    updateWebhookSettings = settingsBuilder.updateWebhookSettings().build();
    deleteWebhookSettings = settingsBuilder.deleteWebhookSettings().build();
  }

  /** Builder for WebhooksStubSettings. */
  public static class Builder extends StubSettings.Builder<WebhooksStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListWebhooksRequest, ListWebhooksResponse, ListWebhooksPagedResponse>
        listWebhooksSettings;
    private final UnaryCallSettings.Builder<GetWebhookRequest, Webhook> getWebhookSettings;
    private final UnaryCallSettings.Builder<CreateWebhookRequest, Webhook> createWebhookSettings;
    private final UnaryCallSettings.Builder<UpdateWebhookRequest, Webhook> updateWebhookSettings;
    private final UnaryCallSettings.Builder<DeleteWebhookRequest, Empty> deleteWebhookSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listWebhooksSettings = PagedCallSettings.newBuilder(LIST_WEBHOOKS_PAGE_STR_FACT);
      getWebhookSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createWebhookSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateWebhookSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteWebhookSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listWebhooksSettings,
              getWebhookSettings,
              createWebhookSettings,
              updateWebhookSettings,
              deleteWebhookSettings);
      initDefaults(this);
    }

    protected Builder(WebhooksStubSettings settings) {
      super(settings);

      listWebhooksSettings = settings.listWebhooksSettings.toBuilder();
      getWebhookSettings = settings.getWebhookSettings.toBuilder();
      createWebhookSettings = settings.createWebhookSettings.toBuilder();
      updateWebhookSettings = settings.updateWebhookSettings.toBuilder();
      deleteWebhookSettings = settings.deleteWebhookSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listWebhooksSettings,
              getWebhookSettings,
              createWebhookSettings,
              updateWebhookSettings,
              deleteWebhookSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listWebhooksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getWebhookSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createWebhookSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateWebhookSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteWebhookSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listWebhooks. */
    public PagedCallSettings.Builder<
            ListWebhooksRequest, ListWebhooksResponse, ListWebhooksPagedResponse>
        listWebhooksSettings() {
      return listWebhooksSettings;
    }

    /** Returns the builder for the settings used for calls to getWebhook. */
    public UnaryCallSettings.Builder<GetWebhookRequest, Webhook> getWebhookSettings() {
      return getWebhookSettings;
    }

    /** Returns the builder for the settings used for calls to createWebhook. */
    public UnaryCallSettings.Builder<CreateWebhookRequest, Webhook> createWebhookSettings() {
      return createWebhookSettings;
    }

    /** Returns the builder for the settings used for calls to updateWebhook. */
    public UnaryCallSettings.Builder<UpdateWebhookRequest, Webhook> updateWebhookSettings() {
      return updateWebhookSettings;
    }

    /** Returns the builder for the settings used for calls to deleteWebhook. */
    public UnaryCallSettings.Builder<DeleteWebhookRequest, Empty> deleteWebhookSettings() {
      return deleteWebhookSettings;
    }

    @Override
    public WebhooksStubSettings build() throws IOException {
      return new WebhooksStubSettings(this);
    }
  }
}
