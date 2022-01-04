package com.company;
import java.util.Scanner;
public class percent {


    public static void main(String[] args) {

        float Eng,mth,Isl,urdu,score,et,mt,it,ut,total;

        Scanner inputNumScanner = new Scanner(System.in);
        System.out.println("english Total Numbers");
        et=inputNumScanner.nextFloat();

        System.out.println("Enter the Marks of Eng ");
        Eng = inputNumScanner.nextInt();

        System.out.println("Math total number");
        mt=inputNumScanner.nextFloat();
        System.out.println("Enter the Marks of Math ");
        mth = inputNumScanner.nextInt();

        System.out.println("islamiyat total number");
        it=inputNumScanner.nextFloat();
        System.out.println("Enter the Marks of isl ");
        Isl = inputNumScanner.nextInt();

        System.out.println("urdu total number");
        ut=inputNumScanner.nextFloat();
        System.out.println("Enter the Marks of urdu ");
        urdu = inputNumScanner.nextInt();
        total=et+it+ut+mt;
         score=Eng+mth+Isl+urdu;

        System.out.println("Obtained Marks: " +score);
        System.out.println("Total Marks: "+total);
        System.out.println("The percentage is = " + score/total* 100);
    }
}