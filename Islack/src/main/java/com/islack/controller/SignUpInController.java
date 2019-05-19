package com.islack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpInController {

    @GetMapping(value = {"/", "/index"})
    public String signUpIn (Model model) {
        model.addAttribute("signUpIn", new SignUpIn());
        return "signUpIn";
    }
}
