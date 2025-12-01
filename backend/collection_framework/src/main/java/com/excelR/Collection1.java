package com.excelR;

import java.util.*;
import java.util.function.Predicate;

public class Collection1  {
    public static void main(String[] args) {
        Collection<String>c1=new ArrayList<>();
        c1.add("pearl");
        c1.add("custard apple");
        Collection<String> c = new ArrayList<>();
        System.out.println(c);//[]
        c.add("Apple");
        c.add("Banana");
        c.add("Orange");
        c.addAll(c1);
//        System.out.println(c); //[Apple,Banana,Orange,pearl,custard apple]
//        c.remove("Orange");//[Apple,Banana,pearl,custard apple]
//        c.removeAll(c1);//[Apple,Banana]

       Predicate<String>p=(e) -> {
           return e.equals("Orange");
       };
        c.removeIf(p);

        System.out.println(c);

    }


}
