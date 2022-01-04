package com.company;
import java.util.Scanner;
public class ClassTest3 {
//    Object-oriented programming (OOP) is a computer programming model that organizes software design around data, or objects, rather than functions and logic. An object can be defined as a data field that has unique attributes and behavior.
//Example
    void TestSum(){
    int num1=10;
    int num2=20;
    int sum=num1+num2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ClassTest3 obj=new ClassTest3();
        obj.TestSum();
    }
}
