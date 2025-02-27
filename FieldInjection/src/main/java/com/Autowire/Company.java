package com.Autowire;

public class Company {
    private String com_name;
    private Employee employee;
    private String team;

    public Company(String com_name, Employee employee, String team) {
        this.com_name = com_name;
        this.employee = employee;
        this.team = team;
    }

    @Override
    public String toString() {
        return "Company {" +
                "com_name = '" + com_name + '\'' +
                ", employee = '" + employee +
                ", team = '" + team + '\'' +
                '}';
    }
}
