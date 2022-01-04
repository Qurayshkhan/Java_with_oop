package com.company;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class stringClassTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your string");
        String str=sc.nextLine();
        System.out.println("Enter Your Index number");
        int Index=sc.nextInt();
        System.out.println(str.charAt(Index));


    }



}
