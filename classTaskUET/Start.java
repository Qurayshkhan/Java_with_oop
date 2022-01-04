package com.company;
import java.util.Scanner;
public class Start {

    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     int a,b,c,d,e;
     System.out.println("Enter First Number");
     a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        b=sc.nextInt();
        c=a+b;
        System.out.println(c);
    }
}