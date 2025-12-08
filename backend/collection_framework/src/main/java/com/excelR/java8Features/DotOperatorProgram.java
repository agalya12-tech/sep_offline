package com.excelR.java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DotOperatorProgram {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
//        list.forEach(
//                (e)->System.out.println(e)
//        );
        list.forEach(System.out::println);
    }
}
