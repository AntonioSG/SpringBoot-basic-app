package com.course.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {

    @RequestMapping("/")
    public String home(){
        return "Das boot, repository for duty";
    }

}
