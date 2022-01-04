package com.company;
class Mythread extends thread{
    public void run(){
        System.out.println("My thread is Running");
    }
}
class thread{
    void sum(){
        int a=5;
        int b=3;
        int sum=a+b;
        System.out.println(sum);
    }
}

public class CWH_70_threading {
    public static void main(String[] args) {
        //must watch video
        Mythread th=new Mythread();
        th.run();
        th.sum();
    }
}
