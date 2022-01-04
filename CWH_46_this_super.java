package com.company;
class EkClass{
    int a;

    public int getA() {
        return a;
    }
EkClass(int a){
        this.a=a;//this  keyword  is refrence
}
    public int return1(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println(" I am a constructor");
    }
}
public class CWH_46_this_super {
    public static void main(String[] args) {
EkClass e=new EkClass(5);
DoClass d=new DoClass(5);


        System.out.println(e.getA());

    }
}
