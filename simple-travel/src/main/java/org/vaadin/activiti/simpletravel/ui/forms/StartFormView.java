package org.vaadin.activiti.simpletravel.ui.forms;

import com.github.peholmst.mvp4vaadin.View;
import org.activiti.engine.repository.ProcessDefinition;

public interface StartFormView extends View {
    
    void setProcessDefinition(ProcessDefinition processDefinition);
    
}
