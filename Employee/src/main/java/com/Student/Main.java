package com.Student;
// By using Constructor Injection
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configStudent.xml");
        StudentDetails stu  = (StudentDetails) context.getBean("student");

        System.out.println(stu);
    }
}
