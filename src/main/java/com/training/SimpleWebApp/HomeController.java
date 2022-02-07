package com.training.SimpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/test")
    @ResponseBody
    public String home(){
        return "Basic web application using spring boot in IntelliJ !";
    }
}
