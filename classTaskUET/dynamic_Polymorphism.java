package com.company.classTaskUET;

public class dynamic_Polymorphism {
    public void hassan(){
        System.out.println("I am From Paren class");
    }

    public static void main(String[] args) {
        dynamic_Polymorphism obj=new dynamic_Polymorphism();
        dynamic_Polymorphism obj2=new child();
        obj.hassan();
        child obj1=new child();
        obj1.hassan();
        obj1.siraj();

    }
}
class child extends dynamic_Polymorphism{
    public void siraj(){
        System.out.println("I am from child class");
        System.out.println("i am Siraj");
    }

}