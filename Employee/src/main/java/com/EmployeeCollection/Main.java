package com.EmployeeCollection;
// By using Setter Injection
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

       ApplicationContext context = new  ClassPathXmlApplicationContext("configCollectionEmployee.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
    }
}
