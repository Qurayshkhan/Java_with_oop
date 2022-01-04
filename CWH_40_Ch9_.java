package com.company;
class MyEmployee{
    private int id;
     private String name;
public void setname(String n){
  this. name=n;
}
    public String getName() {
        return name;
    }
    public int setid(int i ) {
      return this. id = i;
    }

    public int getId() {
        return id;
    }
}
public class CWH_40_Ch9_ {
    public static void main(String[] args) {
MyEmployee Hassan=new MyEmployee();

  Hassan.setname("Hassan");
Hassan.getName();
        System.out.println(Hassan.getName());
Hassan.setid(1);

Hassan.getId();
        System.out.println(Hassan.getId());

    }
}
