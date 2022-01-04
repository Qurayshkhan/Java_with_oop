package com.company;
import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        int temp;
        Scanner sc=new Scanner(System.in);
        int[] str=new int[5];
        System.out.println("Enter Number");
        for (int i=0;i<str.length;i++){
            str[i]=sc.nextInt();
        }
        for (int j=0;j<str.length;j++){
            System.out.println("Your Value is :"+ str[j]);

        }
        for (int k=0;k<str.length;k++){
            for (int j=k;j>0;j--){
                temp=str[k];
                str[k]=str[k-1];
                str[k-1]=temp;
            }
        }

    }
}
