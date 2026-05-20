package com.sulabh.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Demo2Application.class, args); // it return the object of type ApplicationContext.
		// StringApplicatino.run creates a container inside the JVM
		// container : it is the IOC container created by the spring  inside the JVM,
		// so that spring created teh obj for you don't need to create the object.

		// StringApplicatino.run creates the object of class that implements the ApplicationContext
		// The spring container is called ApplicationContext

		Dev obj = context.getBean(Dev.class);

		obj.build();
	}
}
