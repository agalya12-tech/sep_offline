package com.excelR.java8Features;

public class FunctionInterfaceProgram2 {
    public static void main(String[] args) {

        Program2 p1 = () -> {
            return 20 + 30;
        };
//        for one line , we can ignore curly braces ,
//        if curly braces are not using return keyword is not necessary
        Program2 p2 = () -> 20 + 30;
        System.out.println(p1.m1());
        System.out.println(p2.m1());
    }
}

@FunctionalInterface
interface Program2 {
    int m1();
}