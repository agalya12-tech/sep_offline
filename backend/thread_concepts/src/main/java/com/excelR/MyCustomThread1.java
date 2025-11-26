package com.excelR;

public class MyCustomThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyCustomThread1 run method");
    }

    public static void main(String[] args) {
         Runnable r=new MyCustomThread1();
         System.out.println(r);
         r.run();
    }
}
