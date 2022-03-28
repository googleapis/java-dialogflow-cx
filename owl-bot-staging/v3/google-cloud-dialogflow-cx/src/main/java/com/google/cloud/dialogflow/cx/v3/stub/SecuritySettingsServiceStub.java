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

package com.google.cloud.dialogflow.cx.v3.stub;

import static com.google.cloud.dialogflow.cx.v3.SecuritySettingsServiceClient.ListSecuritySettingsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest;
import com.google.cloud.dialogflow.cx.v3.DeleteSecuritySettingsRequest;
import com.google.cloud.dialogflow.cx.v3.GetSecuritySettingsRequest;
import com.google.cloud.dialogflow.cx.v3.ListSecuritySettingsRequest;
import com.google.cloud.dialogflow.cx.v3.ListSecuritySettingsResponse;
import com.google.cloud.dialogflow.cx.v3.SecuritySettings;
import com.google.cloud.dialogflow.cx.v3.UpdateSecuritySettingsRequest;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the SecuritySettingsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class SecuritySettingsServiceStub implements BackgroundResource {

  public UnaryCallable<CreateSecuritySettingsRequest, SecuritySettings>
      createSecuritySettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: createSecuritySettingsCallable()");
  }

  public UnaryCallable<GetSecuritySettingsRequest, SecuritySettings> getSecuritySettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: getSecuritySettingsCallable()");
  }

  public UnaryCallable<UpdateSecuritySettingsRequest, SecuritySettings>
      updateSecuritySettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSecuritySettingsCallable()");
  }

  public UnaryCallable<ListSecuritySettingsRequest, ListSecuritySettingsPagedResponse>
      listSecuritySettingsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSecuritySettingsPagedCallable()");
  }

  public UnaryCallable<ListSecuritySettingsRequest, ListSecuritySettingsResponse>
      listSecuritySettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: listSecuritySettingsCallable()");
  }

  public UnaryCallable<DeleteSecuritySettingsRequest, Empty> deleteSecuritySettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSecuritySettingsCallable()");
  }

  @Override
  public abstract void close();
}
