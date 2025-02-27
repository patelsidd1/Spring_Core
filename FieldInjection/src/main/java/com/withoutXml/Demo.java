package com.withoutXml;

import org.springframework.stereotype.Component;

//@Component("firstStudent")
public class Demo {

    private Eat eat;

    public Demo() {

    }

    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    public Demo(Eat eat) {
        this.eat = eat;
    }


    public void study(){
        this.eat.display();
        System.out.println("Is studying ");
    }

}
