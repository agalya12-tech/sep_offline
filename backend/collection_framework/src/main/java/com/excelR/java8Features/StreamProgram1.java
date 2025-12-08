package com.excelR.java8Features;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
*  1  2   3  4  5
*  5  10  15 20 25
*     10     20
*
* */
public class StreamProgram1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
//        for(int x:arr){
//            int res=x*5;
//            if(res%2==0){
//                System.out.println(res);
//            }
//        }
         Arrays.stream(arr)
                 .map((e) -> e * 5)
                 .filter((e) -> e % 2 == 0)
                 .forEach(System.out::println);

    }
}
