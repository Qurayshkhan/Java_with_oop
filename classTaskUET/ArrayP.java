package com.company.classTaskUET;

import java.util.Scanner;

public class ArrayP {
    Scanner sc = new Scanner(System.in);
    public void arrayp(){
        System.out.println("Enter Max Value For Number");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter The Values of Array");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Display Array");
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Find Number!");
        int a= sc.nextInt();
        for (int j=0;j< arr.length;j++) {
            if (a == arr[j]) {
                System.out.println(arr[j] + " Is Your Number");
            }
        }
    }
    public static void main(String[] args) {
        ArrayP obj = new ArrayP();
        ArrayP obj1 = new chil();
        obj.arrayp();
        obj1.arrayp();

    }
}

class chil extends ArrayP{
    public void arrayp(){
        System.out.println("Enter Max Value For String");
        int n=sc.nextInt();
        String arr1[] = new String[n];
        int i;
        System.out.println("Enter The Values of Array");
        for (i=0;i<n;i++){
            arr1[i]=sc.next();
        }
        System.out.println("Display Array");
        for (i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Find String!");
        String a= sc.next();
        for (int j=0;j< arr1.length;j++) {
            if (a.equals(arr1[j])) {
                System.out.println(arr1[j] + " Is Your String");
            }
        }
    }
}
