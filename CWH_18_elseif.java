package com.company;
import java.util.Scanner;
public class CWH_18_elseif {
    public static void main(String[] args) {

//Enhanced Switch
        String var ="Adil";
        //System.out.println("Enter Your age");
        //Scanner sc=new Scanner(System.in);
        //age=sc.nextInt();
        switch (var){
            case "Hassan"->{
                System.out.println("You are going to become an adult");
                System.out.println("You are going to become an adult");
                System.out.println("You are going to become an adult");
            }


            case "Husnain"->System.out.println("You are going to Join a Job");

            case "Adil"-> System.out.println("You are Going to Get Retired");

            default-> System.out.println("Enjoy You life");
        }



//        int age;
//        System.out.println("Enter Your age");
//        Scanner sc=new Scanner(System.in);
//        age=sc.nextInt();
//        switch (age){
//            case 18:
//                System.out.println("You are going to become an adult");
//            break;
//            case 23:
//                System.out.println("You are going to Join a Job");
//            break;
//            case 60:
//                System.out.println("You are Going to Get Retired");
//                break;
//            default:
//                System.out.println("Enjoy You life");
//        }

        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your age");
        int age=sc.nextInt();
        if (age>56){
            System.out.println("You are experianced");
        }else if(age<46){
            System.out.println("You are Semi-Experianced");
        }else if(age<35){
            System.out.println("You are Semi-Semi-Experianced");
        }else {
            System.out.println("You are Not Experianced");
        }*/

    }

}
