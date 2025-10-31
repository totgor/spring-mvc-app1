package com.totgor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.annotation.PostConstruct;

@Controller
public class HelloController {
    
    @PostConstruct
    public void init() {
        System.out.println(" === HelloController initialized === ");
    }

    @GetMapping("/")
    public String home() {
        System.out.println(" === Home page requested === ");
        return "hello_world";
    }
    

    @GetMapping("/hello-world")
    public String sayHello() {
        System.out.println(" === Hello page requested === ");
        return "hello_world";
    }
}
