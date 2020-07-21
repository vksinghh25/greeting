package com.example.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Hello World!";
    }

    @GetMapping("/howdy")
    public String howdy() {
        return "Howdy!";
    }

    @GetMapping("/koni")
    public String koni() {
        return "Konichiwa!";
    }

    @GetMapping("/ciao")
    public String ciao() {
        return "Ciao!";
    }
}
