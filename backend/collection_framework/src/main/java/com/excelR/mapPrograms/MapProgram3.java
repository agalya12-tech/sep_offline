package com.excelR.mapPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapProgram3 {
    public static void main(String[] args) {

        String s="malayalam";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);



//        Map<Integer,String> map=new HashMap<>();








//        map.put(1,"one");
//        map.put(2,"two");
//        map.putIfAbsent(2,"Three");
//        map.putIfAbsent(3,"Three");
//        System.out.println(map); //{1=one, 2=Three, 3=Three}
    }
}


/*
* malayalam
* m-2
* a-4
* l-2
* y-1
* */