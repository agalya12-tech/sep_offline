package com.excelR.java8Features;

public class DefaultMethodProgram {
}

interface Demo{
    static  void m2(){
    System.out.println("static in parent");
    }
    default void m3(){
        System.out.println("default in parent");
    }
}

class DemoChild implements Demo{
    @Override
    public void m3() {
        System.out.println("default method can override  in child ," +
                " but default keyword will erase" +
                "it used to breakdown implementation chain with child");
    }
}



//class Demo{
//    public void m1(){
//           non static method allowed
//    }
//    public static  void m2(){
//           static method allowed
//    }
//    default void m3(){
//        //default method is not allowed in class
//    }
//}