package com.excelR.java8Features;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterProgram {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(localDate));
    }
}
