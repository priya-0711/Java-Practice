package com.practice.designpattern;

public class JavaDeveloper implements Developer{
    @Override
    public String skillSet(String skill) {
        return skill;
    }

    @Override
    public Integer calcSalary() {
        return 250000;
    }
}
