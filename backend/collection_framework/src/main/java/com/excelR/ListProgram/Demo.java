package com.excelR.ListProgram;

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 3, 4, 2 );

       list.stream().map(x->x*x).forEach(System.out::println);

    }
}
