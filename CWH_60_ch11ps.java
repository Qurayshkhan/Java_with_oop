package com.company;
abstract class Pen{
    abstract void write();
    abstract void refil();
}
class fountainPen extends Pen{
     void write(){
         System.out.println("Write");
     }
     void refil(){
         System.out.println("Refil");
     }
     void changeNib(){
         System.out.println("Change Nib");
     }

}
class Monkey{
    void jump(){
        System.out.println("Jumping.....");
    }
    void bite(){
        System.out.println("Eating");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hellow Sir Hellow Sir");
    }
    public void eat(){
        System.out.println("Basic Animals easting");
    }
    public void sleep(){
        System.out.println("Basic Animals sleeping...");
    }
}
public class CWH_60_ch11ps {
    public static void main(String[] args) {
//Q1+Q2
        fountainPen pen=new fountainPen();
pen.changeNib();
pen.write();
pen.refil();

Human hassan=new Human();
hassan.sleep();
hassan.eat();
hassan.jump();
Monkey m1=new Human();
//m1.speakl cannot speak method because the refrence is Monkey which does have speak method
BasicAnimal husnain=new Human();
//husnain.speak(); through error
    }
}
