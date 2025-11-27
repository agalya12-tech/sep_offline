package com.excelR;

public class ThreadScheduler {
    public static void main(String[] args) {
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=new Thread();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
