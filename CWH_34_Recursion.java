package com.company;

public class CWH_34_Recursion {
        static  int  fac(int n){

        if (n==0||n==1){
            return 1;
        }else {
            return n*fac(n-1);
        }
    }
    static int Itrerative_fac(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }


    public static void main(String[] args) {
        int x=5;
        System.out.println("The factorial of Number is " + fac(x));
        System.out.println("The factorial of Number is "+Itrerative_fac(x));
    }
}
