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

import static com.google.cloud.dialogflow.cx.v3beta1.ExperimentsClient.ListExperimentsPagedResponse;

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
import com.google.cloud.dialogflow.cx.v3beta1.stub.ExperimentsStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ExperimentsClient}.
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
 * <p>For example, to set the total timeout of getExperiment to 30 seconds:
 *
 * <pre>{@code
 * ExperimentsSettings.Builder experimentsSettingsBuilder = ExperimentsSettings.newBuilder();
 * experimentsSettingsBuilder
 *     .getExperimentSettings()
 *     .setRetrySettings(
 *         experimentsSettingsBuilder
 *             .getExperimentSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ExperimentsSettings experimentsSettings = experimentsSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class ExperimentsSettings extends ClientSettings<ExperimentsSettings> {

  /** Returns the object with the settings used for calls to listExperiments. */
  public PagedCallSettings<
          ListExperimentsRequest, ListExperimentsResponse, ListExperimentsPagedResponse>
      listExperimentsSettings() {
    return ((ExperimentsStubSettings) getStubSettings()).listExperimentsSettings();
  }

  /** Returns the object with the settings used for calls to getExperiment. */
  public UnaryCallSettings<GetExperimentRequest, Experiment> getExperimentSettings() {
    return ((ExperimentsStubSettings) getStubSettings()).getExperimentSettings();
  }

  /** Returns the object with the settings used for calls to createExperiment. */
  public UnaryCallSettings<CreateExperimentRequest, Experiment> createExperimentSettings() {
    return ((ExperimentsStubSettings) getStubSettings()).createExperimentSettings();
  }

  /** Returns the object with the settings used for calls to updateExperiment. */
  public UnaryCallSettings<UpdateExperimentRequest, Experiment> updateExperimentSettings() {
    return ((ExperimentsStubSettings) getStubSettings()).updateExperimentSettings();
  }

  /** Returns the object with the settings used for calls to deleteExperiment. */
  public UnaryCallSettings<DeleteExperimentRequest, Empty> deleteExperimentSettings() {
    return ((ExperimentsStubSettings) getStubSettings()).deleteExperimentSettings();
  }

  /** Returns the object with the settings used for calls to startExperiment. */
  public UnaryCallSettings<StartExperimentRequest, Experiment> startExperimentSettings() {
    return ((ExperimentsStubSettings) getStubSettings()).startExperimentSettings();
  }

  /** Returns the object with the settings used for calls to stopExperiment. */
  public UnaryCallSettings<StopExperimentRequest, Experiment> stopExperimentSettings() {
    return ((ExperimentsStubSettings) getStubSettings()).stopExperimentSettings();
  }

  public static final ExperimentsSettings create(ExperimentsStubSettings stub) throws IOException {
    return new ExperimentsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ExperimentsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ExperimentsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ExperimentsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ExperimentsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ExperimentsStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ExperimentsStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ExperimentsStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ExperimentsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ExperimentsSettings. */
  public static class Builder extends ClientSettings.Builder<ExperimentsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(ExperimentsStubSettings.newBuilder(clientContext));
    }

    protected Builder(ExperimentsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ExperimentsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(ExperimentsStubSettings.newBuilder());
    }

    public ExperimentsStubSettings.Builder getStubSettingsBuilder() {
      return ((ExperimentsStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listExperiments. */
    public PagedCallSettings.Builder<
            ListExperimentsRequest, ListExperimentsResponse, ListExperimentsPagedResponse>
        listExperimentsSettings() {
      return getStubSettingsBuilder().listExperimentsSettings();
    }

    /** Returns the builder for the settings used for calls to getExperiment. */
    public UnaryCallSettings.Builder<GetExperimentRequest, Experiment> getExperimentSettings() {
      return getStubSettingsBuilder().getExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to createExperiment. */
    public UnaryCallSettings.Builder<CreateExperimentRequest, Experiment>
        createExperimentSettings() {
      return getStubSettingsBuilder().createExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to updateExperiment. */
    public UnaryCallSettings.Builder<UpdateExperimentRequest, Experiment>
        updateExperimentSettings() {
      return getStubSettingsBuilder().updateExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to deleteExperiment. */
    public UnaryCallSettings.Builder<DeleteExperimentRequest, Empty> deleteExperimentSettings() {
      return getStubSettingsBuilder().deleteExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to startExperiment. */
    public UnaryCallSettings.Builder<StartExperimentRequest, Experiment> startExperimentSettings() {
      return getStubSettingsBuilder().startExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to stopExperiment. */
    public UnaryCallSettings.Builder<StopExperimentRequest, Experiment> stopExperimentSettings() {
      return getStubSettingsBuilder().stopExperimentSettings();
    }

    @Override
    public ExperimentsSettings build() throws IOException {
      return new ExperimentsSettings(this);
    }
  }
}
