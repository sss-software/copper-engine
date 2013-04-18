/*
 * Copyright 2002-2012 SCOOP Software GmbH
 *
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
 */
package de.scoopgmbh.copper.gui.ui.dashboard.result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.scoopgmbh.copper.monitor.core.adapter.model.ProcessingEngineInfo;
import de.scoopgmbh.copper.monitor.core.adapter.model.WorkflowStateSummary;

public class DashboardResultModel {
	
	public final List<ProcessingEngineInfo> engines = new ArrayList<ProcessingEngineInfo>();
	private Map<String,WorkflowStateSummary> engineIdTostateSummery = new HashMap<String,WorkflowStateSummary>();
	
	public DashboardResultModel(Map<String, WorkflowStateSummary> engineIdTostateSummery, List<ProcessingEngineInfo> processingEngineInfo){
		this.engineIdTostateSummery.putAll(engineIdTostateSummery);
		this.engines.addAll(processingEngineInfo);
	}
	
	public WorkflowStateSummary getStateSummery(String engineId){
		return engineIdTostateSummery.get(engineId);
	}
	

}
