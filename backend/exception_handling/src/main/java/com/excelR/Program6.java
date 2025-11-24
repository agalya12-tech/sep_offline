package com.excelR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program6 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        try {
            m2();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
// throwing checked exception
    public static void m1() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");
    }
// throwing unchecked exception
    public static void m2() throws RuntimeException {
        String str = "demo";
        for (int i = 0; i <= str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}
