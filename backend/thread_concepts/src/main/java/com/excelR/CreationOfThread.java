package com.excelR;

public class CreationOfThread {
    public static void main(String[] args) {

        Runnable r=new Thread();
        System.out.println(r);
        Thread t=new Thread();
        System.out.println(t);
        t.setName("MyThread");// re-initialize
        System.out.println(t);
        System.out.println(t.getName());
        Thread t1=new Thread("MyThread2"); // re-initialize while creating object
        System.out.println(t1);
    }
}
