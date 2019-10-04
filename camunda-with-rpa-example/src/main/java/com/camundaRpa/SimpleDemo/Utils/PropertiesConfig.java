package com.camundaRpa.SimpleDemo.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import org.json.JSONObject;

import com.camundaRpa.SimpleDemo.CamundaBpmProcessApplication;

public class PropertiesConfig {
	
	public static Properties getAllProps() {
		
		InputStream input = CamundaBpmProcessApplication.class.getClassLoader().getResourceAsStream("application.properties");
		Properties prop = new Properties();
		try {
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public static String getProps(String propsName) throws IOException {
		
		InputStream input = CamundaBpmProcessApplication.class.getClassLoader().getResourceAsStream("application.properties");
		
		Properties prop = new Properties();
		prop.load(input);
		
		return prop.getProperty(propsName);
	}
	
	public static String getInputArgsJSONasString(Properties prop) {
		
		Set<String> propNames = prop.stringPropertyNames();
		JSONObject inputArgument = new JSONObject();
		for (String propsName : propNames) {
			if(propsName.contains("uipath.input.argument")) {
				inputArgument.put(propsName, prop.getProperty(propsName));
			}
		}
		return inputArgument.toString();
	}
	
	public static JSONObject getInputArgsJSON(Properties prop) {
		
		Set<String> propNames = prop.stringPropertyNames();
		JSONObject inputArgument = new JSONObject();
		for (String propsName : propNames) {
			if(propsName.contains("uipath.input.argument.")) {
				inputArgument.put(propsName.replace("uipath.input.argument.", "").trim(), prop.getProperty(propsName));
			}
		}
		return inputArgument;
		
		
	}

}
