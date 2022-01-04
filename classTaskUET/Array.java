package com.company.classTaskUET;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int arr[]={10,10,11,12};
        System.out.println(arr[2]);
        String arr2[]={"Hassan is a Goodboy"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number to find index");
        String  str=sc.nextLine();
        char b=str.charAt(Integer.parseInt(str));
        char b1 = b;
        System.out.println((char)b);
    }
}
