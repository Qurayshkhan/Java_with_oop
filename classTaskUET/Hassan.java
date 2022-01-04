package com.company;
import java.util.Scanner;
public class Hassan {

    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int year;
System.out.println("Enter a Year");
year=sc.nextInt();
if (year%4==0){
    System.out.println("It is a leap Year");
}else {
    System.out.println("It is not a leap Year");
}

int num;
System.out.println("Enter a number");
num=sc.nextInt();
if (num%2==0){
    System.out.println("It is odd Number");
}else {
    System.out.println("it is odd");
}
int num2;
System.out.println("Enter number again");
num2=sc.nextInt();
for (int i=1;i>=num2;i--){
    System.out.println(i);
}
    }
}