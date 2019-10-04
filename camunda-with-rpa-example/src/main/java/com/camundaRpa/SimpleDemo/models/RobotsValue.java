package com.camundaRpa.SimpleDemo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RobotsValue {
	
	@JsonProperty("LicenseKey")
	private String LicenseKey;
	
	@JsonProperty("MachineName")
	private String MachineName;
	
	@JsonProperty("MachineId")
	private String MachineId;
	
	@JsonProperty("Name")
	private String Name;
	
	@JsonProperty("Username")
	private String Username;
	
	@JsonProperty("ExternalName")
	private String ExternalName;
	
	@JsonProperty("Description")
	private String Description;
	
	@JsonProperty("Version")
	private String Version;
	
	@JsonProperty("Type")
	private String Type;
	
	@JsonProperty("HostingType")
	private String HostingType;
	
	@JsonProperty("Password")
	private String Password;
	
	@JsonProperty("CredentialStoreId")
	private String CredentialStoreId;
	
	@JsonProperty("UserId")
	private String UserId;
	
	@JsonProperty("CredentialType")
	private String CredentialType;
	
	@JsonProperty("RobotEnvironments")
	private String RobotEnvironments;
	
	@JsonProperty("Id")
	private Long Id;
	
	@JsonProperty("ExecutionSettings")
	private String ExecutionSettings;

	public String getLicenseKey() {
		return LicenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		LicenseKey = licenseKey;
	}

	public String getMachineName() {
		return MachineName;
	}

	public void setMachineName(String machineName) {
		MachineName = machineName;
	}

	public String getMachineId() {
		return MachineId;
	}

	public void setMachineId(String machineId) {
		MachineId = machineId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getExternalName() {
		return ExternalName;
	}

	public void setExternalName(String externalName) {
		ExternalName = externalName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getHostingType() {
		return HostingType;
	}

	public void setHostingType(String hostingType) {
		HostingType = hostingType;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getCredentialStoreId() {
		return CredentialStoreId;
	}

	public void setCredentialStoreId(String credentialStoreId) {
		CredentialStoreId = credentialStoreId;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getCredentialType() {
		return CredentialType;
	}

	public void setCredentialType(String credentialType) {
		CredentialType = credentialType;
	}

	public String getRobotEnvironments() {
		return RobotEnvironments;
	}

	public void setRobotEnvironments(String robotEnvironments) {
		RobotEnvironments = robotEnvironments;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getExecutionSettings() {
		return ExecutionSettings;
	}

	public void setExecutionSettings(String executionSettings) {
		ExecutionSettings = executionSettings;
	}
	
	
	
	

}
