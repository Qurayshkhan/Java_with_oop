package com.company;
import java.util.ArrayDeque;
import java.util.Deque;
public class CWH_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> li=new ArrayDeque<>();
        li.add(5);
        li.add(6);
        li.add(7);
        li.addFirst(100);
        li.addLast(200);
        li.removeFirst();
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
    }
}
