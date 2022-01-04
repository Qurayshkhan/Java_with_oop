
package com.company.classTaskUET;
import java.io.*;
import java.util.*;
class GFG{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter Max Value");
        int n=sc.nextInt();
        String arr[] = new String[n];
        int i;
        System.out.println("Enter The Values of Array In String");
        for (i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println("Display Array");
        for (i=0;i<n;i++){
            //System.out.println(arr[i]);
            for (int j=i+1;j< arr.length;j++){
//                int tmp=0;
//                if (arr[i]>arr[j]){
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
                if (arr[i].equals(arr[j])){
                    System.out.println(arr[i]+" Is Duplicate");
                }
            }
        }
    }
    }
