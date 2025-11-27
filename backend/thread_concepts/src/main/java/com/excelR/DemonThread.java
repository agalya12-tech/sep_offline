package com.excelR;

public class DemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread daemon=new Thread(()->{
            while(true){
                System.out.println("  Daemon thread ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        daemon.setDaemon(true);
        daemon.start();
        Thread main=new Thread(()->{
            System.out.println(" Non Daemon thread is started running");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
            System.out.println(" Non Daemon thread is finished running");
        });
        main.start();
        main.join();
    }
}
