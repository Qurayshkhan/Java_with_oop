package com.company;
import java.util.ArrayList;
public class CWH_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> li2=new ArrayList<>();
        li2.add(20);
        li2.add(30);
        li.add(6);
        li.add(23);
        li.add(34);
        li.add(10);
        li.add(5);
        li.add(0,5);
        li.addAll(li2);
        li.addAll(0,li2);
        li.set(1,588);

        System.out.println(li.contains(10));
        System.out.println(li.indexOf(5));
        System.out.println(li.lastIndexOf(6));

        for (int i=0;i< li.size();i++){
            System.out.println(li.get(i));


        }
    }

}
