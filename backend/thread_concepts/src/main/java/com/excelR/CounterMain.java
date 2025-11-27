package com.excelR;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter=new Counter();
        Thread thread=new Thread(()->{
            for(int i=1;i<=10;i++){
               counter.increment();
            }
                System.out.println(counter.getCount()+" is count");
        });
        thread.start();
    }
}






class Counter{
    private int count;

    public void increment(){
        this.count++;
    }
    public int getCount(){
        return count;
    }
}