package com.excelR;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collection1 {
    public static void main(String[] args) {

        Collection<Integer> c1 = new ArrayList<Integer>();
        System.out.println(c1.isEmpty());//true
        c1.add(10);
        c1.add(11);
        c1.add(12);
        System.out.println(c1);//[10,11,12]
        c1.remove(10);
        System.out.println(c1);//[11,12]
        System.out.println(c1.size());//2
        System.out.println(c1.contains(11));//true
//        c1.clear();
//        System.out.println(c1);

        System.out.println("==============================");
        Collection<Integer> c2 = new ArrayList<Integer>();
        c2.addAll(c1);
        System.out.println(c2);
        c2.remove(11);
//        c2.removeAll(c1);
        System.out.println(c2.containsAll(c1));
//        System.out.println(c2);


    }


}
