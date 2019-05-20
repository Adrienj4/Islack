package com.islack.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController implements ErrorController {

    private static final String path = "/error";

    @RequestMapping(value = path)
    public String error() {
        return "Error 404";
    }

    @RequestMapping("/index")
    String home() {
        return "index";
    }

    @Override
    public String getErrorPath() {
        return path;
    }
}
