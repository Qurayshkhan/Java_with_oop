package com.company;

public class sum{
    public void leap()
    {
        int year=2020;
        if (year%4==0){
            System.out.println("It is a leap Year");
        }else {
            System.out.println("It is not a leap Year");
        }
    }


    public void num(int a)
    {
        if (a%2==4){
            System.out.println("It is a even Number");
        }else {
            System.out.println("It is odd number");
        }
    }
    public static void sum(String[] args) {

        sum obj=new sum();
        obj.leap();
        obj.num(5);


    }
}