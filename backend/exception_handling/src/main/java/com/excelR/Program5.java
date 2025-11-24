package com.excelR;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
public class Program5 {
    public static void main(String[] args) {
        try {
            Class.forName("");
            DriverManager.getConnection("url");
//        } catch (ClassNotFoundException | SQLException  | ArithmeticException e) {
//            System.err.println("something went wrong");
//        }
        } catch (Throwable e) {
            System.err.println("something went wrong");
        }
    }
}
