package com.excelR.java8Features;

import java.util.Optional;

public class OptionalClassProgram2 {

    public static void main(String[] args) {
//     Optional<Employee> emp =getEmployee();
     Optional<Employee> emp =getEmployee2();
     if(emp.isPresent()){
         System.out.println(emp.get().email);
     }
    }
    public static Optional<Employee>getEmployee() {
        return Optional.ofNullable(new Employee("raj","raj@gmail.com"));
    }public static Optional<Employee>getEmployee2() {
        return Optional.ofNullable(null);
    }


//     It causes Null pointer Exception when we return null value
//    public static void main(String[] args) {
//        Employee emp = getEmployee();
//        System.out.println(emp.email);
//        Employee emp2 = getEmployee2();
//        System.out.println(emp2.email);
//    }
//
//    public static Employee getEmployee() {
//        return new Employee("raj","raj@gmail.com");
//    }
//    public static Employee getEmployee2() {
//        return null;
//    }
}







class Employee{
    String name;
    String email;

    @Override
    public String toString() {
        return "Employee : name=" + name + ", email=" + email;
    }
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
}