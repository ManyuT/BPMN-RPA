package com.camundaRpa.SimpleDemo.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StartJob {
	
	@JsonProperty("@odata.context")
	private String context;
	
	private List<StartJobValue> value;

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public List<StartJobValue> getValue() {
		return value;
	}

	public void setValue(List<StartJobValue> value) {
		this.value = value;
	}
	
	
	
	

}
