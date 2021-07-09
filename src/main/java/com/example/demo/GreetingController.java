package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController     //@RestController marks the class as a controller where every method returns a domain object instead of a view. It is shorthand for both @Controller and @ResponseBody
public class GreetingController {
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")        //@GetMapping annotation ensures HTTP GET requests to /greeting are mapped to greeting() method
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {       //@RequestParam binds the value of query string parameter name into the name parameter of the greeting() method
            return new Greeting(counter.incrementAndGet(), String.format(template, name));      // create and return a new Greeting object with id and content created from counter and template
    }
}

/* The Greeting object is converted to JSON through Jackson 2
*/