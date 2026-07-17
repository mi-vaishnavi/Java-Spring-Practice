package org.vaishu;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj = (Dev)context.getBean("dev");
        obj.view();
        Laptop lap = context.getBean(Laptop.class);
        lap.compile();
    }
}
