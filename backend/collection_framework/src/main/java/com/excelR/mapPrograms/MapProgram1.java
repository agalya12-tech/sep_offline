package com.excelR.mapPrograms;

import java.util.HashMap;
import java.util.Map;

public class MapProgram1 {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
//      adding key-value pair
        map.put(1,"one");//{1=one}
        map.put(2,"two");//{1=one,2=two}
        map.put(3,"three");//{1=one,2=two,3=three}
//        map.put(3,"three");
//        map.put(3,"four");
        map.put(4,"three");//{1=one,2=two,3=three,4=three}
        map.put(4,"four");//{1=one,2=two,3=three,4=four}
        System.out.println(map);
//       getting value
        System.out.println(map.get(1));//one
        System.out.println(map.get(11));//null
        System.out.println(map.getOrDefault(1,"XXX"));//one
        System.out.println(map.getOrDefault(11,"XXX"));//XXX


    }
}
