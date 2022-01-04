package com.company.classTaskUET;
import java.util.Scanner;
public class ClassTest {
    ClassTest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Table");
        int table = sc.nextInt();
        int i = 1;
        do {
            System.out.println(table + " * " + i + " = " + (table * i));
            i++;

        } while (i <= 10);
    }
   void Table2(int a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Table");
        int table2 = sc.nextInt();
        int i=10;
        do {
            System.out.println(table2 + " * " + i + " = " + (table2 * i));
i--;
        }while (i>=1);
    }


    public static void main(String[] args) {
    ClassTest obj=new ClassTest();
    obj.Table2(5);
    }
}
