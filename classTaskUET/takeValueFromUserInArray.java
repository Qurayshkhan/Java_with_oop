package com.company.classTaskUET;
import java.util.Scanner;
public class takeValueFromUserInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How many Number You want to in Array");
        int e=sc.nextInt();
        int array[]=new int[e];
        System.out.println("Enter  value");
        for (int a=0;a<e;a++){
            array[a]= sc.nextInt();
        }
        System.out.println("Your Enter value are");
        for (int a=0;a<e;a++)
        {
            System.out.println(array[a]);
        }
    }
}
