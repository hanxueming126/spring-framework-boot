package org.springframework.boot;

import org.springframework.context.ConfigurableApplicationContext;

@SpringBootConfiguration
public class SpringTest {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication();
		app.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context = app.run(SpringTest.class);
		context.getEnvironment().getProperty("foo");

	}
}
