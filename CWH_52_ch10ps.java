package com.company;
class circle{
    public int radius;
    circle(int r){
        System.out.println("I am circule Simple parameterize constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}



class cylinder1 extends circle{
    public int height;
    cylinder1(int r,int h){
        super(r);
        System.out.println("I am cylinder1 from parameterize constructor");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.radius;
    }
}
public class CWH_52_ch10ps {
    public static void main(String[] args) {
        //problem 1
        cylinder1 obhC=new cylinder1(12,4);

    }
}
