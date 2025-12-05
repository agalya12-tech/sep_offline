package com.excelR.ListProgram;

import java.lang.reflect.Array;
import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {

//        List<String>li=new ArrayList<>(Arrays.asList("Alice","David","Bob","Carol"));
//        System.out.println(li);
//        Collections.sort(li); // ascending order
//        System.out.println(li);


//        System.out.println("Alice".compareTo("Bob"));//-1
//        System.out.println("David".compareTo("Bob"));//2
//        System.out.println("Bob".compareTo("Bob"));//0







        List<Employee> list= new ArrayList<>();
        list.add( new Employee("Alice",345465654));
        list.add( new Employee("Emil",785434455));
        list.add( new Employee("Carl",895645445));
        list.add( new Employee("Bob",345345234));
        list.add( new Employee("David",56787454));
        list.add( new Employee("Carl",4565464));
        System.out.println(list);
        Comparator<Employee>comparator=(e1,e2)->{
            int num= e1.name.compareTo(e2.name);
            if(num==0){
               num= Long.compare(e1.phone,e2.phone);
            }
            return num;
        };
//        list.sort(comparator);
        Collections.sort(list,comparator);
        System.out.println(list);


    }
}
