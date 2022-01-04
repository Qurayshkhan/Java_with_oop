package com.company;
class Base{
    int x;

    public int getX() {
        System.out.println("I am From Base Class");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived extends Base {
    int y;

    public int getY() {
        System.out.println("I am from Derived class");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class CWH_45_inheritance {
    public static void main(String[] args) {
derived b=new derived();
b.setY(5);
        System.out.println(b.getY());

        Base d=new Base();
        d.setX(5);
        System.out.println(d.getX());

    }
}
