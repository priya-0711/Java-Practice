package com.practice.functionalprogramming;

import java.util.List;

public class Student {
    private int sid;
    private int age;
    private String sname;
    private String gender;
    private String city;
    private int rank;
    private List<String> contacts;
    private String dept;


    public Student(int sid,  String sname,int age, String gender, String dept,String city, int rank , List<String> contacts) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.dept = dept;
        this.rank=rank;
        this.contacts = contacts;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", dept='" + dept + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }
}

