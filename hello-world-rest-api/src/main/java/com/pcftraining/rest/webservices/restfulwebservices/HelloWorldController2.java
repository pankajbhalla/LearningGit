package com.pcftraining.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController2 {

	@GetMapping(path = "/hello-world2")
	public String helloWorld() {
		return "Hello World - V2 - Red2 ";
	}

	@GetMapping(path = "/hello-world3")
	public String helloWorld3() {
		return "Hello World - V2 - Red3 ";
	}

	@GetMapping(path = "/hello-world4")
	public String helloWorld4() {
		return "Hello World - V2 - Red4 ";
	}
	
	@GetMapping(path = "/hello-world5")
	public String helloWorld5() {
		return "Hello World - V2 - Red5 ";
	}
}
