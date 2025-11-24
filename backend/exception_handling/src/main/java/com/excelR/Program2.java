package com.excelR;

import java.sql.DriverManager;

public class Program2 {
    public static void main(String[] args) {
        try {
            DriverManager.getConnection("url");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
