package com.hrq.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    {
        System.out.println("代码快");
    }
    static {
        System.out.println("静态代码块");
    }
    @GetMapping("/test")
    @ResponseBody
    public Object getWords(){
        return "aaa";
    }
    public HelloController(){
        System.out.println("构造");
    }
    public static void main(String[] args) {
        HelloController helloController = new HelloController();
    }
}
