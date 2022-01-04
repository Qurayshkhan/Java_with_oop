package com.company;
class phone{
    public void ShowTime(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("Turning on phone");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("Playing Music");
    }
    public void name(){
        System.out.println("Turning on smartPhone");
    }


}

public class CWH_49_DynamicMethod {
    public static void main(String[] args) {
//        phone obj=new phone();
//        smartphone smobj=new smartphone();
//        obj.name();
    phone obj=new smartphone();
    obj.ShowTime();
    obj.name();

    }
}
