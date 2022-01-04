package com.company.classTaskUET;

import java.util.Arrays;

public class AddElementInArray {
    public static void main(String[] args) {
        int arr[]={5,10,15,20,25};
        int n=arr.length;
        int newArr[]=new int [n+1];
        int value=5;
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<n;i++){
            newArr[n]=value;
            System.out.println(Arrays.toString((newArr)));
        }

    }
}
