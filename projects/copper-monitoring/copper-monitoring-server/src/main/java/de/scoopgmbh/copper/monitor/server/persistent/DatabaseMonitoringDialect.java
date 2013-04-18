/*
 * Copyright 2002-2013 SCOOP Software GmbH
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
package de.scoopgmbh.copper.monitor.server.persistent;

import java.sql.Connection;
import java.util.List;

import de.scoopgmbh.copper.audit.MessagePostProcessor;
import de.scoopgmbh.copper.monitor.core.adapter.model.AuditTrailInfo;
import de.scoopgmbh.copper.monitor.core.adapter.model.WorkflowInstanceInfo;
import de.scoopgmbh.copper.monitor.core.adapter.model.WorkflowInstanceState;
import de.scoopgmbh.copper.monitor.core.adapter.model.WorkflowStateSummary;
import de.scoopgmbh.copper.monitor.core.adapter.model.WorkflowSummary;

public interface DatabaseMonitoringDialect {

	public abstract WorkflowStateSummary selectTotalWorkflowStateSummary(Connection con);

	public abstract List<AuditTrailInfo> selectAuditTrails(String workflowClass, String workflowInstanceId, String correlationId, Integer level,
			long resultRowLimit, Connection con);

	public abstract String selectAuditTrailMessage(long id, Connection con, MessagePostProcessor messagePostProcessor);

	public abstract List<WorkflowSummary> selectWorkflowStateSummary(String poolid, String classname, Connection con);

	public abstract List<WorkflowInstanceInfo> selectWorkflowInstanceList(String poolid, String classname,
			WorkflowInstanceState state, Integer priority, long resultRowLimit, Connection con);

	public abstract List<String[]> executeMonitoringQuery(String query, long resultRowLimit, Connection con);

}