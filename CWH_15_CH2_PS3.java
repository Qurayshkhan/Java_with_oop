package com.company;

import java.util.Locale;

public class CWH_15_CH2_PS3 {
    public static void main(String[] args) {
//        Question 1
        String name="Jack Parker";
name=name.toLowerCase();
        System.out.println(name);

       // Question 2
        String text="To Lower Case";
        text=text.replace(" ","_");
        System.out.println(text);

        //Question 3
String letter="Dear <|Name|>, Thanks Alot!";
letter= letter.replace("<|Name|>","Hassan");
        System.out.println(letter);

        //problem 4
        String myString="This string Contain        double and triple Space";
        System.out.println(myString.indexOf("Space"));
        System.out.println("  ");

        //problem 5
        String myletter="Dear Hassan,\n\tYou are a Good Boy\nThanks";



    }
}
