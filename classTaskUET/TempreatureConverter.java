package com.company.classTaskUET;
import java.util.Scanner;
public class TempreatureConverter {
     TempreatureConverter(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Tempreature");
        float CtoF= sc.nextFloat();
        CtoF=((CtoF*9)/5)+32;
         System.out.println(CtoF);
    }
    public static void main(String[] args) {
TempreatureConverter obj=new TempreatureConverter();

    }
}
