package br.edu.fvs.engsof.frameworks.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		FacebookWriterCustomService service = context.getBean(FacebookWriterCustomService.class);
		System.out.println(service.writeText("E vamos trabalhar!!!"));
	}

}
