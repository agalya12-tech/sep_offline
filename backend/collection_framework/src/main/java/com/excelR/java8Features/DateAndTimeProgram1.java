package com.excelR.java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateAndTimeProgram1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Current date: " + localDate);
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());
        LocalDate first = localDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate last = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("first: " + first);
        System.out.println("last: " + last);
        LocalDate firstDay = localDate.with(TemporalAdjusters.firstDayOfYear());
        LocalDate lastDay = localDate.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("first: " + firstDay);
        System.out.println("last: " + lastDay);





        LocalTime localTime = LocalTime.now();
        System.out.println("Current time: " + localTime);

        LocalDateTime  localDateTime = LocalDateTime.now();
        System.out.println("Current time: " + localDateTime);
    }
}
