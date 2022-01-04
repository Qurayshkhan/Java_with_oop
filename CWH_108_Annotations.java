package com.company;

@FunctionalInterface
interface myfunctionalInterface{
void thisMethod();
   // void thisMethod2();
}
class annotation{
    public void ann(){
        System.out.println("Today is Sunday");
    }
}
class anno extends annotation{
    @Override
    public void ann(){
        System.out.println("Today is Sunday");

    }
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}
public class CWH_108_Annotations {
    public static void main(String[] args) {
        @SuppressWarnings("depreaction")
anno obj=new anno();
obj.ann();
obj.sum(5,8);
    }
}
