package com.company;
import java.util.Scanner;
public class foverriding{
    public void hassan(){
        int a=10;
        int b=30;
        int sum=a+b;
        System.out.println(sum);
    }

    static class  childover extends foverriding {
        public void hassan() {
            int c = 20;
            int d = 20;
            int mul = c * d;
            System.out.println(mul);

        }
    }

    public static void main(String[] args) {

     childover obj=new childover();
     obj.hassan();
     obj.hassan();


    }
}
