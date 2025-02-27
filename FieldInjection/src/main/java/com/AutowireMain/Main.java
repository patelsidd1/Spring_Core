package com.AutowireMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowireMain.xml");

        Employee emp = (Employee) context.getBean(Employee.class);
        System.out.println(emp);
    }
}
