package com.company.classTaskUET;
import java.util.*;
public class Array3sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int sum1=0;
        int sum2=0;
        System.out.println("enter index of first array");
        int x= sc.nextInt();
        int a[]=new int[x];
        System.out.println("enter element");
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("enter index of second array");
        int y= sc.nextInt();
        int b[]=new int[y];
        System.out.println("enter element");
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
            sum1 = sum1 + b[i];
        }
        System.out.println("enter index of Third array");
        int z= sc.nextInt();
        int c[]=new int[z];
        System.out.println("enter element");
        for (int i = 0; i < z; i++) {
            c[i] = sc.nextInt();
            sum2 = sum2 + c[i];
        }
        System.out.println("First array"+Arrays.toString(a));

        System.out.println("Second array"+Arrays.toString(b));

        System.out.println("Second array"+Arrays.toString(c));

        if (sum>sum1 && sum>sum2)

        {
            System.out.println("sum of first array is large "+sum);
        }
        if (sum1>sum && sum1>sum2)
        {
            System.out.println("sum of second array is large "+sum1);

        }
        if (sum2>sum && sum2>sum1)
        {
            System.out.println("sum of third array is large "+sum2);

        }

        if (sum<sum1 && sum<sum2)
        {
            System.out.println("sum of first array is small "+sum);
        }
        if (sum1<sum && sum1<sum2)
        {
            System.out.println("sum of second array is small "+sum1);

        }
        if (sum2<sum && sum2<sum1)
        {
            System.out.println("sum of third array is small "+sum2);

        }

        if (sum<sum1 && sum>sum2 || sum>sum1 && sum<sum2)
        {
            System.out.println("sum of first array is medium "+sum);
        }
        if (sum1<sum && sum1>sum2 || sum1>sum && sum1<sum2)
        {
            System.out.println("sum of second array is medium "+sum1);

        }
        if (sum2<sum1 && sum2>sum || sum2>sum1 && sum2<sum)
        {
            System.out.println("sum of third array is medium "+sum2);

        }
    }



}

