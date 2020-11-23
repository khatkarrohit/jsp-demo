package com.example.jspdemo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

    @GetMapping("/")
    public String jspDefault() {
        return "index";
    }

    @GetMapping("/data")
    public String jspData() {
        return "data";
    }
}
