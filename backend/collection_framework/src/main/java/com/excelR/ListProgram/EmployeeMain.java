package com.excelR.ListProgram;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add( new Employee("Alice",345465654));
        list.add( new Employee("Emil",785434455));
        list.add( new Employee("Carl",895645445));
        list.add( new Employee("Bob",345345234));
        list.add( new Employee("David",56787454));
        list.add( new Employee("Carl",995645445));
    }
}
