package com.excelR.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamProgram2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2,3,7,3,7 ,3, 4);

//        Set<Integer> set=new TreeSet<>(numbers);
//        System.out.println(set);
        Set<Integer>set=numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toSet());
        System.out.println(set);

    }
}
