package com.company.classTaskUET;
import java.util.Scanner;
public class StringInharitance {
    void TakeString(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        System.out.println("Enter Index number");
        int Index=sc.nextInt();
        System.out.println(str.charAt(Index));
    }


    public static void main(String[] args) {
child2 obj=new child2();
obj.TakeString();
StringInharitance obj2=new StringInharitance();
obj2.TakeString();
    }

}
class child2 extends StringInharitance{
    void TakeString(){
        System.out.println("I am from child class");
    }
}

