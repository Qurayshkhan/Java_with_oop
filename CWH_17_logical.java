package com.company;

public class CWH_17_logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND");
        boolean a=true;
        boolean b=false;
        boolean c=true;
        if (a && b && c){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println("For Logical OR....");
        if (a || b || c){
            System.out.println("YES");
        }else {
            System.out.println("No");
        }
        System.out.println("For Logical Not");
        System.out.print("(NOT(A) is:");
        System.out.println(!a);
        System.out.print("(NOT(B) is:");
        System.out.println(!b);
    }
}
