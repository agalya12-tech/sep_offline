package com.excelR;

public class CounterMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
        Thread thread=new Thread(()->{
            for(int i=1;i<=1000;i++){
               counter.increment();
            }
        });
        Thread thread2=new Thread(()->{
            for(int i=1;i<=1000;i++){
               counter.increment();
            }
        });
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(counter.getCount()+" is count");
    }
}






class Counter{
    private int count;

    public synchronized void increment(){
        this.count++;
    }
    public int getCount(){
        return count;
    }
}