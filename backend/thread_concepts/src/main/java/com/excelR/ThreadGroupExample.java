package com.excelR;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup threadGroup=new ThreadGroup("ExcelR");

        Thread t1=new Thread(threadGroup, "Thread-A");
        Thread t2=new Thread(threadGroup,"Thread-B");
        Thread t3=new Thread(threadGroup,"Thread-C");

        t1.start();
        t2.start();
        t3.start();
        threadGroup.list();

    }
}
