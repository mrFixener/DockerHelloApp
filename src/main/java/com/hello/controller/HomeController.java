package com.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dimon on 03.07.2018.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "<center><h2>HelloApp</h2></center>";
    }
}
