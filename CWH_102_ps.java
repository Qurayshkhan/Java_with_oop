package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class CWH_102_ps {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("Student 1 added");
        ar.add("Student 2 added");
        ar.add("Student 3 added");
        ar.add("Student 4 added");
        ar.add("Student 5 added");
        ar.add("Student 6 added");
        for (Object o:ar){
            System.out.println(o);
        }
        Date st=new Date();
        System.out.println(st.getHours() + ":" + st.getMinutes() + ":" + st.getSeconds());

        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        LocalDateTime t=LocalDateTime.now();
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(t.format(dt));

        HashSet<Integer> s=new HashSet();
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9);
        s.add(9);
            System.out.println(s);
    }

}
