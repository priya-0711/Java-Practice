package com.practice.Inheritance;

 class Actor	{
    public void act(){
        System.out.println("Act");
    };
}

 class Hero	extends Actor	{
    public void fight(){
        System.out.println("fight");
    };
}

 class Comedian	extends Actor	{
    public void performComedy(){
        System.out.println("Comedy");
    };
     public void act(){
         System.out.println("Act with overriding");
     };
}
public class Example1 {
    public static void main(String[] args) {
        Actor	actor1 =	new Comedian();
        actor1.act();
        Actor	actor2 =	new Hero();
        Actor	actor3 =	new Actor();
    }
}
