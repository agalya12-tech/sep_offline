package com.excelR.ListProgram;

public class Student  implements   Comparable<Student>{
    String name;
    double marks;
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]\n";
    }

    @Override
    public int compareTo(Student s1) {
        Student s2=this;
        int num =Double.compare(s1.marks,s2.marks);
        if(num==0){
            num= s2.name.compareTo(s1.name);
        }
        return num;
    }
}
