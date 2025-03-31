package com.rahul.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{
    private int id;
    private String name;
    private long salary;

    public Student1() {
    }

    public Student1(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Student1 that) {
        if(this.getSalary() == that.getSalary())
            return 0;
        else if(this.getSalary() > that.getSalary())
            return 1;
        return -1;
    }
}
public class SortStudentUsingComparable {
    public static void main(String[] args) {
        List<Student1> students = Arrays.asList(
                new Student1(1,"Rahul",50),
                new Student1(2,"Mohit",80),
                new Student1(3,"Kunal",10),
                new Student1(4,"Rohit",40),
                new Student1(5,"Sweta",20)
        );
        Collections.sort(students);

        System.out.println(students);

    }
}
