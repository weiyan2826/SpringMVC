package com.spw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        //视图名字，会被视图解析器处理
        model.addAttribute("msg","Hello,SpringMVCAnotation!");
        return "hello";
    }

}
