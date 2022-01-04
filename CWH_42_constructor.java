package com.company;
class MymainEmployee{
    private int id;
    private String name;
public MymainEmployee(String myname,int myid){
    id=myid;
    name=myname;

}
public MymainEmployee(){
    id=25;
    name="Hassan";
}
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
public class CWH_42_constructor {
    public static void main(String[] args) {
MymainEmployee Hassan=new MymainEmployee("Myname is Hassan",25);
        MymainEmployee hk=new MymainEmployee();
        System.out.println( Hassan.getId());
        System.out.println(Hassan.getName());
        System.out.println( hk.getId());
        System.out.println(hk.getName());
    }
}
