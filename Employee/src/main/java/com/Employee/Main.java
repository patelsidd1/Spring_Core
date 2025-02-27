package com.Employee;
// Using Setter Injection
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("config.xml");
        EmployeeDetails emp = (EmployeeDetails) context.getBean("emp");
        System.out.println("The details are : ");
        System.out.println(emp);

    }
}
