package com.company.classTaskUET;
import java.util.Scanner;
public class User_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your String");
        String str=sc.nextLine();
        System.out.println(str);
        int length=str.length();
        int middle=length/2;
        System.out.println(middle);
        System.out.println(str.charAt(middle));
    }
}
