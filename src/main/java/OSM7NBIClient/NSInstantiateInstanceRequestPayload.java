/*-
 * ========================LICENSE_START=================================
 * io.openslice.sol005nbi.osm7
 * %%
 * Copyright (C) 2019 openslice.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */

package OSM7NBIClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NSInstantiateInstanceRequestPayload
{
	private String nsName;
	public String getNsName() {
		return nsName;
	}

	public void setNsName(String nsName) {
		this.nsName = nsName;
	}

	private String vimAccountId;
	public String getVimAccountId() {
		return vimAccountId;
	}

	public void setVimAccountId(String vimAccountId) {
		this.vimAccountId = vimAccountId;
	}

	private String nsdId;
	public String getNsdId() {
		return nsdId;
	}

	public void setNsdId(String nsdId) {
		this.nsdId = nsdId;
	}

	public class VnF
	{
		@JsonProperty("member-vnf-index")
		private String memberVnFIndex;
		public String getMemberVnFIndex() {
			return memberVnFIndex;
		}
		public void setMemberVnFIndex(String memberVnFIndex) {
			this.memberVnFIndex = memberVnFIndex;
		}
		@JsonProperty("vimAccountId")
		private String vimAccount;
		public String getVimAccount() {
			return vimAccount;
		}
		public void setVimAccount(String vimAccount) {
			this.vimAccount = vimAccount;
		}
		
		public VnF()
		{
			
		};
	}
	class Vld
	{
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@JsonProperty("vim-network-name")
		private LinkedHashMap<String,String> vimNetworkName = new LinkedHashMap<>();
		public LinkedHashMap<String, String> getVimNetworkName() {
			return vimNetworkName;
		}
		public void setVimNetworkName(LinkedHashMap<String, String> vimNetworkName) {
			this.vimNetworkName = vimNetworkName;
		}
	}
	private List<VnF> vnf = new ArrayList<>();
	//public List<Vld> vld = new ArrayList<>();
		
	public List<VnF> getVnf() {
		return vnf;
	}

	public void setVnf(List<VnF> vnf) {
		this.vnf = vnf;
	}

//	public NSInstantiateInstanceRequestPayload(String nsName, String vimAccountId, String nsdId)
//	{
//		this.nsName = nsName;
//		this.vimAccountId = vimAccountId;
//		// Here we need to get the ExperimentOnBoardDescriptor based on the Experiment.
//		// An Experiment might have multiple OnBoardDescriptors if it is OnBoarded to multiple OSM MANOs.
//		// We temporarily select the first (and most probably the only one). 
//		// Otherwise the user needs to define the OSM MANO where the Experiment is OnBoarded in order to instantiate.
//		this.nsdId = nsdId;
//		OSM7Client osm7client = new OSM7client
//		NSD nsd_tmp = getNSDbyID(nsdId);
//		Integer count=1;
//		// READ the NSD from the OSM and get the vnfds and form the payload
////		for(DeploymentDescriptorVxFPlacement tmp : deploymentdescriptor.getVxfPlacements())
////		{
////			VnF vnf_tmp = new VnF();
////			vnf_tmp.memberVnFIndex=count.toString();
////			vnf_tmp.vimAccount = tmp.getInfrastructure().getVIMid();
////			this.vnf.add(vnf_tmp);
////			count++;
////		}
//		// READ the NSD from the OSM and get the vlds and form the payload
//	}
	
	public String toJSON()
	{
		String jsonInString=null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			jsonInString = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return jsonInString;
	}
	
}
