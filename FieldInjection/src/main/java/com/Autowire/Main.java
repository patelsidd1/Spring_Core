package com.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new  ClassPathXmlApplicationContext("configAutowire.xml");

        Employee em  =(Employee) context.getBean("emp");
        System.out.println(em);

        Company com  = (Company) context.getBean("com");
        System.out.println(com);

    }
}
