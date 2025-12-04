package com.excelR.mapPrograms;

import java.util.*;

public class MapProgram2 {
    public static void main(String[] args) {
        Map<Integer,String> map ;
        map= new HashMap<Integer,String>();
        System.out.println(map+" hashMap");

        map=new Hashtable<>();
        System.out.println(map+" hashTable");

        map=new LinkedHashMap<>();
        System.out.println(map+" linkedHashMap");

        map=new TreeMap<>();
        System.out.println(map+" hashTreeMap");
    }
}
