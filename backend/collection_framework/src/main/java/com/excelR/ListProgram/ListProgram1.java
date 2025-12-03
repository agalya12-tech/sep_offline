package com.excelR.ListProgram;

import java.util.ArrayList;
import java.util.List;

public class ListProgram1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        list.add(2,"Orange"); //IOBE Reason size is 0
        list.add("Yellow"); // [Yellow]
        list.add(1, "Red"); //[Yellow,Red]
        list.add(0, "Blue");//[Blue,Yellow, Red]
        list.addFirst("Green");//[Green ,Blue,Yellow, Red]
        list.addLast("Pink");//[Green ,Blue,Yellow, Red, Pink]
//      list.addAll(list2);
//      list.addAll(0,list1);

        list.remove(0);
        list.removeFirst();
        list.removeLast();
        list.remove("Yellow");
//      list.removeAll(list1);
//      list.retainAll(list1);
//      list.removeIf()
        System.out.println(list);
    }
}
