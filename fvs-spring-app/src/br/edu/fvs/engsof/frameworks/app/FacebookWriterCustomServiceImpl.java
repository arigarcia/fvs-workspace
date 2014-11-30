package br.edu.fvs.engsof.frameworks.app;

import java.io.IOException;

import br.edu.fvs.component.facebook.FacebookService;

public class FacebookWriterCustomServiceImpl implements	FacebookWriterCustomService {
	private final FacebookService facebookService;
	
	public FacebookWriterCustomServiceImpl(FacebookService service) {
		this.facebookService = service;
	}

	@Override
	public String writeText(String text) {
		try {
			return facebookService.createFeed(text);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
