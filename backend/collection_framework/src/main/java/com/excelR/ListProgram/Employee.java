package com.excelR.ListProgram;

public class Employee {
    String name;
    long phone;

    public Employee(String name,long phone){
        this.name=name;
        this.phone=phone;
    }

    @Override
    public String toString() {
        return  "Employee [name=" + name + ", phone=" + phone + "]\n";
    }
}
