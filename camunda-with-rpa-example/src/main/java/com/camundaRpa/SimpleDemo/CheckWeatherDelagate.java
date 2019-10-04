package com.camundaRpa.SimpleDemo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.json.JSONObject;

import com.camundaRpa.SimpleDemo.Services.Impl.UiPathServicesImpl;
import com.camundaRpa.SimpleDemo.Utils.PropertiesConfig;
import com.camundaRpa.SimpleDemo.models.RunProcessDTO;

/**
 * @author abhimanyu.thite
 *
 */
public class CheckWeatherDelagate implements JavaDelegate {
	
//	@Autowired
//	UiPathServicesImpl uiPathServicesImpl;
	
	UiPathServicesImpl uiPathServicesImpl = new UiPathServicesImpl(); 

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		execution.setVariable("dateAndTime", null);
		execution.setVariable("location", null);
		execution.setVariable("tempreture", null);
		execution.setVariable("weatherType", null);
		
		RunProcessDTO runProcessDTO = new RunProcessDTO();
		
		String businessKey = execution.getProcessBusinessKey();
		
		JSONObject inputArgument = PropertiesConfig.getInputArgsJSON(PropertiesConfig.getAllProps());
		inputArgument.put("in_BusinessKey", businessKey);
		runProcessDTO.setInputArgument(inputArgument.toString());
		
		uiPathServicesImpl.startJob(runProcessDTO);
	}

	
}
