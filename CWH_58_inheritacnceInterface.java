package com.company;
interface sampleInterface{
    void mth1();
    void mth2();
}
interface childsampleInterface extends sampleInterface{
void mth3();
void mth4();
}
class MysampleClass implements childsampleInterface{
   public void mth1(){
       System.out.println("This is mth1");
   }
    public void mth2(){
        System.out.println("This is mth2");
    }
    public void mth3(){
        System.out.println(" this is mth3");
    }
    public void mth4(){
        System.out.println(" this is mth4");
    }
}
public class CWH_58_inheritacnceInterface {
    public static void main(String[] args) {

childsampleInterface hassan=new MysampleClass();
hassan.mth1();
hassan.mth3();
hassan.mth2();
    }
}
