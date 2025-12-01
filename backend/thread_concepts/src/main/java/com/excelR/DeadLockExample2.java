package com.excelR;

public class DeadLockExample2 {
    public static void main(String[] args) {
        Bike1 bike1=new Bike1();
        Bike2 bike2=new Bike2();

        Thread t1=new Thread(()->{bike1.runBike1(bike2);});
        Thread t2=new Thread(()->{bike2.runBike2(bike1);});
        t1.start();
        t2.start();
    }
}

class Bike1{
    public synchronized  void runBike1(Bike2 bike2){
        System.out.println("runBike1");
        bike2.ego();
    }
    public synchronized  void ego(){
        System.out.println("ego of Bike 1 person");
    }

}
class Bike2{
    public synchronized  void ego(){
        System.out.println("ego of Bike 2 person");
    }
    public synchronized  void runBike2(Bike1 bike1){
        System.out.println("runBike2");
        bike1.ego();
    }
}