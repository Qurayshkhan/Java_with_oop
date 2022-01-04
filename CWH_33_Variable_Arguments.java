package com.company;

public class CWH_33_Variable_Arguments {
    //no Need to increase paramete like sum(a,b,c,d,e,f);
    //Use This Way
//    static int sum(int ...arr){
   // if You want must be pass atleats one argument the use this way
    static int sum(int x,int ...arr){
        int result=x;
        for (int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varags Toturial");
        System.out.println("The sum of 4,5 is "+sum(4,5));
        System.out.println("The sum of 4,5,6 is "+sum(4,5,6));
        System.out.println("The sum of 4,5,7,8is "+sum(4,5,7,8));
        System.out.println("The sum of 4,5,9,10,11 is "+sum(4,5,9,10,11));
        System.out.println("The sum of 4,5,12,13,14,15 is "+sum(4,5,12,13,14,15));
    }
}
