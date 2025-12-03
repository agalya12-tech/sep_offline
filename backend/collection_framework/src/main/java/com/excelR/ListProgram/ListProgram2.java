package com.excelR.ListProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListProgram2 {
    public static void main(String[] args) {
       int[]arr={10,23,34,123,45,123,45,76,324,12};
        List<Integer> list=new ArrayList<>();

       for(int index=0;index<arr.length;index++){
           int value=arr[index];
            list.add(value);
//           list.add(index,value);
       }
       System.out.println(list);
       System.out.println(Arrays.toString(arr));
    }
}
