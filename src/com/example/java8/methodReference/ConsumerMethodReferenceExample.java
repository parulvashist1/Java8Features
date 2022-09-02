package com.example.java8.methodReference;

import com.example.java8.data.Student;
import com.example.java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = p -> System.out.println(p);

    /**
     * ClassName:: MethodName
     * @param args
     */
    static Consumer<Student> c2 = System.out::println;

    static Consumer<Student> c3 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c3);
    }
}
