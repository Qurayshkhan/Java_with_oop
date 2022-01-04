package com.company;
abstract class Parent2{
    public Parent2(){
        System.out.println("I am base2 of constructor");
    }
    public void sayHellow(){

        System.out.println("hellow wolrd");
    }
    abstract public void greet();
    abstract public void greet2();

}

class pChild extends Parent2{
    @Override
    public void greet(){
        System.out.println(" Good Morning ");
    }

    @Override
    public void greet2() {
        System.out.println("Good AfterNoon");
    }
}
abstract class newchild extends Parent2{
    public void th(){
        System.out.println("I am Good");
    }
}


public class CWH_53_AbstractClass_Methods {
    public static void main(String[] args) {
//Parent2 p=new Parent2(); Abstract class
pChild c=new pChild();
c.greet();

    }
}
