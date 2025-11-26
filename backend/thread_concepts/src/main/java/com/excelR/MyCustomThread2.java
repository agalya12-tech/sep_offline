package com.excelR;

public class MyCustomThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyCustomThread2 run method");
    }

    public static void main(String[] args) {
        Thread r=new MyCustomThread2();//new phase
        System.out.println(r);
//        r.run();
          r.start();//--->start() calls run()  new ---->runnable phase
    }
}
