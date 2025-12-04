package com.excelR.queueProgram;
import java.util.LinkedList;
import java.util.Queue;
public class QueueProgram1 {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
//        System.out.println(q.element()); NSEException  q.peek()-null
//        q.remove();//NSEException    q.poll()-null
        q.add("One");
        q.add("Two");
        q.add("Three");
        q.add("Four");
        q.add("Five");
        q.offer("Six");
        System.out.println(q);
        System.out.println(q.element()); //One
         q.remove();//One
         System.out.println(q.element());//Two
         System.out.println(q.element());
        System.out.println(q);

    }
}
