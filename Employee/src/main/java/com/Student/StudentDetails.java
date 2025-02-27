package com.Student;
// Using Constructor Injection
public class StudentDetails {
    private int rollno;
    private String name ;
    private String university;
    private String address;
    private String mobile ;

    public StudentDetails(int rollno, String name, String university, String address, String mobile) {
        this.rollno = rollno;
        this.name = name;
        this.university = university;
        this.address = address;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student Details are:  {" +
                "rollno =" + rollno +
                ", name ='" + name + '\'' +
                ", university ='" + university + '\'' +
                ", address ='" + address + '\'' +
                ", mobile =" + mobile +
                '}';
    }


}
