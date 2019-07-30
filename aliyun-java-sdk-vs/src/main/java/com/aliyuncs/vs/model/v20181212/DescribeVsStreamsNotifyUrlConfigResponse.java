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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeVsStreamsNotifyUrlConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVsStreamsNotifyUrlConfigResponse extends AcsResponse {

	private String requestId;

	private LiveStreamsNotifyConfig liveStreamsNotifyConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LiveStreamsNotifyConfig getLiveStreamsNotifyConfig() {
		return this.liveStreamsNotifyConfig;
	}

	public void setLiveStreamsNotifyConfig(LiveStreamsNotifyConfig liveStreamsNotifyConfig) {
		this.liveStreamsNotifyConfig = liveStreamsNotifyConfig;
	}

	public static class LiveStreamsNotifyConfig {

		private String domainName;

		private String notifyUrl;

		private String authType;

		private String authKey;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getNotifyUrl() {
			return this.notifyUrl;
		}

		public void setNotifyUrl(String notifyUrl) {
			this.notifyUrl = notifyUrl;
		}

		public String getAuthType() {
			return this.authType;
		}

		public void setAuthType(String authType) {
			this.authType = authType;
		}

		public String getAuthKey() {
			return this.authKey;
		}

		public void setAuthKey(String authKey) {
			this.authKey = authKey;
		}
	}

	@Override
	public DescribeVsStreamsNotifyUrlConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeVsStreamsNotifyUrlConfigResponseUnmarshaller.unmarshall(this, context);
	}
}