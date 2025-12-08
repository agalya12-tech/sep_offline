package com.excelR.java8Features;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate= LocalDate.of(1997,5,21);
        System.out.println("Birth Day: "+birthDate.getDayOfWeek());

        Period  period = Period.between(birthDate, currentDate);
        System.out.println(period.getYears()+" years");
        System.out.println(period.getMonths()+" months");
        System.out.println(period.getDays()+" days");
    }
}
