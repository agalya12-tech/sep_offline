package com.excelR;

public class Program4 {
    public static void main(String[] args) {
        System.out.println("=====welcome====");

        int[] arr = {10, 20, 304, 50};

        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("=====Bye====");
        }
    }
}
