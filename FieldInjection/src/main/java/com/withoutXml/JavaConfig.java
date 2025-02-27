package com.withoutXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.withoutXml")
public class JavaConfig {

    @Bean
    public Eat getEat(){
        Eat eat= new Eat();
        return eat;
    }

    @Bean
    public Demo getDemo() {
        Demo demo = new Demo(getEat());
        return demo;
    }



}
