package com.AutowireXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configXML.xml");
        Employee employee = (Employee) context.getBean(Employee.class );
        System.out.println(employee);

    }
}
