package com.excelR;
import java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        int[]arr={10,20,30};
        System.out.println(Arrays.toString(arr));
        arr[0]=100;
        System.out.println(Arrays.toString(arr));
        arr[4]=200;// AIOBE -- size is fixed(immutable)
        System.out.println(Arrays.toString(arr));
    }
}
/*
* Collection Framework -- is a collection of classes and interfaces
*                      -- non -primitive data type(Wrapper class)
* */
