package com.company;
import java.util.Scanner;
public class CWH_82_Nested_TryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter The Array Index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this does not exist");
                    System.out.println("exception level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in Level 1");
            }
        }
        System.out.println("Thank for use this code");
    }

}
