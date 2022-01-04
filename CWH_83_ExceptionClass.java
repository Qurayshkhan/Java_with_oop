//package com.company;
//
//import java.util.Scanner;
//
//class MyException extends Exception {
//    @Override
//    public String toString() {
//        return super.toString()+"This is My  message";
//    }
//
//    @Override
//    public String getmessage() {
//        return super.getmessage();
//    }
//}
//public class CWH_83_ExceptionClass {
//    public static void main(String[] args) {
//int a;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number");
//        a=sc.nextInt();
//        if (a<9){
//            try{
//                throw new MyException();
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                System.out.println(e);
//            }
//        }
//    }
//}
