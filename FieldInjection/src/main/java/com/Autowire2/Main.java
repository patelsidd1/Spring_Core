package com.Autowire2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Student std = context.getBean(Student.class);
        std.display();


    }
}
