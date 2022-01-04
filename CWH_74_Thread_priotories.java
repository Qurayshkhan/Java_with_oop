//package com.company;
//class Thr1 extends Thread{
//    public Thr1(String name){
//        super(name);
//    }
//    public void run(){
//        int i=34;
//        System.out.println("Thank You");
//
//        while (true){
//            System.out.println("I am a thread"+this.getName());
//        }
//    }
//}
//public class CWH_74_Thread_priotories {
//    public static void main(String[] args) {
//        //Ready Queue:T1 T2 T3 T4
//        Thr1 T1 =new Thr1("Hassan");
//        Thr1 T2 =new Thr1("Hassan2");
//        Thr1 T3 =new Thr1("Hassan3");
//        Thr1 T4 =new Thr1("Hassan4");
//        Thr1 T5 =new Thr1("Hassan5 (Most Important)");
//        T5.setPriority(Thread.MAX_PRIORITY);
//        T4.setPriority(Thread.MIN_PRIORITY);
//        T1.start();
//        T2.start();
//        T3.start();
//        T4.start();
//        T5.start();
//    }
//}
