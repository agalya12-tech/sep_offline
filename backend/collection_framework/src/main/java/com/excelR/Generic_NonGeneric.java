package com.excelR;

import java.util.ArrayList;
import java.util.Collection;

public class Generic_NonGeneric {
    public static void main(String[] args) {
//        Non - Generic
        Collection collection = new ArrayList(); // UpCasting
        collection.add(10);
        collection.add('A');
        collection.add("Apple");
        collection.add(true);
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        Collection<Integer> collection1 = new ArrayList<Integer>(); // UpCasting
        collection1.add(10);
//        collection1.add('A');
//        collection1.add("Apple");
//        collection1.add(true);
        System.out.println(collection1);
        System.out.println(collection1.isEmpty());
        System.out.println(collection1.size());
    }
}
