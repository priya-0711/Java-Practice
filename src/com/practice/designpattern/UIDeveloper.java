package com.practice.designpattern;

public class UIDeveloper implements Developer{
    @Override
    public String skillSet(String skill) {
        return skill;
    }

    @Override
    public Integer calcSalary() {
        return 115000;
    }
}
