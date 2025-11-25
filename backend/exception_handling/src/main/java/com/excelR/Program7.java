package com.excelR;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  userName: ");
        String userName = sc.next();
        System.out.print("Enter  password: ");
        String password = sc.next();
        try {
            authenticate(userName, password);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void authenticate(String username, String password) throws RuntimeException {
        if (username.equals("rahul")) {
            if (password.equals("Rahul@1234")) {
                System.out.println("Welcome " + username);
            } else {
                throw new RuntimeException("Invalid password ");
            }
        } else {
            throw new RuntimeException("Invalid userName enter correct userName");
        }
    }
}
