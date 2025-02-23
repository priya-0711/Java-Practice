package com.practice.designpattern;

public class DotNetDeveloper implements Developer{
    @Override
    public String skillSet(String skill) {
        return skill;
    }

    @Override
    public Integer calcSalary() {
        return 150000;
    }
}
