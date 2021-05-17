package com.arifulhaque.controller;

import com.arifulhaque.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class WelcomeController {

    // == fields ==
    private final IService iService;

    // == constructors ==
    @Autowired
    public WelcomeController(IService iService) {
        this.iService =  iService;
    }

    // == request methods ==
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    // http://localhost:8080/todo-mvc/welcome
    // http://localhost:8080/todo-mvc/welcome?user=arif
    // http://localhost:8080/todo-mvc/welcome?user=arif&age=37
    @GetMapping("welcome")
    public String welcome(
            @RequestParam String user,
            @RequestParam int age,
            Model model
    ) {

        model.addAttribute("helloMessage", iService.getHelloMessage(user));
        model.addAttribute("age", age);

        log.info("model= {}", model);

        return  "welcome";
    }

    // == model attributes ==
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("WelcomeMessage() called");

        return iService.getWelcomeMessage();
    }
}
