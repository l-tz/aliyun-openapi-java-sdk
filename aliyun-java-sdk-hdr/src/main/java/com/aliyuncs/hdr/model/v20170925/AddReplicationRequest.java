/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddReplicationRequest extends RpcAcsRequest<AddReplicationResponse> {
	
	public AddReplicationRequest() {
		super("hdr", "2017-09-25", "AddReplication", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String replicationInfo;

	private String gatewayId;

	public String getReplicationInfo() {
		return this.replicationInfo;
	}

	public void setReplicationInfo(String replicationInfo) {
		this.replicationInfo = replicationInfo;
		if(replicationInfo != null){
			putQueryParameter("ReplicationInfo", replicationInfo);
		}
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	@Override
	public Class<AddReplicationResponse> getResponseClass() {
		return AddReplicationResponse.class;
	}

}
