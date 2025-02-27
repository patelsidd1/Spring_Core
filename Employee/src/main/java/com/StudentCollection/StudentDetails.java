package com.StudentCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDetails {
    private  int rollno;
    private String name ;
    private List<String > subjects;
    private Set<String> skills;
    private Map <Integer , String> address;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    public Map<Integer, String> getAddress() {
        return address;
    }

    public void setAddress(Map<Integer, String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDetails {" +
                "rollno =" + rollno +
                ", name ='" + name + '\'' +
                ", subjects =" + subjects +
                ", skills =" + skills +
                ", address =" + address +
                '}';
    }

    public StudentDetails(int rollno, String name, List<String> subjects, Set<String> skills, Map<Integer, String> address) {
        this.rollno = rollno;
        this.name = name;
        this.subjects = subjects;
        this.skills = skills;
        this.address = address;
    }
}
