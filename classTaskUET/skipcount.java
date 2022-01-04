package com.company;
import java.util.Scanner;
class skipcount{
    skipcount(){
        Scanner sc=new Scanner(System.in);
        int skipnum;

        System.out.println("Enter counting");

        skipnum=sc.nextInt();
        int a;
        System.out.println("Enter skip number");
        a=sc.nextInt();

        for (int i=0;i<=skipnum;i++){
            if (i==a){
                continue;
            }
            System.out.println("The skip number is "+ i );
        }
    }
    public static void main(String[] args){
        skipcount obj=new skipcount();

    }
}