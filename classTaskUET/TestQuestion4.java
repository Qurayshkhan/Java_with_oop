package com.company.classTaskUET;
import java.util.Scanner;
public class TestQuestion4 {
    void reverse(){
        int num=0;
        int reversenum =0;
        System.out.println("Input your number and press enter: ");

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of input number is: "+reversenum);
    }

    public static void main(String[] args) {

        TestQuestion4 obj=new TestQuestion4();
        obj.reverse();
    }
    }

