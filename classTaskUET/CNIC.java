package com.company.classTaskUET;
import java.util.Scanner;
public class CNIC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your age");
        int age= sc.nextInt();
        //System.out.println(age);
        if (age>=18){
            System.out.println("You are Eligble");
            System.out.println("Please Enter Your Cnic if You have\n Yes or No" );
            String check=sc.next();
            if (check.equals("yes")){
                System.out.println("Enter Your CNIC");
                int cnic=sc.nextInt();
                System.out.println("Your Cnic is "+cnic+ "And Congrulation You are Done" );
            }else {
                System.out.println("Get out from here");
            }
        }else {
            System.out.println("Not Acceptable");
        }
    }
}
