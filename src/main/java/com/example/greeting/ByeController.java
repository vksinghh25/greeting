package com.example.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

    @GetMapping("/bye")
    public String bye() {
        return "Bye!";
    }

    @GetMapping("/adios")
    public String adios() {
        return "Adios!";
    }
}
