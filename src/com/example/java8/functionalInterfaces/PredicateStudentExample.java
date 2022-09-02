package com.example.java8.functionalInterfaces;

import com.example.java8.data.Student;
import com.example.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> ps = (student) -> student.getGradeLevel() >=3;
    static Predicate<Student> ps1 = (student) -> student.getGpa() >=3.9;

    public static void filterStudentByGradeLevel(){
        System.out.println("Student filter on Grade Level");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(ps.test(student))
                System.out.println("student : " + student);
        });
    }

    public static void filterStudentByGpa(){
        System.out.println("Student filter on GPA Level");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(ps1.test(student))
                System.out.println("student : " + student);
        });
    }


    public static void filterStudentByGradeAndGpa(){
        System.out.println("Student filter on Grade and GPA Level");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(ps.and(ps1).test(student))
                System.out.println("student : " + student);
        });
    }
    public static void main(String[] args) {

        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudentByGradeAndGpa();

    }
}
