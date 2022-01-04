package com.company;

public class CWH_27_forEachLoopArray {
    public static void main(String[] args) {
        //int []marks={10,20,30,40,50,60,70,80,90,100};

//        float []marks={10.02f,20.20f,30.30f,40.40f,50.50f,60.60f,70.70f,80.80f,90.90f,100.10f};
//        System.out.println(marks.length);
//        System.out.println(marks[5]);

//        String []students={"Hassan","Siraj","Moiz","Waleed","Ali-Hassan"};
//        System.out.println(students[3]);
//        System.out.println(students.length);


int []marks={10,20,30,40,50};
        System.out.println(marks.length);
        //Display the Array(Naive way)
        //Display The array(for Loop)
//for (int i=0;i<marks.length;i++){
//    System.out.println(marks[i]);
//}
////pring Array in Reverse Order
//        for (int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
//
        for (int element:marks){
            System.out.println(element);
        }
    }
}
