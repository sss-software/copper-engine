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
package de.scoopgmbh.copper.gui.ui.repository.filter;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import de.scoopgmbh.copper.gui.form.FxmlController;
import de.scoopgmbh.copper.gui.form.filter.FilterController;
import de.scoopgmbh.copper.monitor.core.adapter.model.WorkflowInstanceState;

public class WorkflowRepositoryFilterController implements Initializable, FilterController<WorkflowRepositoryFilterModel>, FxmlController {
	WorkflowRepositoryFilterModel model = new WorkflowRepositoryFilterModel();

	public class EmptySelectionWorkaround{
		public WorkflowInstanceState value;
		public String text;
		public EmptySelectionWorkaround(WorkflowInstanceState value, String text) {
			super();
			this.value = value;
			this.text = text;
		}
		
	}


    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
       
	}

	@Override
	public WorkflowRepositoryFilterModel getFilter() {
		return model;
	}

	@Override
	public URL getFxmlRessource() {
		return getClass().getResource("WorkflowRepositoryFilter.fxml");
	}
	
	@Override
	public boolean supportsFiltering() {
		return true;
	}
	
}
