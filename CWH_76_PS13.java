package com.company;
class practice13 extends Thread{
   public void run(){
        while (true){

            System.out.println("Good Morining");
        }
    }
}
class practice extends Thread{
    public void run(){
        try{
            Thread.sleep(200);
        }catch (Exception e){
            System.out.println("Good Evening");
        }
    }
}
public class CWH_76_PS13 {
    public static void main(String[] args) {
practice13 p=new practice13();
p.setPriority(6);
        practice13 p1=new practice13();
        p.setPriority(9);
        System.out.println(p.getPriority());
        System.out.println(p1.getPriority());
p.start();
p1.start();
        System.out.println(p1.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
