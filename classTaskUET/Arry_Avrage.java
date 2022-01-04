package com.company.classTaskUET;
import java.util.Scanner;
public class Arry_Avrage {
    public static void main(String[] args) {
        int len;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of an array");
    len=sc.nextInt();
    int[]a=new int[len];
    int i;
    int sum=0;
        System.out.println("Enter Values");
        for (i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
for (int k=0;k<a.length;k++){
    sum=a[k]+sum;
}
        System.out.println("Sum of These num are:"+sum);
float avg=(float) sum/a.length;
        System.out.println("Avrage of Marks are :"+avg);
        for (int j=0;j<a.length;j++){
            if (a[j]>avg){
                System.out.println("Require number is:"+a[j]);
            }
        }
    }
}
