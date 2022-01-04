package com.company;
import java.util.Scanner;
public class CWH_11_ps1_soloution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Physics Marks");
        int s1= sc.nextInt();
        System.out.println("Enter Your Math Marks");
        int s2= sc.nextInt();
        System.out.println("Enter Your Chemistery Marks");
        int s3= sc.nextInt();
        System.out.println("Enter Your Computer Marks");
        int s4= sc.nextInt();
        System.out.println("Enter Your English Marks");
        int s5= sc.nextInt();
        float percent=((s1+s2+s3+s4+s5)/500.0f)*100;
        System.out.println("The percentage of Total marks is :"+ percent );
    }
}
