package com.BeanLife;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configSchool.xml");
        School school = (School) context.getBean("school");

        System.out.println(school);

        // Registering shutDown Hook By using AbstractApplicationContext interface
        context.registerShutdownHook();
        System.out.println("------------------");

        University university = (University) context.getBean("university");
        System.out.println(university);

        System.out.println("--------------------");

        Institute institute = (Institute) context.getBean("institute");
        System.out.println(institute);

    }
}
