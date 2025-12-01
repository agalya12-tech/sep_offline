package com.excelR;

public class Waiter_Notify_Program {
   static Object lock = new Object();
    public static void main(String[] args) {
        Thread waiterThread=new Thread(()->{
            synchronized (lock){
                System.out.println("Waiting the thread to be executed");
                try {
                    lock.wait();
                    System.out.println("waiting is completed by notifying");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread waiterThread1=new Thread(()->{
            synchronized (lock){
                System.out.println("Waiting the thread to be executed");
                try {
                    lock.wait();
                    System.out.println("waiting is completed by notifying");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread notifyThread=new Thread(()->{
            synchronized (lock){
                System.out.println("Notifying the thread to be executed");
                lock.notifyAll();
            }
        });
        waiterThread.start();
        waiterThread1.start();
        notifyThread.start();
    }
}
