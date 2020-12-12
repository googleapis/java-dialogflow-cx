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
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/dialogflow/cx/v3/session_entity_type.proto")
public final class SessionEntityTypesGrpc {

  private SessionEntityTypesGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.cx.v3.SessionEntityTypes";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest,
          com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse>
      getListSessionEntityTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessionEntityTypes",
      requestType = com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest.class,
      responseType = com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest,
          com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse>
      getListSessionEntityTypesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest,
            com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse>
        getListSessionEntityTypesMethod;
    if ((getListSessionEntityTypesMethod = SessionEntityTypesGrpc.getListSessionEntityTypesMethod)
        == null) {
      synchronized (SessionEntityTypesGrpc.class) {
        if ((getListSessionEntityTypesMethod =
                SessionEntityTypesGrpc.getListSessionEntityTypesMethod)
            == null) {
          SessionEntityTypesGrpc.getListSessionEntityTypesMethod =
              getListSessionEntityTypesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest,
                          com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListSessionEntityTypes"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new SessionEntityTypesMethodDescriptorSupplier("ListSessionEntityTypes"))
                      .build();
        }
      }
    }
    return getListSessionEntityTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest,
          com.google.cloud.dialogflow.cx.v3.SessionEntityType>
      getGetSessionEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessionEntityType",
      requestType = com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest.class,
      responseType = com.google.cloud.dialogflow.cx.v3.SessionEntityType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest,
          com.google.cloud.dialogflow.cx.v3.SessionEntityType>
      getGetSessionEntityTypeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest,
            com.google.cloud.dialogflow.cx.v3.SessionEntityType>
        getGetSessionEntityTypeMethod;
    if ((getGetSessionEntityTypeMethod = SessionEntityTypesGrpc.getGetSessionEntityTypeMethod)
        == null) {
      synchronized (SessionEntityTypesGrpc.class) {
        if ((getGetSessionEntityTypeMethod = SessionEntityTypesGrpc.getGetSessionEntityTypeMethod)
            == null) {
          SessionEntityTypesGrpc.getGetSessionEntityTypeMethod =
              getGetSessionEntityTypeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest,
                          com.google.cloud.dialogflow.cx.v3.SessionEntityType>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetSessionEntityType"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.SessionEntityType
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new SessionEntityTypesMethodDescriptorSupplier("GetSessionEntityType"))
                      .build();
        }
      }
    }
    return getGetSessionEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest,
          com.google.cloud.dialogflow.cx.v3.SessionEntityType>
      getCreateSessionEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSessionEntityType",
      requestType = com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest.class,
      responseType = com.google.cloud.dialogflow.cx.v3.SessionEntityType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest,
          com.google.cloud.dialogflow.cx.v3.SessionEntityType>
      getCreateSessionEntityTypeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest,
            com.google.cloud.dialogflow.cx.v3.SessionEntityType>
        getCreateSessionEntityTypeMethod;
    if ((getCreateSessionEntityTypeMethod = SessionEntityTypesGrpc.getCreateSessionEntityTypeMethod)
        == null) {
      synchronized (SessionEntityTypesGrpc.class) {
        if ((getCreateSessionEntityTypeMethod =
                SessionEntityTypesGrpc.getCreateSessionEntityTypeMethod)
            == null) {
          SessionEntityTypesGrpc.getCreateSessionEntityTypeMethod =
              getCreateSessionEntityTypeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest,
                          com.google.cloud.dialogflow.cx.v3.SessionEntityType>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateSessionEntityType"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.SessionEntityType
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new SessionEntityTypesMethodDescriptorSupplier("CreateSessionEntityType"))
                      .build();
        }
      }
    }
    return getCreateSessionEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest,
          com.google.cloud.dialogflow.cx.v3.SessionEntityType>
      getUpdateSessionEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSessionEntityType",
      requestType = com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest.class,
      responseType = com.google.cloud.dialogflow.cx.v3.SessionEntityType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest,
          com.google.cloud.dialogflow.cx.v3.SessionEntityType>
      getUpdateSessionEntityTypeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest,
            com.google.cloud.dialogflow.cx.v3.SessionEntityType>
        getUpdateSessionEntityTypeMethod;
    if ((getUpdateSessionEntityTypeMethod = SessionEntityTypesGrpc.getUpdateSessionEntityTypeMethod)
        == null) {
      synchronized (SessionEntityTypesGrpc.class) {
        if ((getUpdateSessionEntityTypeMethod =
                SessionEntityTypesGrpc.getUpdateSessionEntityTypeMethod)
            == null) {
          SessionEntityTypesGrpc.getUpdateSessionEntityTypeMethod =
              getUpdateSessionEntityTypeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest,
                          com.google.cloud.dialogflow.cx.v3.SessionEntityType>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateSessionEntityType"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.SessionEntityType
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new SessionEntityTypesMethodDescriptorSupplier("UpdateSessionEntityType"))
                      .build();
        }
      }
    }
    return getUpdateSessionEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest,
          com.google.protobuf.Empty>
      getDeleteSessionEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSessionEntityType",
      requestType = com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest,
          com.google.protobuf.Empty>
      getDeleteSessionEntityTypeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest,
            com.google.protobuf.Empty>
        getDeleteSessionEntityTypeMethod;
    if ((getDeleteSessionEntityTypeMethod = SessionEntityTypesGrpc.getDeleteSessionEntityTypeMethod)
        == null) {
      synchronized (SessionEntityTypesGrpc.class) {
        if ((getDeleteSessionEntityTypeMethod =
                SessionEntityTypesGrpc.getDeleteSessionEntityTypeMethod)
            == null) {
          SessionEntityTypesGrpc.getDeleteSessionEntityTypeMethod =
              getDeleteSessionEntityTypeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DeleteSessionEntityType"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new SessionEntityTypesMethodDescriptorSupplier("DeleteSessionEntityType"))
                      .build();
        }
      }
    }
    return getDeleteSessionEntityTypeMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static SessionEntityTypesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionEntityTypesStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SessionEntityTypesStub>() {
          @java.lang.Override
          public SessionEntityTypesStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SessionEntityTypesStub(channel, callOptions);
          }
        };
    return SessionEntityTypesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionEntityTypesBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionEntityTypesBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SessionEntityTypesBlockingStub>() {
          @java.lang.Override
          public SessionEntityTypesBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SessionEntityTypesBlockingStub(channel, callOptions);
          }
        };
    return SessionEntityTypesBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static SessionEntityTypesFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionEntityTypesFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<SessionEntityTypesFutureStub>() {
          @java.lang.Override
          public SessionEntityTypesFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SessionEntityTypesFutureStub(channel, callOptions);
          }
        };
    return SessionEntityTypesFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class SessionEntityTypesImplBase implements io.grpc.BindableService {

    /** */
    public void listSessionEntityTypes(
        com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListSessionEntityTypesMethod(), responseObserver);
    }

    /** */
    public void getSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.SessionEntityType>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetSessionEntityTypeMethod(), responseObserver);
    }

    /** */
    public void createSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.SessionEntityType>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSessionEntityTypeMethod(), responseObserver);
    }

    /** */
    public void updateSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.SessionEntityType>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSessionEntityTypeMethod(), responseObserver);
    }

    /** */
    public void deleteSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSessionEntityTypeMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListSessionEntityTypesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest,
                      com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse>(
                      this, METHODID_LIST_SESSION_ENTITY_TYPES)))
          .addMethod(
              getGetSessionEntityTypeMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest,
                      com.google.cloud.dialogflow.cx.v3.SessionEntityType>(
                      this, METHODID_GET_SESSION_ENTITY_TYPE)))
          .addMethod(
              getCreateSessionEntityTypeMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest,
                      com.google.cloud.dialogflow.cx.v3.SessionEntityType>(
                      this, METHODID_CREATE_SESSION_ENTITY_TYPE)))
          .addMethod(
              getUpdateSessionEntityTypeMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest,
                      com.google.cloud.dialogflow.cx.v3.SessionEntityType>(
                      this, METHODID_UPDATE_SESSION_ENTITY_TYPE)))
          .addMethod(
              getDeleteSessionEntityTypeMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_SESSION_ENTITY_TYPE)))
          .build();
    }
  }

  /** */
  public static final class SessionEntityTypesStub
      extends io.grpc.stub.AbstractAsyncStub<SessionEntityTypesStub> {
    private SessionEntityTypesStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionEntityTypesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionEntityTypesStub(channel, callOptions);
    }

    /** */
    public void listSessionEntityTypes(
        com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSessionEntityTypesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.SessionEntityType>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSessionEntityTypeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.SessionEntityType>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSessionEntityTypeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.SessionEntityType>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSessionEntityTypeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSessionEntityTypeMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class SessionEntityTypesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SessionEntityTypesBlockingStub> {
    private SessionEntityTypesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionEntityTypesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionEntityTypesBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse listSessionEntityTypes(
        com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSessionEntityTypesMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.dialogflow.cx.v3.SessionEntityType getSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSessionEntityTypeMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.dialogflow.cx.v3.SessionEntityType createSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSessionEntityTypeMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.dialogflow.cx.v3.SessionEntityType updateSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSessionEntityTypeMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteSessionEntityType(
        com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSessionEntityTypeMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class SessionEntityTypesFutureStub
      extends io.grpc.stub.AbstractFutureStub<SessionEntityTypesFutureStub> {
    private SessionEntityTypesFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionEntityTypesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionEntityTypesFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse>
        listSessionEntityTypes(
            com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSessionEntityTypesMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.cx.v3.SessionEntityType>
        getSessionEntityType(
            com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSessionEntityTypeMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.cx.v3.SessionEntityType>
        createSessionEntityType(
            com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSessionEntityTypeMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.cx.v3.SessionEntityType>
        updateSessionEntityType(
            com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSessionEntityTypeMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteSessionEntityType(
            com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSessionEntityTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SESSION_ENTITY_TYPES = 0;
  private static final int METHODID_GET_SESSION_ENTITY_TYPE = 1;
  private static final int METHODID_CREATE_SESSION_ENTITY_TYPE = 2;
  private static final int METHODID_UPDATE_SESSION_ENTITY_TYPE = 3;
  private static final int METHODID_DELETE_SESSION_ENTITY_TYPE = 4;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SessionEntityTypesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SessionEntityTypesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SESSION_ENTITY_TYPES:
          serviceImpl.listSessionEntityTypes(
              (com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dialogflow.cx.v3.ListSessionEntityTypesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_SESSION_ENTITY_TYPE:
          serviceImpl.getSessionEntityType(
              (com.google.cloud.dialogflow.cx.v3.GetSessionEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.SessionEntityType>)
                  responseObserver);
          break;
        case METHODID_CREATE_SESSION_ENTITY_TYPE:
          serviceImpl.createSessionEntityType(
              (com.google.cloud.dialogflow.cx.v3.CreateSessionEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.SessionEntityType>)
                  responseObserver);
          break;
        case METHODID_UPDATE_SESSION_ENTITY_TYPE:
          serviceImpl.updateSessionEntityType(
              (com.google.cloud.dialogflow.cx.v3.UpdateSessionEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.cx.v3.SessionEntityType>)
                  responseObserver);
          break;
        case METHODID_DELETE_SESSION_ENTITY_TYPE:
          serviceImpl.deleteSessionEntityType(
              (com.google.cloud.dialogflow.cx.v3.DeleteSessionEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class SessionEntityTypesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SessionEntityTypesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.SessionEntityTypeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SessionEntityTypes");
    }
  }

  private static final class SessionEntityTypesFileDescriptorSupplier
      extends SessionEntityTypesBaseDescriptorSupplier {
    SessionEntityTypesFileDescriptorSupplier() {}
  }

  private static final class SessionEntityTypesMethodDescriptorSupplier
      extends SessionEntityTypesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SessionEntityTypesMethodDescriptorSupplier(String methodName) {
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
      synchronized (SessionEntityTypesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new SessionEntityTypesFileDescriptorSupplier())
                      .addMethod(getListSessionEntityTypesMethod())
                      .addMethod(getGetSessionEntityTypeMethod())
                      .addMethod(getCreateSessionEntityTypeMethod())
                      .addMethod(getUpdateSessionEntityTypeMethod())
                      .addMethod(getDeleteSessionEntityTypeMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
