package com.camundaRpa.SimpleDemo.models;

import java.io.IOException;

import com.camundaRpa.SimpleDemo.Utils.PropertiesConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author abhimanyu.thite
 *
 */
public class RunProcessDTO {
	
	private String processName;
	
	private String  robotName;
	
	@JsonProperty("inputArgument")
	private String InputArgument;
	
	private LoginDTO loginCredential;
	
	public String getProcessName() {
		return processName;
	}
	
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	
	public String getRobotName() {
		return robotName;
	}
	
	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}
	
	public String getInputArgument() {
		return InputArgument;
	}
	
	public void setInputArgument(String inputArgument) {
		InputArgument = inputArgument;
	}
	
	public LoginDTO getLoginCredential() {
		return loginCredential;
	}
	
	public void setLoginCredential(LoginDTO loginCredential) {
		this.loginCredential = loginCredential;
	}

	public RunProcessDTO() throws IOException {
		super();
		this.processName = PropertiesConfig.getProps("uipath.ProcessName");
		this.robotName = PropertiesConfig.getProps("uipath.RobotName");
		this.InputArgument = "";
		this.loginCredential = new LoginDTO();
	}

	
	
	
	

}
