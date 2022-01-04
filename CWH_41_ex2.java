package com.company;

import java.util.Random;
import java.util.Scanner;

public class CWH_41_ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 For Rock,1 For paper,2 For Scissior");
        int userinput=sc.nextInt();

        Random random=new Random();
        int computerInput=random.nextInt(3);
        if (userinput==computerInput){
            System.out.println("Draw");
        }else if (userinput==0&&computerInput==2||userinput==1&&computerInput==0||userinput==2&&computerInput==1){
            System.out.println("You win");
        }else {
            System.out.println("Computer Win");
        }
        System.out.println("computer chose "+computerInput);
    }
}
