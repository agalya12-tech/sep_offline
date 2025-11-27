package com.excelR;

public class SleepPhase {
    public static void main(String[] args) {

        Thread thread=new Thread(
                ()->{
                   System.out.println("thread is started running");
                   try {
                       Thread.sleep(5000);
                   }catch (InterruptedException e){}
                   System.out.println("thread is finished running");
                }
        );
        thread.start();
    }
}
