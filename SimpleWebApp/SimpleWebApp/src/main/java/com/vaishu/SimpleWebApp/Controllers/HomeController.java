package com.vaishu.SimpleWebApp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to java Spring boot";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is education site";
    }
}
