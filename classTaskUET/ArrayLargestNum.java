package com.company.classTaskUET;

import java.util.Scanner;

public class ArrayLargestNum {
    public static void main(String[] args) {
        int arr1[]={1,10,30,150};
        int arr2[]={50,40,30,100};
        int len1=arr1.length;
        int len2=arr2.length;
        int max1=arr1[0];
        for(int i=0;i<len1;i++){
            if(arr1[i]>max1){
                max1=arr1[i];
            }

        }
        int max2=arr2[0];
        for(int j=0;j<len2;j++){
            if(arr2[j]>max2){
                max2=arr2[j];
            }

        }
        if(max1>max2){
            System.out.print("max element is:"+max1);
        }
        else{
            System.out.print("Max element is: "+max2);
        }


        }

    }

