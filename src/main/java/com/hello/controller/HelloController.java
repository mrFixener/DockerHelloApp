package com.hello.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dimon on 07.08.2018.
 */
@RestController
public class HelloController {
    @PostMapping("/hello/user")
    public String greeting(@RequestParam String lastName, @RequestParam String firstName) {
        return "hello " + lastName + " " + firstName + "!";
    }
}
