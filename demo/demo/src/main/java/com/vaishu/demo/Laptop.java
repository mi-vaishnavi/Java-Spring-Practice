package com.vaishu.demo;

import org.springframework.stereotype.Component;


@Component
public class Laptop {

    public void compile(){
        System.out.println("Compiling with 404 bugs");

    }
    public void debug(){
        System.out.println("Debugging....");
    }
}
