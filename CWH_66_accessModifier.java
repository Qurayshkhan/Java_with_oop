package com.company;
class C1{
    public int a=5;
    public int b=25;
    int z=10;
    protected int x=30;
    private int v=10;
    public void math(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(z);
        System.out.println(x);

    }


}
public class CWH_66_accessModifier {
    public static void main(String[] args) {
C1 c=new C1();
        System.out.println(c.a);
     //   System.out.println(c.v);
    }
}
