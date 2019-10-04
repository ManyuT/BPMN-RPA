package com.camundaRpa.SimpleDemo.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Robots {
	
	@JsonProperty("@odata.context")
	private String context;
	
	@JsonProperty("@odata.count")
	private int count;
	
	private List<RobotsValue> value;

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<RobotsValue> getValue() {
		return value;
	}

	public void setValue(List<RobotsValue> value) {
		this.value = value;
	}
	
	

}
