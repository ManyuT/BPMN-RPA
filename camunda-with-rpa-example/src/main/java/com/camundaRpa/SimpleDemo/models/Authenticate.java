package com.camundaRpa.SimpleDemo.models;

public class Authenticate {
	
	private String result;
	private String targetUrl;
	private boolean success;
	private String error;
	private boolean unAuthorizedRequest;
	private boolean __abp;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getTargetUrl() {
		return targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public boolean isUnAuthorizedRequest() {
		return unAuthorizedRequest;
	}
	public void setUnAuthorizedRequest(boolean unAuthorizedRequest) {
		this.unAuthorizedRequest = unAuthorizedRequest;
	}
	public boolean is__abp() {
		return __abp;
	}
	public void set__abp(boolean __abp) {
		this.__abp = __abp;
	}
}
