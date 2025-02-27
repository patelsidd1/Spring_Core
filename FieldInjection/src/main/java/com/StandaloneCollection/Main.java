package com.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("standalone.xml");
        Person person  =(Person) context.getBean("coll");
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println("_________________________________________");
        System.out.println(person.getFees());
        System.out.println(person.getFees().getClass().getName());
        System.out.println("_________________________________________");
        System.out.println(person.getProps());



    }
}
