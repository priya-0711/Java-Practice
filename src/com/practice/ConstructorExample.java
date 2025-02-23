package com.practice;

class SuperClass	{
};
class SubClass	extends SuperClass	{
};
interface Interface	{
};
class SuperClassImplementingInteface	implements Interface	{
};
class SubClass2	extends SuperClassImplementingInteface	{
};
class SomeOtherClass	{
};

public class ConstructorExample {
    public static void main(String[]	args){
        SubClass	subClass	=	new SubClass();
        Object	subClassObj	=	new SubClass();
        SubClass2	subClass2	=	new SubClass2();
        SomeOtherClass	someOtherClass =	new SomeOtherClass();
        System.out.println(subClass	instanceof SubClass);//true
        System.out.println(subClass	instanceof SuperClass);//true
        System.out.println(subClassObj	instanceof SuperClass);//true
        System.out.println(subClass2
                instanceof SuperClassImplementingInteface);//true
    }
}





