package com.company;

public class CWH_35_PS7__on_Methods {
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.printf("%d * %d= %d\n ", n,i,n*i);
        }
    }
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumReact(int n){
        if (n==1){
            return 1;
        }
        return n+sumReact(n-1);
    }
    static int fib(int n){
        if (n==1){
            return 0;
        }else if (n==2){
return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
   static void pattren_rec(int n){
        if (n>0){
            pattren_rec(n-1);
            for (int i=0;i<n;i++){
                System.out.print    ("*");
            }
            System.out.println();
        }
   }
    public static void main(String[] args) {
//Q 1
        //multiplication(7);
//Q 2
//pattern1(5);
//Q 3
//        int c=sumReact(5);
//        System.out.println(c);
//
        //Q 5
//int result=fib(7);
//        System.out.println(result);
    //Q 8
        pattren_rec(5);
    }
}
