package com.rahul.sort;

import java.util.*;

class Student{
    private int id;
    private String name;
    private long salary;

    public Student() {
    }

    public Student(int id, String name, long salary) {
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
}
class CustomComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getSalary() == s2.getSalary())
            return 0;
        else if(s1.getSalary() > s2.getSalary())
            return 1;
        return -1;
    }
}
public class SortStudentUsingComparator {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1,"Rahul",50),
                new Student(2,"Mohit",80),
                new Student(3,"Kunal",10),
                new Student(4,"Rohit",40),
                new Student(5,"Sweta",20)
        );
        Collections.sort(students,new CustomComparator());

        System.out.println(students);

    }
}
