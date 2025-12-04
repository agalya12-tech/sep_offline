package com.excelR.mapPrograms;

import java.util.*;

public class MapProgram2 {
    public static void main(String[] args) {
        Map<Integer,String> map ;
        map= new HashMap<Integer,String>();
//        map.put(1,"one");
//        map.put(2,"two");
//        map.put(3,"three");
//        map.put(4,null);
//        map.put(null,"Five");
        System.out.println(map+" hashMap");










        map=new Hashtable<Integer,String>();
//        map.put(1,"one");
//        map.put(2,"two");
//        map.put(3,"three");
//        map.put(4,null);  // NPE
//        map.put(null,"Five"); //NPE
        System.out.println(map+" hashTable");



        map=new LinkedHashMap<>();
//        map.put(1,"one");
//        map.put(3,"three");
//        map.put(2,"two");
//        map.put(4,null);
//        map.put(null,"Five");
        System.out.println(map+" linkedHashMap");

        map=new TreeMap<>();
        map.put(3,"three");
        map.put(1,"one");
        map.put(2,"two");
        map.put(4,null);
//        map.put(null,"Five"); NPE
        System.out.println(map+" TreeMap");
    }
}
