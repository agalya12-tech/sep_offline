package com.excelR.ListProgram;

import java.util.*;
public class StudentMain {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        list.add(new Student("Prasad",97.9));
        list.add(new Student("Balu",98.9));
        list.add(new Student("Gopi",97.9));
        list.add(new Student("David",99.9));
        list.add(new Student("Jack",88.9));
        System.out.println(list);
//        list.sort((s1,s2)->{
//        return    s1.compareTo(s2);
//        });
        Collections.sort(list);
        System.out.println(list);


    }
}
