package com.naren.kadiri.SimpleBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        @RequestMapping("/")
        public String index() {
            return "Greetings from Spring Boot!";
        }

    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "Greetings from Spring Boot!"+name;
    }

    }
