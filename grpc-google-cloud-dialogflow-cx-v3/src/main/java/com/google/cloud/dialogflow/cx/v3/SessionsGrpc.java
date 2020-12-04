/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dialogflow.cx.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/dialogflow/cx/v3/session.proto")
public final class SessionsGrpc {

  private SessionsGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.cx.v3.Sessions";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.DetectIntentRequest,
          com.google.cloud.dialogflow.cx.v3.DetectIntentResponse>
      getDetectIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectIntent",
      requestType = com.google.cloud.dialogflow.cx.v3.DetectIntentRequest.class,
      responseType = com.google.cloud.dialogflow.cx.v3.DetectIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.DetectIntentRequest,
          com.google.cloud.dialogflow.cx.v3.DetectIntentResponse>
      getDetectIntentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.cx.v3.DetectIntentRequest,
            com.google.cloud.dialogflow.cx.v3.DetectIntentResponse>
        getDetectIntentMethod;
    if ((getDetectIntentMethod = SessionsGrpc.getDetectIntentMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getDetectIntentMethod = SessionsGrpc.getDetectIntentMethod) == null) {
          SessionsGrpc.getDetectIntentMethod =
              getDetectIntentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.cx.v3.DetectIntentRequest,
                          com.google.cloud.dialogflow.cx.v3.DetectIntentResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetectIntent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.DetectIntentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.DetectIntentResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("DetectIntent"))
                      .build();
        }
      }
    }
    return getDetectIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest,
          com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse>
      getStreamingDetectIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamingDetectIntent",
      requestType = com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest.class,
      responseType = com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest,
          com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse>
      getStreamingDetectIntentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest,
            com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse>
        getStreamingDetectIntentMethod;
    if ((getStreamingDetectIntentMethod = SessionsGrpc.getStreamingDetectIntentMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getStreamingDetectIntentMethod = SessionsGrpc.getStreamingDetectIntentMethod)
            == null) {
          SessionsGrpc.getStreamingDetectIntentMethod =
              getStreamingDetectIntentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest,
                          com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "StreamingDetectIntent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new SessionsMethodDescriptorSupplier("StreamingDetectIntent"))
                      .build();
        }
      }
    }
    return getStreamingDetectIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.MatchIntentRequest,
          com.google.cloud.dialogflow.cx.v3.MatchIntentResponse>
      getMatchIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MatchIntent",
      requestType = com.google.cloud.dialogflow.cx.v3.MatchIntentRequest.class,
      responseType = com.google.cloud.dialogflow.cx.v3.MatchIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.MatchIntentRequest,
          com.google.cloud.dialogflow.cx.v3.MatchIntentResponse>
      getMatchIntentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.cx.v3.MatchIntentRequest,
            com.google.cloud.dialogflow.cx.v3.MatchIntentResponse>
        getMatchIntentMethod;
    if ((getMatchIntentMethod = SessionsGrpc.getMatchIntentMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getMatchIntentMethod = SessionsGrpc.getMatchIntentMethod) == null) {
          SessionsGrpc.getMatchIntentMethod =
              getMatchIntentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.cx.v3.MatchIntentRequest,
                          com.google.cloud.dialogflow.cx.v3.MatchIntentResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MatchIntent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.MatchIntentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.MatchIntentResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("MatchIntent"))
                      .build();
        }
      }
    }
    return getMatchIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest,
          com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse>
      getFulfillIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FulfillIntent",
      requestType = com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest.class,
      responseType = com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest,
          com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse>
      getFulfillIntentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest,
            com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse>
        getFulfillIntentMethod;
    if ((getFulfillIntentMethod = SessionsGrpc.getFulfillIntentMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getFulfillIntentMethod = SessionsGrpc.getFulfillIntentMethod) == null) {
          SessionsGrpc.getFulfillIntentMethod =
              getFulfillIntentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest,
                          com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FulfillIntent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("FulfillIntent"))
                      .build();
        }
      }
    }
    return getFulfillIntentMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static SessionsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionsStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SessionsStub>() {
          @java.lang.Override
          public SessionsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SessionsStub(channel, callOptions);
          }
        };
    return SessionsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionsBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionsBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SessionsBlockingStub>() {
          @java.lang.Override
          public SessionsBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SessionsBlockingStub(channel, callOptions);
          }
        };
    return SessionsBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static SessionsFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionsFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SessionsFutureStub>() {
          @java.lang.Override
          public SessionsFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SessionsFutureStub(channel, callOptions);
          }
        };
    return SessionsFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class SessionsImplBase implements io.grpc.BindableService {

    /** */
    public void detectIntent(
        com.google.cloud.dialogflow.cx.v3.DetectIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.DetectIntentResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getDetectIntentMethod(), responseObserver);
    }

    /** */
    public io.grpc.stub.StreamObserver<
            com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest>
        streamingDetectIntent(
            io.grpc.stub.StreamObserver<
                    com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse>
                responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamingDetectIntentMethod(), responseObserver);
    }

    /** */
    public void matchIntent(
        com.google.cloud.dialogflow.cx.v3.MatchIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.MatchIntentResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getMatchIntentMethod(), responseObserver);
    }

    /** */
    public void fulfillIntent(
        com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getFulfillIntentMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getDetectIntentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.cx.v3.DetectIntentRequest,
                      com.google.cloud.dialogflow.cx.v3.DetectIntentResponse>(
                      this, METHODID_DETECT_INTENT)))
          .addMethod(
              getStreamingDetectIntentMethod(),
              asyncBidiStreamingCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest,
                      com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse>(
                      this, METHODID_STREAMING_DETECT_INTENT)))
          .addMethod(
              getMatchIntentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.cx.v3.MatchIntentRequest,
                      com.google.cloud.dialogflow.cx.v3.MatchIntentResponse>(
                      this, METHODID_MATCH_INTENT)))
          .addMethod(
              getFulfillIntentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest,
                      com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse>(
                      this, METHODID_FULFILL_INTENT)))
          .build();
    }
  }

  /** */
  public static final class SessionsStub extends io.grpc.stub.AbstractAsyncStub<SessionsStub> {
    private SessionsStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionsStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionsStub(channel, callOptions);
    }

    /** */
    public void detectIntent(
        com.google.cloud.dialogflow.cx.v3.DetectIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.DetectIntentResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetectIntentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public io.grpc.stub.StreamObserver<
            com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest>
        streamingDetectIntent(
            io.grpc.stub.StreamObserver<
                    com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse>
                responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamingDetectIntentMethod(), getCallOptions()),
          responseObserver);
    }

    /** */
    public void matchIntent(
        com.google.cloud.dialogflow.cx.v3.MatchIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.MatchIntentResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMatchIntentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void fulfillIntent(
        com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFulfillIntentMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class SessionsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SessionsBlockingStub> {
    private SessionsBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionsBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionsBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.dialogflow.cx.v3.DetectIntentResponse detectIntent(
        com.google.cloud.dialogflow.cx.v3.DetectIntentRequest request) {
      return blockingUnaryCall(getChannel(), getDetectIntentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.dialogflow.cx.v3.MatchIntentResponse matchIntent(
        com.google.cloud.dialogflow.cx.v3.MatchIntentRequest request) {
      return blockingUnaryCall(getChannel(), getMatchIntentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse fulfillIntent(
        com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest request) {
      return blockingUnaryCall(getChannel(), getFulfillIntentMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class SessionsFutureStub
      extends io.grpc.stub.AbstractFutureStub<SessionsFutureStub> {
    private SessionsFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionsFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionsFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.cx.v3.DetectIntentResponse>
        detectIntent(com.google.cloud.dialogflow.cx.v3.DetectIntentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetectIntentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.cx.v3.MatchIntentResponse>
        matchIntent(com.google.cloud.dialogflow.cx.v3.MatchIntentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMatchIntentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse>
        fulfillIntent(com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFulfillIntentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECT_INTENT = 0;
  private static final int METHODID_MATCH_INTENT = 1;
  private static final int METHODID_FULFILL_INTENT = 2;
  private static final int METHODID_STREAMING_DETECT_INTENT = 3;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SessionsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SessionsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DETECT_INTENT:
          serviceImpl.detectIntent(
              (com.google.cloud.dialogflow.cx.v3.DetectIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.DetectIntentResponse>)
                  responseObserver);
          break;
        case METHODID_MATCH_INTENT:
          serviceImpl.matchIntent(
              (com.google.cloud.dialogflow.cx.v3.MatchIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.MatchIntentResponse>)
                  responseObserver);
          break;
        case METHODID_FULFILL_INTENT:
          serviceImpl.fulfillIntent(
              (com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAMING_DETECT_INTENT:
          return (io.grpc.stub.StreamObserver<Req>)
              serviceImpl.streamingDetectIntent(
                  (io.grpc.stub.StreamObserver<
                          com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse>)
                      responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class SessionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SessionsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.SessionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sessions");
    }
  }

  private static final class SessionsFileDescriptorSupplier extends SessionsBaseDescriptorSupplier {
    SessionsFileDescriptorSupplier() {}
  }

  private static final class SessionsMethodDescriptorSupplier extends SessionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SessionsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SessionsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new SessionsFileDescriptorSupplier())
                      .addMethod(getDetectIntentMethod())
                      .addMethod(getStreamingDetectIntentMethod())
                      .addMethod(getMatchIntentMethod())
                      .addMethod(getFulfillIntentMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
