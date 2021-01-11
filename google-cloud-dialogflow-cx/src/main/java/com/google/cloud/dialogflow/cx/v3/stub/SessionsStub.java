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

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3.DetectIntentRequest;
import com.google.cloud.dialogflow.cx.v3.DetectIntentResponse;
import com.google.cloud.dialogflow.cx.v3.FulfillIntentRequest;
import com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse;
import com.google.cloud.dialogflow.cx.v3.MatchIntentRequest;
import com.google.cloud.dialogflow.cx.v3.MatchIntentResponse;
import com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest;
import com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the Sessions service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class SessionsStub implements BackgroundResource {

  public UnaryCallable<DetectIntentRequest, DetectIntentResponse> detectIntentCallable() {
    throw new UnsupportedOperationException("Not implemented: detectIntentCallable()");
  }

  public BidiStreamingCallable<StreamingDetectIntentRequest, StreamingDetectIntentResponse>
      streamingDetectIntentCallable() {
    throw new UnsupportedOperationException("Not implemented: streamingDetectIntentCallable()");
  }

  public UnaryCallable<MatchIntentRequest, MatchIntentResponse> matchIntentCallable() {
    throw new UnsupportedOperationException("Not implemented: matchIntentCallable()");
  }

  public UnaryCallable<FulfillIntentRequest, FulfillIntentResponse> fulfillIntentCallable() {
    throw new UnsupportedOperationException("Not implemented: fulfillIntentCallable()");
  }

  @Override
  public abstract void close();
}
