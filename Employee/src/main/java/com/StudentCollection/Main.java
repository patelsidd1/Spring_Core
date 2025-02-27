package com.StudentCollection;
// By Using Constructor  Injection
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// By using Constructor Method
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configCollectionStudent.xml");
        StudentDetails student = (StudentDetails) context.getBean("student");
        System.out.println(student);
    }
}
