package com.minhye.DemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {

		// its creates a container
		// spring has container inside JVM and they call it IOC Container
		// so Spring will try to create all the objects inthis container for all your
		// classes. dah!
		// without spring
		// build(); <- calling like this will not work
		// Dev obj = new Dev(); <- bruh! this get created in JVM container not the
		// Spring IOC one. dah!

		// we need context, so we use ApplicationContext
		ApplicationContext context = SpringApplication.run(DemoAppApplication.class, args);

		// this is how spring would do
		Dev obj = context.getBean(Dev.class);
		Hello obj2 = context.getBean(Hello.class);

		obj.build();
	}

}
