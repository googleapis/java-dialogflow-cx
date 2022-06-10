/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.dialogflow.cx.v3;

import static com.google.cloud.dialogflow.cx.v3.ChangelogsClient.ListChangelogsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.dialogflow.cx.v3.stub.ChangelogsStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ChangelogsClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (dialogflow.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getChangelog to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * ChangelogsSettings.Builder changelogsSettingsBuilder = ChangelogsSettings.newBuilder();
 * changelogsSettingsBuilder
 *     .getChangelogSettings()
 *     .setRetrySettings(
 *         changelogsSettingsBuilder
 *             .getChangelogSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ChangelogsSettings changelogsSettings = changelogsSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ChangelogsSettings extends ClientSettings<ChangelogsSettings> {

  /** Returns the object with the settings used for calls to listChangelogs. */
  public PagedCallSettings<
          ListChangelogsRequest, ListChangelogsResponse, ListChangelogsPagedResponse>
      listChangelogsSettings() {
    return ((ChangelogsStubSettings) getStubSettings()).listChangelogsSettings();
  }

  /** Returns the object with the settings used for calls to getChangelog. */
  public UnaryCallSettings<GetChangelogRequest, Changelog> getChangelogSettings() {
    return ((ChangelogsStubSettings) getStubSettings()).getChangelogSettings();
  }

  public static final ChangelogsSettings create(ChangelogsStubSettings stub) throws IOException {
    return new ChangelogsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ChangelogsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ChangelogsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ChangelogsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ChangelogsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ChangelogsStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ChangelogsStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ChangelogsStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ChangelogsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ChangelogsSettings. */
  public static class Builder extends ClientSettings.Builder<ChangelogsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(ChangelogsStubSettings.newBuilder(clientContext));
    }

    protected Builder(ChangelogsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ChangelogsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(ChangelogsStubSettings.newBuilder());
    }

    public ChangelogsStubSettings.Builder getStubSettingsBuilder() {
      return ((ChangelogsStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listChangelogs. */
    public PagedCallSettings.Builder<
            ListChangelogsRequest, ListChangelogsResponse, ListChangelogsPagedResponse>
        listChangelogsSettings() {
      return getStubSettingsBuilder().listChangelogsSettings();
    }

    /** Returns the builder for the settings used for calls to getChangelog. */
    public UnaryCallSettings.Builder<GetChangelogRequest, Changelog> getChangelogSettings() {
      return getStubSettingsBuilder().getChangelogSettings();
    }

    @Override
    public ChangelogsSettings build() throws IOException {
      return new ChangelogsSettings(this);
    }
  }
}
