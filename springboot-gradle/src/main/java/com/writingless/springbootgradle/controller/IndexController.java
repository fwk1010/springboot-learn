package com.writingless.springbootgradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping(value = "index.html")
    public String index(){
        return "hi,spring boot by gradle";
    }

}
