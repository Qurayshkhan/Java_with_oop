//package com.company;
//import javax.swing.plaf.synth.SynthLookAndFeel;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ghdg {
//    Scanner sc = new Scanner(System.in);
//    public void match(){
//        System.out.println("Enter Max Value");
//        int n=sc.nextInt();
//        int arr[] = new int[n];
//        int i;
//        System.out.println("Enter The Values of Array");
//        for (i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Display Array");
//        for (i=0;i<n;i++){
//            //System.out.println(arr[i]);
//            for (int j=i+1;j< arr.length;j++){
//                int tmp=0;
//                if (arr[i]>arr[j]){
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//                if (arr[i]==arr[j]){
//                    System.out.println(arr[i]+" Is Duplicate");
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args) {
//        Arrayfo obj = new Arrayfo();
//        Arrayfo obj1 = new Array2();
//        obj.match();
//        obj1.match();
//
//    }
//}
//
//class Array2 extends Arrayfo{
//    public void match(){
//        System.out.println("Enter Max Value");
//        int n=sc.nextInt();
//        String arr[] = new String[n];
//        int i;
//        System.out.println("Enter The Values of Array In String");
//        for (i=0;i<n;i++){
//            arr[i]=sc.next();
//        }
//        System.out.println("Display Array");
//        for (i=0;i<n;i++){
//            //System.out.println(arr[i]);
//            for (int j=i+1;j< arr.length;j++){
////                int tmp=0;
////                if (arr[i]>arr[j]){
////                    tmp = arr[i];
////                    arr[i] = arr[j];
////                    arr[j] = tmp;
////                }
//                if (arr[i].equals(arr[j])){
//                    System.out.println(arr[i]+" Is Duplicate");
//                }
//            }
//        }
////        System.out.println(Arrays.toString(arr));
//    }
//
//}