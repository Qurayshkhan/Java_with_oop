package com.company;

class  catogoriesInharitance{


    public static void main(String[]args){

        child obj=new child();
        obj.print2();
        child3 obj2=new child3();
        obj2.count();


    }
}

//parent class
class parent{
 void print2(){
     System.out.println("I am parent class");
}
}

class child extends parent {

    void sum(){
        int a=10;
        int b=20;
        int sum=(a+b);
        System.out.println("The sum of two number is " + sum);
    }

}
class child2 extends parent{
    void mul(){
        int a=10;
        int b=20;
        int mul=(a * b);
        System.out.println("The sum of two number is " + mul);
    }}
class child3 extends parent{
   void count(){
       for(int i=10;i>=0;i--){
           System.out.println("reverse number is "+ i);
       }

   }

}
