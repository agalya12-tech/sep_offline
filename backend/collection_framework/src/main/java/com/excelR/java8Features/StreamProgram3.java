package com.excelR.java8Features;

import java.util.*;
import java.util.stream.Collectors;

public class StreamProgram3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("Apple","Box","Cat","Donkey"));

        Map<String,Integer> map;
        map=new HashMap<>();
        for(String s: list){
            map.put(s, s.length());
        }
        System.out.println(map);


       map=list.stream()
               .collect(
                       Collectors
                               .toMap((e)->e,(e)->e.length()));

    }
}
