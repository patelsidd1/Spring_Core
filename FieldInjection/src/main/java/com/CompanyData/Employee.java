package com.CompanyData;

public class Employee {
    private String name ;
    private int id;
    private String department;
    private String city ;

    public Employee(String name, int id, String department, String city) {
        super();
        this.name = name;
        this.id = id;
        this.department = department;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee {" +
                " Name = '" + name + '\'' +
                ", Id = " + id +
                ", Department = '" + department + '\'' +
                ", City = '" + city + '\'' +
                '}';
    }
}
