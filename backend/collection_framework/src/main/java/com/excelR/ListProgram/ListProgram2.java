package com.excelR.ListProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListProgram2 {
    public static void main(String[] args) {
        Integer[] arr = {10, 23, 34, 123, 45, 123, 45, 76, 324, 12};
//        List<Integer> list = new ArrayList<>();
//        for (int index = 0; index < arr.length; index++) {
//            int value = arr[index];
//            list.add(value);
////           list.add(index,value);
//        }

//        List<Integer>list=Arrays.asList(arr);
        List<Integer>list=List.of(arr);
        System.out.println(list);
        System.out.println(Arrays.toString(arr));



        List<String>list2=new ArrayList<>();
        list2.add("ONE");
        list2.add("TWO");
        list2.add("THREE");
        String[]arr2=new String[list2.size()];

        for(int i=0;i<list2.size();i++){
            arr2[i]=list2.get(i);
        }

        System.out.println(Arrays.toString(arr2));
    }
}
