package com.excelR;

public class ThreadProgram1  {

    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("lambda expression which represents run method inside runnable interface");
        };
        Thread t=new Thread(r);
        System.out.println(t);
        t.start();
    }
}
