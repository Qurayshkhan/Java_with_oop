//package com.company;
//class mynewThr1 extends Thread{
//    public void run(){
//        int i=0;
//        System.out.println("Thank You");
//
//        while (i<35){
//            System.out.println("I am a thread"+this.getName());
//        }
//        i++;
//    }
//}
//class mynewThr2 extends Thread{
//    public void run(){
//        int i=0;
//        System.out.println("Thank You");
//
//        while (i<35){
//            System.out.println("I am a thread 2 "+this.getName());
//        }
//        i++;
//    }
//}
//public class CWH_75_Thread_Method {
//    public static void main(String[] args) {
//mynewThr1 t1=new mynewThr1();
//mynewThr1 t2=new mynewThr1();
//t1.start();
//try{
//t1.join();
//}
//catch (Exception e){
//    System.out.println(e);
//}
//t2.start();
//    }
//}
