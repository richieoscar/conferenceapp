package com.richieoscar.conference.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String, Object> model){
        model.put("message", "Greetings Oscar");
        return "greeting";
    }

    @GetMapping("thyme")
    //TODO deploy to test branch
    //remove thymeleaf
    //testing new branch
    public String thyme(Map<String, Object> model){
        model.put("message", "Hello thymeleaf");
        return "thyme";
    }
}
