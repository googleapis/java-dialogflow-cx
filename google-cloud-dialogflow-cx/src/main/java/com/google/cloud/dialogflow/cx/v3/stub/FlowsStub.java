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
package com.google.cloud.dialogflow.cx.v3.stub;

import static com.google.cloud.dialogflow.cx.v3.FlowsClient.ListFlowsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3.CreateFlowRequest;
import com.google.cloud.dialogflow.cx.v3.DeleteFlowRequest;
import com.google.cloud.dialogflow.cx.v3.Flow;
import com.google.cloud.dialogflow.cx.v3.GetFlowRequest;
import com.google.cloud.dialogflow.cx.v3.ListFlowsRequest;
import com.google.cloud.dialogflow.cx.v3.ListFlowsResponse;
import com.google.cloud.dialogflow.cx.v3.TrainFlowRequest;
import com.google.cloud.dialogflow.cx.v3.UpdateFlowRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import com.google.protobuf.Struct;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Dialogflow API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class FlowsStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<CreateFlowRequest, Flow> createFlowCallable() {
    throw new UnsupportedOperationException("Not implemented: createFlowCallable()");
  }

  public UnaryCallable<DeleteFlowRequest, Empty> deleteFlowCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteFlowCallable()");
  }

  public UnaryCallable<ListFlowsRequest, ListFlowsPagedResponse> listFlowsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listFlowsPagedCallable()");
  }

  public UnaryCallable<ListFlowsRequest, ListFlowsResponse> listFlowsCallable() {
    throw new UnsupportedOperationException("Not implemented: listFlowsCallable()");
  }

  public UnaryCallable<GetFlowRequest, Flow> getFlowCallable() {
    throw new UnsupportedOperationException("Not implemented: getFlowCallable()");
  }

  public UnaryCallable<UpdateFlowRequest, Flow> updateFlowCallable() {
    throw new UnsupportedOperationException("Not implemented: updateFlowCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<TrainFlowRequest, Empty, Struct> trainFlowOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: trainFlowOperationCallable()");
  }

  public UnaryCallable<TrainFlowRequest, Operation> trainFlowCallable() {
    throw new UnsupportedOperationException("Not implemented: trainFlowCallable()");
  }

  @Override
  public abstract void close();
}
