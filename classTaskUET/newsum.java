package com.company;
import java.util.Scanner;
public class newsum {

    public static void main(String[] args){
        int a;
        int b;
        int sum;
        Scanner inputNumScanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
         a= inputNumScanner.nextInt();
        System.out.println("Enter 2nd number");
        b=inputNumScanner.nextInt();
        sum=a+b;
        System.out.println("The sum of given numbers is "+sum);
        if (sum%2==0 ){
            System.out.println("it is even number");
        }else {
            System.out.println("It is odd numbers");
        }
    }


}