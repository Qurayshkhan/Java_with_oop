package com.company.classTaskUET;
import java.util.Scanner;
public class AvgSumConstructor {
    AvgSumConstructor(){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Array numbers");
        int a[]=new int[5];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
             sum=sum+a[i];
        }
        System.out.println(sum);
        float avg=(float) sum/a.length;
        System.out.println(avg);
   if (Math.round(avg)%2==0){
       System.out.println("It is even number");
   }else {
       System.out.println("It is odd number");
   }
    }

    public static void main(String[] args) {
        AvgSumConstructor obj=new AvgSumConstructor();
    }

}
