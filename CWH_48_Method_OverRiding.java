package com.company;
class A{
    public int Hassan(){
        return 4;
    }
    public void mth2(){
        System.out.println("I am method 2 of Class A");
    }
}
class B extends A{
    public void mth2(){
        System.out.println(" i am  Method 2 of class B ");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class CWH_48_Method_OverRiding {
    public static void main(String[] args) {
A a=new A();
a.mth2();

B b=new B();
b.mth2();
    }
}
