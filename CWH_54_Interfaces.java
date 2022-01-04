package com.company;
interface Bicycle{
    int a=45;
    void applyBreaks(int decrement);
    void speedUp(int increment);
}
interface blowhoron{
    void song();
    void song2();
}
class Avoncycle implements Bicycle,blowhoron{
    void blowhorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBreaks(int decrement){
        System.out.println("Applying Breaks");
    }
    public void speedUp(int increment) {
        System.out.println("Increase Speed");
    }
    public void song(){
        System.out.println("Main Houn naa");
    }
    public void song2(){
        System.out.println("Kabhi khushi kabhi gum");
    }
}

public class CWH_54_Interfaces {
    public static void main(String[] args) {
        // Learn Notes
Avoncycle hassan=new Avoncycle();
hassan.applyBreaks(5);
        System.out.println(hassan.a);
    hassan.song();
    hassan.song2();
    }
}
