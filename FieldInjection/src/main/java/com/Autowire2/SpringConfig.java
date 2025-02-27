package com.Autowire2;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {
    @Bean
    public Address createAddObj(){
        Address Addr = new Address();
        Addr.setHouseNo(245);
        Addr.setCity("Delhi");
        Addr.setPincode(273325);

        return Addr;
    }
@Bean
    public Student createStudObj(){
        Student std = new Student();
        std.setName("Kishan");
        std.setRollno(23);
        std.setAddress(createAddObj());
        std.setSubjects(createSubObj());
        return std;

    }
@Bean
    public  Subjects createSubObj(){
        Subjects sub = new Subjects();
        List<String> subjects_list = new ArrayList<>();
        subjects_list.add("Java");
        subjects_list.add("C++");
        subjects_list.add("Kotlin");

        sub.setSubjects(subjects_list);
        return sub;
    }
}
