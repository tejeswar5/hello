package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

}
