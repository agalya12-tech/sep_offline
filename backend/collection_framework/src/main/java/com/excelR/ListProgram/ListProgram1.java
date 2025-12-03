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


//        update elements
        System.out.println(list);
        list.add(2,"Black"); // it inserts Black in 2nd index position
        list.set(3,"Black"); // it modifies Black in 2nd index position
        System.out.println(list);

//         accessing elements
//         System.out.println(list.get(12));//IOBE
           System.out.println(list.get(2));//Black
           System.out.println(list.getFirst());//Green
           System.out.println(list.getLast());//Pink


//        finding index based on value
         System.out.println(list.indexOf("Black"));//2
         System.out.println(list.lastIndexOf("Black"));//3
         System.out.println(list.lastIndexOf("White"));//-1

//        check elements
//        list.contains("Yellow");
//        list.containsAll(list1);

//       delete operations
//        list.remove(0);
//        list.removeFirst();
//        list.removeLast();
//        list.remove("Yellow");
//      list.removeAll(list1);
//      list.retainAll(list1);
//      list.removeIf()
    }
}
