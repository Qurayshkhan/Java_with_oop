package com.company.classTaskUET;
import java.util.Scanner;
public class takeStringArrayFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []arr={"Ali","Moiz","Hassan","Siraj"};
        String name="Moiz";
        boolean isInArray=false;
        for(String e:arr){
            if (name==e){
                isInArray=true;
                break;
            }
        }
        if (isInArray){
            System.out.println("Element We find is "+ isInArray + " "+ name);
        }else {
            System.out.println("Element we can not Find");
        }
    }

}
