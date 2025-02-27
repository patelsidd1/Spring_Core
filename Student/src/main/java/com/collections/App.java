package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello");
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");

        Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println(emp1);
    }
}
