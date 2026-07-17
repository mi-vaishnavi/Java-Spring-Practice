package com.vaishu.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    Laptop lap;
    public void build(){

        lap.compile();
        lap.debug();

        System.out.println("Working on Awesome project");
    }

}
