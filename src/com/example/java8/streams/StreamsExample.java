package com.example.java8.streams;

import com.example.java8.data.Student;
import com.example.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        // student name and there activities in a map
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentGpaPredicate = (student -> student.getGpa()>=3.9);

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                //.filter((student -> student.getGradeLevel()>=3))
                .filter(studentPredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }
}
