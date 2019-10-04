package com.camundaRpa.SimpleDemo.models;

import java.io.IOException;

import com.camundaRpa.SimpleDemo.Utils.PropertiesConfig;

/**
 * @author abhimanyu.thite
 *
 */
public class LoginDTO {
	
	public String tenancyName;
	public String usernameOrEmailAddress;
	public String password;
	
	public String getTenancyName() {
		return tenancyName;
	}
	public void setTenancyName(String tenancyName) {
		this.tenancyName = tenancyName;
	}
	public String getUsernameOrEmailAddress() {
		return usernameOrEmailAddress;
	}
	public void setUsernameOrEmailAddress(String usernameOrEmailAddress) {
		this.usernameOrEmailAddress = usernameOrEmailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginDTO() throws IOException {
		super();
		this.tenancyName = PropertiesConfig.getProps("uipath.tenancy.NAME");
		this.usernameOrEmailAddress = PropertiesConfig.getProps("uipath.tenancy.usernameOrEmail");
		this.password = PropertiesConfig.getProps("uipath.tenancy.password");
	}
	
	
	

}
