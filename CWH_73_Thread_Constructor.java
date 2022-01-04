package com.company;
class Thr extends Thread{
    public Thr(String name){
super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank You");
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}
public class CWH_73_Thread_Constructor {
    public static void main(String[] args) {
Thr t=new Thr("Hassan");
Thr t2=new Thr("Husnain");
t.start();
t2.start();
        System.out.println("the id of this thread is "+t.getId());
        System.out.println("the name of this thread is "+t.getName());    System.out.println("the id of this thread is "+t2.getId());
        System.out.println("the name of this thread is "+t2.getName());

    }
}
