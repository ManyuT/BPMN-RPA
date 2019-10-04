package com.camundaRpa.SimpleDemo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReleasesValue {
	
	@JsonProperty("Key")
	private String Key;
	@JsonProperty("ProcessKey")
	private String ProcessKey;
	@JsonProperty("ProcessVersion")
	private String ProcessVersion;
	@JsonProperty("IsLatestVersion")
	private String IsLatestVersion;
	@JsonProperty("IsProcessDeleted")
	private String IsProcessDeleted;
	@JsonProperty("Description")
	private String Description;
	@JsonProperty("Name")
	private String Name;
	@JsonProperty("EnvironmentId")
	private String EnvironmentId;
	@JsonProperty("EnvironmentName")
	private String EnvironmentName;
	@JsonProperty("InputArguments")
	private String InputArguments;
	@JsonProperty("Id")
	private Long Id;
	@JsonProperty("Arguments")
	private ReleasesValueArgs Arguments;
	@JsonProperty("ProcessSettings")
	private String ProcessSettings;
	
	public String getKey() {
		return Key;
	}
	public void setKey(String Key) {
		this.Key = Key;
	}
	public String getProcessKey() {
		return ProcessKey;
	}
	public void setProcessKey(String processKey) {
		ProcessKey = processKey;
	}
	public String getProcessVersion() {
		return ProcessVersion;
	}
	public void setProcessVersion(String processVersion) {
		ProcessVersion = processVersion;
	}
	public String getIsLatestVersion() {
		return IsLatestVersion;
	}
	public void setIsLatestVersion(String isLatestVersion) {
		IsLatestVersion = isLatestVersion;
	}
	public String getIsProcessDeleted() {
		return IsProcessDeleted;
	}
	public void setIsProcessDeleted(String isProcessDeleted) {
		IsProcessDeleted = isProcessDeleted;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEnvironmentId() {
		return EnvironmentId;
	}
	public void setEnvironmentId(String environmentId) {
		EnvironmentId = environmentId;
	}
	public String getEnvironmentName() {
		return EnvironmentName;
	}
	public void setEnvironmentName(String environmentName) {
		EnvironmentName = environmentName;
	}
	public String getInputArguments() {
		return InputArguments;
	}
	public void setInputArguments(String inputArguments) {
		InputArguments = inputArguments;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public ReleasesValueArgs getArguments() {
		return Arguments;
	}
	public void setArguments(ReleasesValueArgs arguments) {
		Arguments = arguments;
	}
	public String getProcessSettings() {
		return ProcessSettings;
	}
	public void setProcessSettings(String processSettings) {
		ProcessSettings = processSettings;
	}
	
	
}
