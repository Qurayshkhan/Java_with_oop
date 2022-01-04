package com.company;

public class CWH_31_MethodsInJava {
//    public int logic(int a, int b){
    static int logic(int a,int b){
        int c;
        if (a>b){
            c=a+b;
        }else{
            c=(a+b)*5;
        }
        return c;
    }
    public static void main(String[] args) {
CWH_31_MethodsInJava obj=new CWH_31_MethodsInJava();
        int x=5;
        int y=10;
        int z=logic(x,y);
        System.out.println(z);
//        int z=obj.logic(x,y);
//        System.out.println(z);


    }
}
