package com.company;

public class CWH_24_ch4_breakContinue {
    public static void main(String[] args) {
        System.out.println("Break and Continue");
//    for (int i=0;i<=5;i++){
//        System.out.println(i);
//        System.out.println("Java is An Other World");
//        if (i==2){
//            System.out.println("End of The Loop");
//            break;
        //continue
//        }
////    }
//        int i=0;
//        while (i<5){
//            System.out.println("Java is Great");
//            if (i==2){
//                System.out.println("End of The Loop");
//                break;
        //continue
//            }
//            i++;
//        }
//        System.out.println("Loops End Here");

        int n=0;
        do {
            System.out.println(n);
            System.out.println("Java is an other world");
        if (n==2){
            System.out.println("Loops End here");
            break;
            //continue
        }
        n++;
        }while (n<5);
    }
}
