package com.company;
import java.util.Scanner;
public class nested{

    public static void main(String[] args) {

        System.out.println("Chose Fast Food");
        int a=1;
        Scanner inputNumScanner = new Scanner(System.in);
        System.out.println("Chose Number 1 to 3");

if (a==1){
    System.out.println("Shawarma");

    if (a==1){
        System.out.println("Categories");
        System.out.println("Chees Shwarma");
        System.out.println("Chicken Shwarma");
        System.out.println("Zinger Shwarma");
    }


}
if (a==2){
    System.out.println("It is burger");
    if (a==2){
        System.out.println("Categories");
        System.out.println("Chees Burger");
        System.out.println("Chicken Burger");
        System.out.println("Zinger Burger");
        int sh;
        sh=inputNumScanner.nextInt();
        System.out.println("Chouse a number 1 to 3");
        if (sh==1){
            System.out.println("You buy Chees shwarma");
        }
        if (sh==2){
            System.out.println("You buy chicken shwarma");
        }
        if (sh==3){
            System.out.println("You buy Zinger Shwarma");
        }
    }
}
if (a==3){
    System.out.println("it is Pizza");
    if (a==3){
        System.out.println("Categories");
        System.out.println("Chees Pizza");
        System.out.println("Chicken Pizza");
        System.out.println("Royal Pizza");
    }
}




    }



}