package com.company.classTaskUET;
import java.util.Scanner;
public class Array_Sum_Avrage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter Arrays number");
     int a[]=new int[5];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println(sum);
        float avg=(float) sum/a.length;
        System.out.println(avg);
    }

}
