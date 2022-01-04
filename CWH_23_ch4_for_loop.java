package com.company;
import java.util.Scanner;
public class CWH_23_ch4_for_loop {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("Odd Number");
        int n=5;
        for (int i=0;i<n;i++){
            System.out.println(2*i+1);
        }
        System.out.println("Even Numbers");
        int even=10;
        for (int i=0;i<=even;i+=2){
            System.out.println(i);
        }
        System.out.println("Reverse Counting");
        for (int i=7;i!=0;i--){
            System.out.println(i);
        }
    }
}
