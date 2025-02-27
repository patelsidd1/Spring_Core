package com.BeanLife;

public class School {
    private String name ;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting value ");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School  {" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void init(){
        System.out.println("This is init method : ");
    }
    public void destroy(){
        System.out.println("This  is destroy method : ");
    }
}
