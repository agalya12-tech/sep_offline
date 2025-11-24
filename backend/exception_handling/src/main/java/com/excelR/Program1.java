package com.excelR;

public class Program1 {
    public static void main(String[] args) {
        String s=null;
        System.out.println(s);
        try{
            System.out.println(s.length());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(s);
    }
}
