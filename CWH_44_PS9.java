package com.company;
 class cylinder{
    private  int radius;
    private  int height;

     public cylinder(int radius, int height) {
         this.radius = radius;
         this.height = height;
     }

     public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surdaceArea(){
        return  2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI *radius*radius*height;
    }
}
 class rectangle{
     private int length;
     private int breath;

     public int getLength() {
         return length;
     }

     public int getBreath() {
         return breath;
     }

     public rectangle(int length, int breath) {
         this.length = 4;
         this.breath = 5;

     }
 }
public class CWH_44_PS9 {
    public static void main(String[] args) {
        cylinder myCylinder=new cylinder(9,12);
        //myCylinder.setHeight(12);
        int h=myCylinder.getHeight();
        System.out.println(h);
       // myCylinder.setRadius(9);
        int r=myCylinder.getRadius();
        System.out.println(r);

//problem 2
        System.out.println(myCylinder.surdaceArea());
        System.out.println(myCylinder.volume());
        //problem 3
        rectangle rac=new rectangle(12,56);
        System.out.println(rac.getLength());
        System.out.println(rac.getBreath());
    }
}
