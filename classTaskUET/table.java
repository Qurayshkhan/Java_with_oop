package com.company;

import java.util.Scanner;

public class table {

    public static void main(String[] args) {

        char operator;
        int number1;


        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers

        switch (operator) {


            case '+':
                int result = 0;
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Enter number");
                    number1 = input.nextInt();
                    result = result + number1;
                    System.out.println( result);
                }
                break;
            case '-':
                 result = 0;
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Enter number");
                    number1 = input.nextInt();
                    result = result - number1;
                    result=result*-1;
                    System.out.println( result);
                }
                break;
        }
    }
}



