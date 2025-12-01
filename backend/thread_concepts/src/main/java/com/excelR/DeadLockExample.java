package com.excelR;

public class DeadLockExample {
    public static void main(String[] args) {
        Car1 car1=new Car1();
        Car2 car2=new Car2();

        Thread t1=new Thread(()->{car1.runCar1(car2);});
        Thread t2=new Thread(()->{car2.runCar2(car1);});
        t1.start();
        t2.start();
    }

    /*
    * car1.runcar1():
    *                Car1 moving
    *
    * car2.runcar2():
    *                Car2 moving
    *
    *
    * */

}
class Car1{
    public synchronized void runCar1(Car2 car2){
        System.out.println("Car1 moving");
        car2.ego();
    }
      public synchronized void ego(){
          System.out.println("ego of car1");
      }
}
class Car2{
    public synchronized void runCar2(Car1 car1){
        System.out.println("Car2 moving");
        car1.ego();
    }
    public synchronized void ego(){
        System.out.println("ego of car2");
    }
}
