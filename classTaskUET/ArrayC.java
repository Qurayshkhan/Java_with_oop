package com.company.classTaskUET;

import java.util.Scanner;

public class ArrayC {
    Scanner sc = new Scanner(System.in);
    ArrayC(int n){
        System.out.println("Enter Max Value For Array 1");
        int a=sc.nextInt();
        int arr[] = new int[a];
        int i;
        System.out.println("Enter The Values of Array 1");
        for (i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter Max Value For Array 2");
        int b=sc.nextInt();
        int arr1[] = new int[b];
        int j;
        System.out.println("Enter The Values of Array 2");
        for (j=0;j<b;j++){
            arr1[j]=sc.nextInt();
        }

        System.out.println("Check");
        for (int k=0;k< arr.length;k++){
            for (int m=0;m< arr1.length;m++){
                if (arr[k]==arr1[m]){
                    System.out.println(arr[k]+" Duplicate");
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayC obj = new ArrayC(1);

    }
}