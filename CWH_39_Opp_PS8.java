package com.company;
class Employee1{
int salary;
String name;

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}
class cellphone{
    public void ringing(){
        System.out.println("Ringing");
    }
    public void Vibrating(){
        System.out.println("Vibrating");
    }
    public void Calling(){
        System.out.println("Vibrating");
    }
}
class  square{
    int side;
    public int Area(){
        return side*side;
    }
    public int parimeter(){

        return  4*side;
    }
}
class tommy{
    public void hit(){
        System.out.println("Hitting The Enimies");
    }
    public void runnig(){
        System.out.println("Running");
    }
    public void firing(){
        System.out.println("Firing On Enimies");
    }
}
public class CWH_39_Opp_PS8 {
    public static void main(String[] args) {
//Problem 1
// Employee1 Hassan=new Employee1();
// Hassan.salary=200000;
// Hassan.setname("Hassan khan");
//        System.out.println("The Name of the Employee is " + Hassan.getName());
//        System.out.println("The Salary of this Employee is " + Hassan.getSalary());
//
//        //problem 2
//        cellphone pcoox3=new cellphone();
//        pcoox3.Calling();
//        pcoox3.Vibrating();
//        pcoox3.ringing();

    //problem 4
//        square sqr=new square();
//        sqr.side=5;
//        int ans= sqr.Area();
//        int ans2 = sqr.parimeter();
//        System.out.println(ans);
//        System.out.println(ans2);
//
//problem 5
        tommy player=new tommy();
         player.firing();
        player.runnig();
        player.hit();
    }
}
