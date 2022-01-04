package com.company.classTaskUET;
import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        int [] num=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values");
        for(int i=0; i<num.length; i++)
        {
            num[i]=sc.nextInt();
        }
        for(int j=0; j<num.length; j++)
        {
            for(int i=j; j<0; j++)
            {
                if(num[i]==num[j])
                {

                }
            }
            for(int k=0; k<num.length; k++)
            {
                System.out.println(num[k]);

            }
        }
    }
}
