package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
/* @SpringBootApplication is a convenience annotation that includes the following:
@Configuration: tags the class as a source of bean definitions for the application context
@EnableAutoConfiguration: Tells Spring Boot to add beans based on classpath settings, other beans, and property settings
@ComponentScan: tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers
*/
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);		// launches application
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}