package com.practice.designpattern;

public class FactoryDesignPattern implements FactoryInterface {
    public static void main(String[] args) {
        FactoryDesignPattern  factoryDesignPattern = new FactoryDesignPattern();
        factoryDesignPattern.getFactoryMethod("JAVA");
        factoryDesignPattern.getFactoryMethod("ui");
        factoryDesignPattern.getFactoryMethod("dotnet");
    }

    @Override
    public Developer getFactoryMethod(String skill) {
        if(skill.equalsIgnoreCase("java")){
            System.out.println(new JavaDeveloper().calcSalary());
            return new JavaDeveloper();
        } else if(skill.equalsIgnoreCase("Ui")){
            System.out.println(new UIDeveloper().calcSalary());
            return new UIDeveloper();
        } else {
            System.out.println(new DotNetDeveloper().calcSalary());
            return new DotNetDeveloper();
        }
    }
}
