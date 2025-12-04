package com.excelR.mapPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapProgram3 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.putIfAbsent(2,"Three");
        map.putIfAbsent(3,"Three");
        System.out.println(map); //{1=one, 2=Three, 3=Three}
        map.replace(3,"Five");
        map.replace(6,"Five");
        System.out.println(map);//{1=one, 2=Three, 3=Five}
        map.remove(13);
//        map.remove(3,"Five");
        System.out.println(map);//{1=one, 2=Three, 3=Five}

    }
}


