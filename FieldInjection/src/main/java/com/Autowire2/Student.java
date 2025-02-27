package com.Autowire2;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String name;
    private int rollno;
//    @Autowired
    private Address address;
//    @Autowired
    private Subjects subjects;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void display(){
        System.out.println("Name "+ name);
        System.out.println("Rollno "+rollno);
        System.out.println(address);
        System.out.println( subjects);

    }




}
