package com.company.classTaskUET;

public class Variation_in_calling {
    public static void moiz(){
        System.out.println("My name is Moiz");
    }
    public static void musa(){
        System.out.println("My name is musa");
    }
    public static void hassan(){
        System.out.println("My name is Hassan");
    }
    public static void tayyab(){
        moiz();
        musa();
        hassan();
        System.out.println("My name is tayyab");
    }

    public static void main(String[] args) {
        tayyab();
    }
}
