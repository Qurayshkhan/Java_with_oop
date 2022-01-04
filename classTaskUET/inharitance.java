package com.company;
import java.util.Scanner;

public class inharitance{

    public void age(){
        int age=18;
        int year;
        year=18*365;
        System.out.println("The days of in years is "+year);

    }
    static class  child extends inharitance{
        public void sec() {
            int hours;
            int result;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter hours");
            hours=sc.nextInt();
            result=hours*3600;
            System.out.println("The Sec in Hours is"+result);
        }

    }

    public static void main(String[] args) {

   child obj1 = new child();
        obj1.age();
        obj1.sec();


    }


}

