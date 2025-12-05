package com.excelR.java8Features;

public class FunctionalInterfaceProgram1 {
    public static void main(String[] args) {
        Program1 p1 = () -> {
            System.out.println("m1 method from program1 interface");
        };
        Program1 p2 = () -> System.out.println("m1 method from program1 interface");
        p1.m1();
    }
}
@FunctionalInterface
interface Program1 {
    void m1();
}