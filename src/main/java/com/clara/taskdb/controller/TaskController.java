package com.clara.taskdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    //Web page routes. Returns index.html template
    @GetMapping("/")
    public String homePage() {
        return "index.html";
    }
}
