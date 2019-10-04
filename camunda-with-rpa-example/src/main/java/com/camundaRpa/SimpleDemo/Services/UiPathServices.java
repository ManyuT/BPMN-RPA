package com.camundaRpa.SimpleDemo.Services;

import java.io.IOException;

import org.springframework.web.client.RestClientException;

import com.camundaRpa.SimpleDemo.models.Authenticate;
import com.camundaRpa.SimpleDemo.models.LoginDTO;
import com.camundaRpa.SimpleDemo.models.Releases;
import com.camundaRpa.SimpleDemo.models.Robots;
import com.camundaRpa.SimpleDemo.models.RunProcessDTO;
import com.camundaRpa.SimpleDemo.models.StartJob;

public interface UiPathServices {
	
	public Authenticate authenticate(LoginDTO loginDTO) throws RestClientException, IOException;

	public Releases getReleases(String authToken, String filter) throws RestClientException, IOException;
	
	public Robots getRobots(String authToken, String filter) throws RestClientException, IOException;
	
	public StartJob startJob(RunProcessDTO runProcessDTO) throws IOException;
}
