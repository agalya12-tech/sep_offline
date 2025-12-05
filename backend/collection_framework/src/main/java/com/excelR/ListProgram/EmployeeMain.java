package com.excelR.ListProgram;

import java.lang.reflect.Array;
import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {

//        List<String>li=new ArrayList<>(Arrays.asList("Alice","David","Bob","Carol"));
//        System.out.println(li);
//        Collections.sort(li); // ascending order
//        System.out.println(li);




        List<Employee> list= new ArrayList<>();
        list.add( new Employee("Alice",345465654));
        list.add( new Employee("Emil",785434455));
        list.add( new Employee("Carl",895645445));
        list.add( new Employee("Bob",345345234));
        list.add( new Employee("David",56787454));
        list.add( new Employee("Carl",995645445));


    }
}
