package com.company;
class MyThreadRunable implements Runnable{
public void run(){
    System.out.println("i am a thread not a threat"); System.out.println("i am a thread not a threat"); System.out.println("i am a thread not a threat"); System.out.println("i am a thread not a threat"); System.out.println("i am a thread not a threat"); System.out.println("i am a thread not a threat"); System.out.println("i am a thread not a threat"); System.out.println("i am a thread not a threat"); System.out.println("i am a thread not a threat"); System.out.println("i am a thread not a threat"); System.out.println("i am a thread not a threat");
}
}
class MyThreadRunable2 implements Runnable{
    public void run(){
        System.out.println("i am a thread 2 not a threat 2"); System.out.println("i am a thread 2 not a threat 2"); System.out.println("i am a thread 2 not a threat 2"); System.out.println("i am a thread 2 not a threat 2"); System.out.println("i am a thread 2 not a threat 2");
    }
}
public class CWH_71_runable {
    public static void main(String[] args) {
MyThreadRunable bullet1=new MyThreadRunable();
 Thread gun1=new Thread(bullet1);
MyThreadRunable2 bullet2=new MyThreadRunable2();
Thread gun2=new Thread(bullet2);
gun1.start();
gun2.start();
    }
}
