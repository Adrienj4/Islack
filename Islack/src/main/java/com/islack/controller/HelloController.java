package com.islack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value = "Isep", required = false, defaultValue = "World") String name) {
        model.addAttribute("Isep", name);
        return "hello";
    }
}
