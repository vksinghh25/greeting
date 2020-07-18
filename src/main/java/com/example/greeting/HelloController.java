package com.example.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/howdy")
    public String howdy() {
        return "Howdy!";
    }
}
