package com.company;
interface annDemo{
    void mth(int a);
   // void mth2();
}
//class hassanfunc implements annDemo{
//
//    @Override
//    public void mth() {
//        System.out.println("i am mth 3");
//    }
//}
//class annomo2 implements annDemo{
//    public void display(){
//        System.out.println("Good Moring");
//    }
//    @Override
//    public void mth(){
//        System.out.println(" i am Mth 1");
//    }
//    @Override
//    public  void mth2(){
//        System.out.println("I am mth 2");
//    }
//}


public class CWH_109_Lamda {
    public static void main(String[] args) {

//        annomo2 obj=new annomo2();
//        obj.display();
//obj.mth();
//obj.mth2();

//     annDemo obj=new annDemo() {
//         @Override
//         public void mth() {
//             System.out.println("i am mth 1");
//         }
//
//         @Override
//         public void mth2() {
//             System.out.println("i am mth 2");
//         }
//     };
//    obj.mth();
        annDemo obj=(a)->{
            System.out.println(" i am mth1 ");
        };
obj.mth(6);
    }

}
