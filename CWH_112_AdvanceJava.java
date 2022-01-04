package com.company;
class MyDeprecated{
    @Deprecated
    void mth1(){
        System.out.println("i am method 1");
    }
}
interface Myint{
    public void display();
}
public class CWH_112_AdvanceJava {
    //Practice Set
    public static void main(String[] args) {
        MyDeprecated d=new MyDeprecated();
        d.mth1();
        Myint i= ()-> {

            {
                System.out.println(" i am display ");
            }
        };

    }
}
