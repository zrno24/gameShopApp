package com.game.gameshopapp.rest.controllers;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController  {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "Hello " + name + ".";
    }
}
