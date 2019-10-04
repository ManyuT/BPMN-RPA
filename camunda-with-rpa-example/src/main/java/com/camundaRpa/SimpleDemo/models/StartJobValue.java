package com.camundaRpa.SimpleDemo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StartJobValue {
	
	@JsonProperty("Key")
	private String Key;
	
	@JsonProperty("StartTime")
	private String StartTime;
	
	@JsonProperty("EndTime")
	private String EndTime;
	
	@JsonProperty("State")
	private String State;
	
	@JsonProperty("Source")
	private String Source;
	
	@JsonProperty("SourceType")
	private String SourceType;
	
	@JsonProperty("BatchExecutionKey")
	private String BatchExecutionKey;
	
	@JsonProperty("Info")
	private String Info;
	
	@JsonProperty("CreationTime")
	private String CreationTime;
	
	@JsonProperty("StartingScheduleId")
	private String StartingScheduleId;
	
	@JsonProperty("ReleaseName")
	private String ReleaseName;
	
	@JsonProperty("Type")
	private String Type;
	
	@JsonProperty("InputArguments")
	private String InputArguments;
	
	@JsonProperty("OutputArguments")
	private String OutputArguments;
	
	@JsonProperty("HostMachineName")
	private String HostMachineName;
	
	@JsonProperty("HasMediaRecorded")
	private String HasMediaRecorded;
	
	@JsonProperty("PersistenceId")
	private String PersistenceId;
	
	@JsonProperty("ResumeVersion")
	private String ResumeVersion;
	
	@JsonProperty("StopStrategy")
	private String StopStrategy;
	
	@JsonProperty("Id")
	private String Id;

	public String getKey() {
		return Key;
	}

	public void setKey(String key) {
		Key = key;
	}

	public String getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getSourceType() {
		return SourceType;
	}

	public void setSourceType(String sourceType) {
		SourceType = sourceType;
	}

	public String getBatchExecutionKey() {
		return BatchExecutionKey;
	}

	public void setBatchExecutionKey(String batchExecutionKey) {
		BatchExecutionKey = batchExecutionKey;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public String getCreationTime() {
		return CreationTime;
	}

	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}

	public String getStartingScheduleId() {
		return StartingScheduleId;
	}

	public void setStartingScheduleId(String startingScheduleId) {
		StartingScheduleId = startingScheduleId;
	}

	public String getReleaseName() {
		return ReleaseName;
	}

	public void setReleaseName(String releaseName) {
		ReleaseName = releaseName;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getInputArguments() {
		return InputArguments;
	}

	public void setInputArguments(String inputArguments) {
		InputArguments = inputArguments;
	}

	public String getOutputArguments() {
		return OutputArguments;
	}

	public void setOutputArguments(String outputArguments) {
		OutputArguments = outputArguments;
	}

	public String getHostMachineName() {
		return HostMachineName;
	}

	public void setHostMachineName(String hostMachineName) {
		HostMachineName = hostMachineName;
	}

	public String getHasMediaRecorded() {
		return HasMediaRecorded;
	}

	public void setHasMediaRecorded(String hasMediaRecorded) {
		HasMediaRecorded = hasMediaRecorded;
	}

	public String getPersistenceId() {
		return PersistenceId;
	}

	public void setPersistenceId(String persistenceId) {
		PersistenceId = persistenceId;
	}

	public String getResumeVersion() {
		return ResumeVersion;
	}

	public void setResumeVersion(String resumeVersion) {
		ResumeVersion = resumeVersion;
	}

	public String getStopStrategy() {
		return StopStrategy;
	}

	public void setStopStrategy(String stopStrategy) {
		StopStrategy = stopStrategy;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
	
}
