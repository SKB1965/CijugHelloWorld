package com.cijug;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String helloWorld() {
        return "Hello and Welcome to DMACC Discovery IT Day!";
    }

}
