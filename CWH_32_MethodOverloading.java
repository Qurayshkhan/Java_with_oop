package com.company;

public class CWH_32_MethodOverloading {
    static void tellJoke(){
        System.out.println("Hy Dude How are You???");
    }
    static void change(int a){
         a=95;
    }
    static void change2(int[]arr){
        arr[0]=98;
    }
    static void foo(){
        System.out.println("Good Morning"+"Bro");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+ "Bro");
    }
    public static void main(String[] args) {
           // tellJoke();
//        int [] marks={10,20,30,40,50,60};
//        change2(marks);
//        //int x=45;
//      //  change(x);
//       // System.out.println("The value of x after chnage is:"+x);
//        System.out.println( "The value of marks after change is "+marks[0]);

    foo();
    foo(10);
    }

}
