package com.EmployeeCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private int id;
    private String name ;
    private List<String> skills;
    private Set <String> mobile;
    private Map<Integer, String> address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Set<String> getMobile() {
        return mobile;
    }

    public void setMobile(Set<String> mobile) {
        this.mobile = mobile;
    }

    public Map<Integer, String> getAddress() {
        return address;
    }

    public void setAddress(Map<Integer, String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }
}
