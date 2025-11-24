package com.excelR;

import java.sql.SQLException;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");

        try {
            int a = input.nextInt();
            System.out.println(a/0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {// handling input mismatch by parent(UpCasting)
            System.out.println("enter a number of 0-9 combination");
        }

    }
}
