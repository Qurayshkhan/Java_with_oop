package com.company;
import java.util.Scanner;
public class CWH_13_Strings {
    public static void main(String[] args) {
      //  String name=new String("Hassan"); remind String is class and also use as permivite datatype
//      String name="Hassan";
//        System.out.println(name);
        int a=6;
        float b=5.6777f;
//        System.out.println("The name is "+ name);
//        System.out.print(name);
        System.out.printf("the value of a is %d and value of b is %8.2f",a,b);
//        System.out.format("the value of a is %d and value of b is %f",a,b);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your string");
//        String st=sc.next();
        String st=sc.nextLine();
        System.out.println(st);

    }

}
