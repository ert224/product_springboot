package com.watchman.w4ps.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomService implements CommandLineRunner {
    	// The @Value annotation is used to read the environment or application property value in Java code. The syntax to read the property value is shown below −
	@Value("${spring.application.name:demoservice}") // default value demoservice 
	private String name;
    	//endpoint for returning data 
	// @RequestMapping(value = "/")
	// public String name() {
	//    return name;
	// }

    
	/*
	 Application Runner is an interface used to execute the code after the Spring Boot application started. 
	 The example given below shows how to implement the Application Runner interface on the main class file.
	 */
	// @Override
   	// public void run(ApplicationArguments arg0) throws Exception {
    //   System.out.println("Hello World from Application Runner");
   	// }

	/*
	 Command Line Runner is an interface. It is used to execute the code after the Spring Boot application started.
	The example given below shows how to implement the Command Line Runner interface on the main class file.
	 */
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Hello world from Command Line Runner");
	}


}
