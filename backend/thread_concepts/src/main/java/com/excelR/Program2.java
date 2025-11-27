package com.excelR;

public class Program2 {
    public static void main(String[] args) {
        Runnable r=()->{
            System.out.println(Thread.currentThread().getState());//Runnable
            for(int i=0;i<100;i++) {
                System.out.print(i+" ");
            }
        };
//        r.run();
        Thread thread=new Thread(r);
        System.out.println(thread.getState()); //New State
        thread.start();//  start()----run()

//        thread.stop();

    }
}
