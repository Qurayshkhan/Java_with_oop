package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyy--E H:m a");
        DateTimeFormatter dtf2=DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate=dt.format(dtf);
        System.out.println(mydate);
    }
}
