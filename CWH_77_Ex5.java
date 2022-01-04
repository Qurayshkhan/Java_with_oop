package com.company;
class classTask{
    classTask(){
        System.out.println("i sm from classTask");
    }
}
class ClassTask2 extends classTask{
    ClassTask2(){
        System.out.println(" I am constructor from  class2");
    }
}
public class CWH_77_Ex5 {
    public static void main(String[] args) {
ClassTask2 obj=new ClassTask2();
    }
}
