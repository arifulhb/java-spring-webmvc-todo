package com.arifulhaque.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class WelcomeController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    // http://localhost:8080/todo-mvc/welcome
    @GetMapping("welcome")
    public String welcome(Model model) {

        model.addAttribute("user", "Arif");
        log.info("model= {}", model);

        return  "welcome";
    }

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("WelcomeMessage() called");

        return "Welcome to this demo application";
    }
}
