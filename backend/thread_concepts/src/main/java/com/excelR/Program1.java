package com.excelR;

public class Program1 {
    public static void main(String[] args) {
        /*
        * Exception in thread "main" java.lang.NumberFormatException:
        *  For input string: "10f"
         * */
        String s="10f";
        Integer i=Integer.valueOf(s);
        System.out.println(i);
    }
}
