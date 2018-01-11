package com.zz.teaching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeachingController {
    @RequestMapping(value = "/hello")
    public String say(){
        return "zz/login";
    }
}
