package com.excelR;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  userName: ");
        String userName = sc.next();
        System.out.print("Enter  password: ");
        String password = sc.next();
        authenticate(userName, password);
    }
    public static void authenticate(String username, String password) {
        if (username.equals("rahul")) {
            if (password.equals("Rahul@1234")) {
                System.out.println("Welcome " + username);
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Wrong username");
        }
    }
}
