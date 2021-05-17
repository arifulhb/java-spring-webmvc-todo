package com.arifulhaque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    // http://localhost:8080/todo-mvc/welcome
    @GetMapping("welcome")
    public String welcome() {
        return  "welcome";
    }
}
