package br.edu.ifpb.pos.facebook;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import br.edu.fvs.component.facebook.Configuration;
import br.edu.fvs.component.facebook.FacebookService;
import br.edu.fvs.component.facebook.FacebookServiceImpl;


public class FacebookServiceImplTest {

	@Test
	public void test() throws IOException {
		String token = "CAACEdEose0cBAHHHGlQVQjAZArN20l8sEUnwjglUCgycRnyucYR99CSBFgLyKICjN8KuYKBbaOqSrQZA8ZCvNIiXIRzrS8lBZBPpsu730ZAdjxUl1hSrkVxBvfzZC0dZCCDMaDfOBbFQ5Wan54BA0ZAyZBn03AsjcwZCBwjQh3jjD8TOWgNAsZClQo2cMlZAZCAvmz98xz5IEaQv8lOhbCqNzEEIO";
		//
		Configuration configuration = new Configuration();
		configuration.setToken(token);
		//este é o serviço que irão utilizar
		FacebookService service = new FacebookServiceImpl(configuration);
		assertNotNull(
				service.createFeed(
						"Feed tested by IFPBFacebookService."
				)
		);
	}

}
