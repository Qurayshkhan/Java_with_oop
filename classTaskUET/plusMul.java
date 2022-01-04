package com.company.classTaskUET;
import java.util.Scanner;


    class plusMul{
        class AddMul
       {
           void add()
           {
               Scanner scan=new Scanner(System.in);
               System.out.print("Enter the first number: ");
               int num1=scan.nextInt();
               System.out.print("Enter the second number: ");
               int num2=scan.nextInt();
               for(int i=0; i<num2; i++)
                   num1++;
               System.out.print("Sum of two numbers is: "+num1);
           }

        }
        class mul extends AddMul {
            void multiplay() {
                Scanner sc = new Scanner(System.in);
                int x, y, sum = 0;
                System.out.print("Enter the first number: ");
                x = sc.nextInt();
                System.out.print("Enter the second number: ");
                y = sc.nextInt();

                for (int i = 1; i <= x; i++) {

                    sum = sum + y;
                }

                System.out.println("The multiplication of " + x + " and " + y + " is: " + sum);


            }
        }
            public void main(String args[]) {

                mul obj= new mul();

            }
        }



