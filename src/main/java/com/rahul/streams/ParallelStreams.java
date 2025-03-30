package com.rahul.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
public class ParallelStreams {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("David",82),
                new Student("Bob",90),
                new Student("John",65),
                new Student("Canedy",55),
                new Student("Eric",85),
                new Student("Smith",88),
                new Student("Scott",50)
        );

        //using streams - sequencial
        studentList.stream().filter(student->student.getScore()>=80)
                .limit(3)
                .forEach(student -> System.out.println(student.getName() + " " + student.getScore()));

        //using parallel streams
        studentList.parallelStream().filter(student->student.getScore()>=80)
                .limit(3)
                .forEach(student -> System.out.println(student.getName() + " " + student.getScore()));

        //convert stream() --> parallelStream()
        //parallel() method
        studentList.stream().parallel().filter(student->student.getScore()>=80)
                .limit(3)
                .forEach(student -> System.out.println(student.getName() + " " + student.getScore()));

    }
}
