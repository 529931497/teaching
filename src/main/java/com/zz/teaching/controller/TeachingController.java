package com.zz.teaching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TeachingController {
    @RequestMapping(value = "/index")
    public String say(){
        return "zz/login";
    }

    /**
     * 管理员登录验证
     * @zz
     */
    @RequestMapping(value = "/login")
    public String login(String name, String pass, String guy){
        if(guy.equals("admin")){
            if(name.equals("admin") && pass.equals("123")){
                return "zz/main";
            }
        }
        System.out.println(name + pass);
        return "null";
        
    }


}
