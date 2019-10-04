package com.camundaRpa.SimpleDemo.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Releases {
	
	@JsonProperty("@odata.context")
	private String context;
	
	@JsonProperty("@odata.count")
	private int count;
	private List<ReleasesValue> value;
	
	@JsonGetter("@odata.context")
	public String getContext() {
		return context;
	}
	
	@JsonSetter("@odata.context")
	public void setContext(String context) {
		this.context = context;
	}
	
	@JsonGetter("@odata.count")
	public int getCount() {
		return count;
	}
	
	@JsonSetter("@odata.count")
	public void setCount(int count) {
		this.count = count;
	}
	public List<ReleasesValue> getValue() {
		return value;
	}
	
	public void setValue(List<ReleasesValue> value) {
		this.value = value;
	}
	
	
	
	

}
