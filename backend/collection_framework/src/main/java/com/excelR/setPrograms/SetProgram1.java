package com.excelR.setPrograms;

import java.util.*;

public class SetProgram1 {
    public static void main(String[] args) {
        Set<String>set;
        set=new HashSet<>();
//        set.add("Apple");
//        set.add("Pear");
//        set.add("Pear");
//        set.add(null);
//        System.out.println(set+" hashset");






        set=new LinkedHashSet<>(); // insertion order
//        set.add("Apple");
//        set.add("Banana");
//        set.add("Pear");
//        set.add("Pear");
//        set.add(null);
//        System.out.println(set+"  linked hashset");
        set=new TreeSet<>();// sorting order
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Pear");
        set.add("Pear");
//        set.add(null); Null Pointer Exception
        System.out.println(set+"   Treeset");


    }
}
