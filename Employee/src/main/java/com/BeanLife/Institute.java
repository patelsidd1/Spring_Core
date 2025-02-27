package com.BeanLife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Institute {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("Starting method..");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("This is destroy.. ");
    }
}
