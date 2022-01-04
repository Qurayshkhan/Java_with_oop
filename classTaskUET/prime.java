package com.company;
import java.util.Scanner;
class prime{
    public static void main(String[] args) {

        int num = 4;
        boolean pm = false;
        int i=2;
        while ( i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                pm = true;
                break;
            }
        ++i;
        }

        if (!pm)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}