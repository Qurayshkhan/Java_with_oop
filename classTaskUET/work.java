//package com.company;
//import java.util.Scanner;
//
//
//
//
//public class work{
//    public void grade(){
//
//        float Eng,mth,Isl,urdu,score,et,mt,it,ut,total;
//
//        Scanner inputNumScanner = new Scanner(System.in);
//        System.out.println("english Total Numbers");
//        et=inputNumScanner.nextFloat();
//
//        System.out.println("Enter the Marks of Eng ");
//        Eng = inputNumScanner.nextInt();
//
//        System.out.println("Math total number");
//        mt=inputNumScanner.nextFloat();
//        System.out.println("Enter the Marks of Math ");
//        mth = inputNumScanner.nextInt();
//
//        System.out.println("islamiyat total number");
//        it=inputNumScanner.nextFloat();
//        System.out.println("Enter the Marks of isl ");
//        Isl = inputNumScanner.nextInt();
//
//        System.out.println("urdu total number");
//        ut=inputNumScanner.nextFloat();
//        System.out.println("Enter the Marks of urdu ");
//        urdu = inputNumScanner.nextInt();
//        total=et+it+ut+mt;
//        score=Eng+mth+Isl+urdu;
//
//        System.out.println("Obtained Marks: " +score);
//        System.out.println("Total Marks: "+total);
//        System.out.println("The percentage is = " + score/total* 100);
//    }
//    public void grade(int a){
//    int total=500;
//    int score;
//
//        Scanner inputNumScanner = new Scanner(System.in);
//        System.out.println("Enter Your marks");
//         score=inputNumScanner.nextInt();
//        switch (score){
//            case (score<total):
//
//            break;
//            case 2:
//                if (score<4){
//                    System.out.println("Your Grade is B+");
//                }
//                break;
//            case 3:
//                if (score<300){
//                    System.out.println("Your Grade B");
//                }
//                break;
//            case 4:
//                if(score<250){
//                    System.out.println("Your Grade is C");
//                }
//                break;
//            case 5:
//                if (score<200){
//                    System.out.println("Your Grade is F");
//                }
//                break;
//            default:
//                System.out.println("Invalid value");
//                break;
//        }
//
//
//    }
//
//
//public static void main(String[]args){
//
//
// work grade=new work();
//grade.grade();
//
//
//
//        }
//        }
