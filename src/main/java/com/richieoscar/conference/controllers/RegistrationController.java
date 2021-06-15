package com.richieoscar.conference.controllers;

import com.richieoscar.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String register(@ModelAttribute("registration")Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration")Registration registration){
        System.out.println("Registration: " +registration.getName());
        return "redirect:registration";
    }

}
