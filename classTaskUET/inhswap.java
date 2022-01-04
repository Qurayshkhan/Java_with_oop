package com.company;
 class inhswap {
 static   class parent{
        void swap(){

            int a,b,temp;
            a=10;
            b=20;
            temp=a;
            a=b;
            b=temp;
            System.out.println("Value of a is " + a);
            System.out.println("Value of b is " + b);
        }
    }

     static class child extends parent{
             void swap(){
                System.out.println("before swaping");
                int x=10;
                int y=20;
                System.out.println("The value of x is " + x);
                System.out.println("The value of y is " + y);
                System.out.println("After swaping");
                x = x + y;
                y = x - y;
                x = x - y;
                System.out.println("the value of x is "+ x);
                System.out.println("the value of y is"+ y);
            }
    }
    public static void main(String[] args){
            child obj =new child();
            obj.swap();
    }
}