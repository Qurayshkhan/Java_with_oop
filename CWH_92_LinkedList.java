package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class CWH_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
        LinkedList<Integer> li2=new LinkedList<>();
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
li.addFirst(3);
li.addLast(400);
        System.out.println(li.contains(10));
        System.out.println(li.indexOf(5));
        System.out.println(li.lastIndexOf(6));


        for (int i=0;i< li.size();i++){
            System.out.println(li.get(i));


        }
    }

}
