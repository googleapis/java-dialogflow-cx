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

package com.google.cloud.dialogflow.cx.v3beta1.stub;

import static com.google.cloud.dialogflow.cx.v3beta1.WebhooksClient.ListWebhooksPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest;
import com.google.cloud.dialogflow.cx.v3beta1.DeleteWebhookRequest;
import com.google.cloud.dialogflow.cx.v3beta1.GetWebhookRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListWebhooksResponse;
import com.google.cloud.dialogflow.cx.v3beta1.UpdateWebhookRequest;
import com.google.cloud.dialogflow.cx.v3beta1.Webhook;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the Webhooks service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcWebhooksStub extends WebhooksStub {
  private static final MethodDescriptor<ListWebhooksRequest, ListWebhooksResponse>
      listWebhooksMethodDescriptor =
          MethodDescriptor.<ListWebhooksRequest, ListWebhooksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Webhooks/ListWebhooks")
              .setRequestMarshaller(ProtoUtils.marshaller(ListWebhooksRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListWebhooksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetWebhookRequest, Webhook> getWebhookMethodDescriptor =
      MethodDescriptor.<GetWebhookRequest, Webhook>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Webhooks/GetWebhook")
          .setRequestMarshaller(ProtoUtils.marshaller(GetWebhookRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Webhook.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateWebhookRequest, Webhook>
      createWebhookMethodDescriptor =
          MethodDescriptor.<CreateWebhookRequest, Webhook>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Webhooks/CreateWebhook")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateWebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Webhook.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateWebhookRequest, Webhook>
      updateWebhookMethodDescriptor =
          MethodDescriptor.<UpdateWebhookRequest, Webhook>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Webhooks/UpdateWebhook")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateWebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Webhook.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteWebhookRequest, Empty> deleteWebhookMethodDescriptor =
      MethodDescriptor.<DeleteWebhookRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Webhooks/DeleteWebhook")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteWebhookRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();

  private final UnaryCallable<ListWebhooksRequest, ListWebhooksResponse> listWebhooksCallable;
  private final UnaryCallable<ListWebhooksRequest, ListWebhooksPagedResponse>
      listWebhooksPagedCallable;
  private final UnaryCallable<GetWebhookRequest, Webhook> getWebhookCallable;
  private final UnaryCallable<CreateWebhookRequest, Webhook> createWebhookCallable;
  private final UnaryCallable<UpdateWebhookRequest, Webhook> updateWebhookCallable;
  private final UnaryCallable<DeleteWebhookRequest, Empty> deleteWebhookCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcWebhooksStub create(WebhooksStubSettings settings) throws IOException {
    return new GrpcWebhooksStub(settings, ClientContext.create(settings));
  }

  public static final GrpcWebhooksStub create(ClientContext clientContext) throws IOException {
    return new GrpcWebhooksStub(WebhooksStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcWebhooksStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcWebhooksStub(
        WebhooksStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcWebhooksStub(WebhooksStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcWebhooksCallableFactory());
  }

  protected GrpcWebhooksStub(
      WebhooksStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListWebhooksRequest, ListWebhooksResponse> listWebhooksTransportSettings =
        GrpcCallSettings.<ListWebhooksRequest, ListWebhooksResponse>newBuilder()
            .setMethodDescriptor(listWebhooksMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ListWebhooksRequest>() {
                  @Override
                  public Map<String, String> extract(ListWebhooksRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetWebhookRequest, Webhook> getWebhookTransportSettings =
        GrpcCallSettings.<GetWebhookRequest, Webhook>newBuilder()
            .setMethodDescriptor(getWebhookMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetWebhookRequest>() {
                  @Override
                  public Map<String, String> extract(GetWebhookRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateWebhookRequest, Webhook> createWebhookTransportSettings =
        GrpcCallSettings.<CreateWebhookRequest, Webhook>newBuilder()
            .setMethodDescriptor(createWebhookMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateWebhookRequest>() {
                  @Override
                  public Map<String, String> extract(CreateWebhookRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<UpdateWebhookRequest, Webhook> updateWebhookTransportSettings =
        GrpcCallSettings.<UpdateWebhookRequest, Webhook>newBuilder()
            .setMethodDescriptor(updateWebhookMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateWebhookRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateWebhookRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("webhook.name", String.valueOf(request.getWebhook().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteWebhookRequest, Empty> deleteWebhookTransportSettings =
        GrpcCallSettings.<DeleteWebhookRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteWebhookMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteWebhookRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteWebhookRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();

    this.listWebhooksCallable =
        callableFactory.createUnaryCallable(
            listWebhooksTransportSettings, settings.listWebhooksSettings(), clientContext);
    this.listWebhooksPagedCallable =
        callableFactory.createPagedCallable(
            listWebhooksTransportSettings, settings.listWebhooksSettings(), clientContext);
    this.getWebhookCallable =
        callableFactory.createUnaryCallable(
            getWebhookTransportSettings, settings.getWebhookSettings(), clientContext);
    this.createWebhookCallable =
        callableFactory.createUnaryCallable(
            createWebhookTransportSettings, settings.createWebhookSettings(), clientContext);
    this.updateWebhookCallable =
        callableFactory.createUnaryCallable(
            updateWebhookTransportSettings, settings.updateWebhookSettings(), clientContext);
    this.deleteWebhookCallable =
        callableFactory.createUnaryCallable(
            deleteWebhookTransportSettings, settings.deleteWebhookSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<ListWebhooksRequest, ListWebhooksResponse> listWebhooksCallable() {
    return listWebhooksCallable;
  }

  public UnaryCallable<ListWebhooksRequest, ListWebhooksPagedResponse> listWebhooksPagedCallable() {
    return listWebhooksPagedCallable;
  }

  public UnaryCallable<GetWebhookRequest, Webhook> getWebhookCallable() {
    return getWebhookCallable;
  }

  public UnaryCallable<CreateWebhookRequest, Webhook> createWebhookCallable() {
    return createWebhookCallable;
  }

  public UnaryCallable<UpdateWebhookRequest, Webhook> updateWebhookCallable() {
    return updateWebhookCallable;
  }

  public UnaryCallable<DeleteWebhookRequest, Empty> deleteWebhookCallable() {
    return deleteWebhookCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
