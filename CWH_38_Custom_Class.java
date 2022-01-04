package com.company;
class Employee{
    int age;
    String name;
    int salery;
    public void printDetails(){
        System.out.println(" My name is "+name);
        System.out.println("My Age is "+ age);
    }
    public int getSalerysalery(){
        return salery;
    }
}
public class CWH_38_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is Our Custom Class");
    Employee employee=new Employee();
        Employee employee2=new Employee();
   employee.age=20;
   employee.name="Hassan";
employee.salery=12;
        employee2.age=21;
        employee2.name="Husnain";
        employee2.salery=23;
//    System.out.println("The name of Employee is "+employee.name+" And Age is "+employee.age);
//        System.out.println("The name of Employee is "+employee2.name+" And Age is "+employee2.age);

        employee.printDetails();
        employee2.printDetails();
int salery=employee.getSalerysalery();
        System.out.println(salery);
        int emp2Salery= employee2.getSalerysalery();
        System.out.println(emp2Salery);
    }
}
