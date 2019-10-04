package com.camundaRpa.SimpleDemo.Services.Impl;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.camundaRpa.SimpleDemo.Services.UiPathServices;
import com.camundaRpa.SimpleDemo.Utils.Constants;
import com.camundaRpa.SimpleDemo.Utils.PropertiesConfig;
import com.camundaRpa.SimpleDemo.models.Authenticate;
import com.camundaRpa.SimpleDemo.models.LoginDTO;
import com.camundaRpa.SimpleDemo.models.Releases;
import com.camundaRpa.SimpleDemo.models.Robots;
import com.camundaRpa.SimpleDemo.models.RunProcessDTO;
import com.camundaRpa.SimpleDemo.models.StartJob;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UiPathServicesImpl implements UiPathServices {
	
	RestTemplate restTemplate = new RestTemplate();
	
	/**
	 * @return Authenticate
	 * @throws IOException 
	 * @throws RestClientException 
	 */
	@Override
	public Authenticate authenticate(LoginDTO loginDTO) throws RestClientException, IOException {
		System.out.println("Authenticating Credentials...");
		
		ObjectMapper Obj = new ObjectMapper(); 
		String loginDTOStr = "";
		loginDTOStr = Obj.writeValueAsString(loginDTO);
		 
		
		Authenticate authResult = restTemplate.postForObject(PropertiesConfig.getProps("uipath.uri.auth"),
				new HttpEntity<String>(loginDTOStr, setDefaultHeaders(null)), Authenticate.class);
		
		System.out.println("Authorization:"+authResult.isSuccess());
		return authResult;
	}

	/**
	 * @param authToken
	 * @param filter
	 * @return Releases
	 * @throws IOException 
	 * @throws RestClientException 
	 */
	@Override
	public Releases getReleases(String authToken, String filter) throws RestClientException, IOException {
		System.out.println("Getting Process Info..");

		ResponseEntity<String> responseReleases = restTemplate.exchange(
				builderFromUriStringWithFilter(PropertiesConfig.getProps("uipath.uri.releases"), filter).toUriString(), HttpMethod.GET,
				new HttpEntity<String>(setDefaultHeaders(authToken)), String.class);

		Releases releases = new Releases();
		releases = new ObjectMapper().readValue(responseReleases.getBody(), Releases.class);
		System.out.println("Process Info Gathered");
		
		
		return releases;
	}

	/**
	 * @param authToken
	 * @param filter
	 * @return Robots
	 * @throws IOException 
	 * @throws RestClientException 
	 */
	@Override
	public Robots getRobots(String authToken, String filter) throws RestClientException, IOException {
		System.out.println("Getting Robots Info..");
		ResponseEntity<String> responseRobots = restTemplate.exchange(
				builderFromUriStringWithFilter(PropertiesConfig.getProps("uipath.uri.robots"), filter).toUriString(), HttpMethod.GET,
				new HttpEntity<String>(setDefaultHeaders(authToken)), String.class);

		Robots robots = new Robots();
		robots = new ObjectMapper().readValue(responseRobots.getBody(), Robots.class);
		System.out.println("Robots Info Gathered");
		
		return robots;
	}

	/**
	 * @param businessKey
	 * @param messageName
	 * @return StartJob
	 * @throws IOException 
	 */
	@Override
	public StartJob startJob(RunProcessDTO runProcessDTO) throws IOException {
		System.out.println("Executing JOB..");
		
		final String startJobUri = PropertiesConfig.getProps("uipath.uri.startJob");
		
		String authToken = authenticate(runProcessDTO.getLoginCredential()).getResult();
		Releases releases = getReleases(authToken, PropertiesConfig.getProps("uipath.filter.ProcessByName"));
		Robots robots = getRobots(authToken, PropertiesConfig.getProps("uipath.filter.RobotByName"));

		JSONObject startJobBody = new JSONObject();
		JSONObject startInfo = new JSONObject();
		startInfo.put(Constants.RELEASE_KEY, releases.getValue().get(0).getKey());
		startInfo.put(Constants.STRATEGY, Constants.STRATEGY_SPECIFIC);
		startInfo.put(Constants.ROBOT_IDS, new Long[] { robots.getValue().get(0).getId() });
		startInfo.put(Constants.JOBS_COUNT, 0);
		startInfo.put(Constants.SOURCE, Constants.SOURCE_MANUAL);
		startInfo.put(Constants.INPUT_ARGUMENTS, runProcessDTO.getInputArgument());
		startJobBody.put(Constants.START_INFO, startInfo);

		StartJob responseStartJob = restTemplate.postForObject(startJobUri,
				new HttpEntity<String>(startJobBody.toString(), setDefaultHeaders(authToken)), StartJob.class);
		
		System.out.println("JOB Started");
		return responseStartJob;
		
	}

	/**
	 * @param authToken
	 * @return HttpHeaders
	 * @throws IOException 
	 */
	private HttpHeaders setDefaultHeaders(String authToken) throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON.toString());
		headers.set(HttpHeaders.USER_AGENT, PropertiesConfig.getProps("uipath.useragent"));
		if (authToken != null) {
			headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + authToken);
		}
		return headers;
	}

	/**
	 * @param uri
	 * @param filter
	 * @return UriComponentsBuilder
	 */
	private UriComponentsBuilder builderFromUriStringWithFilter(String uri, String filter) {

		return UriComponentsBuilder.fromUriString(uri).queryParam(Constants.QUERYPARAM_KEY_FILTER, filter);

	}

}
