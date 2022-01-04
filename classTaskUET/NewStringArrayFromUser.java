package com.company.classTaskUET;
import java.util.Scanner;
public class NewStringArrayFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []arr={"Ali","Hassan","Siraj"};
        String a=sc.nextLine();
      boolean isInArray=false;
        for(int i=0;i<arr.length;i++){
            if (arr[i].equals(a)){
//                 isInArray=true;
//                break;
            }
            if (isInArray){
                System.out.println("The element is found"+ isInArray+ a );
            }else {
                System.out.println("Not Found");
            }
        }
    }
}
