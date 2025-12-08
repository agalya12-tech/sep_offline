package com.excelR.java8Features;

public class InnerAnnonymousClassProgram {
    public static void main(String[] args) {
//        Interface1 i=()->System.out.println("hello");
//        i.m1();
        Interface1 i1=new Interface1() {
            @Override
            public void m1() {
                System.out.println("hello from m1 method of inner anonymous class");
            }

            @Override
            public void m2() {

            }
        };



        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("overriding run method using inner anonymous class");
            }
        };
        r.run();

    }
}
interface Interface1{
    void m1();
    void m2();


}
