package com.excelR.setPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram1 {
    public static void main(String[] args) {
        Set<String>set;
        set=new HashSet<>();
//        set.add("Apple");
//        set.add("Pear");
//        set.add("Pear");
//        set.add(null);
//        System.out.println(set+" hashset");





        
        set=new LinkedHashSet<>();
//        set.add("Apple");
//        set.add("Banana");
//        set.add("Pear");
//        set.add("Pear");
//        set.add(null);
//        System.out.println(set+"  linked hashset");
        set=new TreeSet<>();
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Pear");
        set.add("Pear");
//        set.add(null); Null Pointer Exception
        System.out.println(set+"   Treeset");
    }
}
