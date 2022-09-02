package com.example.java8.functionalInterfaces;

import com.example.java8.data.Student;
import com.example.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studentConsumer = (student) -> System.out.println(student);
    static Consumer<Student> studentConsumer2 = (student) -> System.out.print(student.getName());
    static Consumer<Student> studentConsumer1 = (student) -> System.out.println(student.getActivities());

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());

        consumer.accept("java8");
        printStudents();
        printNameAndActivties();
        printNameAndActivtiesUsingCondition();
    }

    public static void printStudents() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    public static void printNameAndActivties() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer2.andThen(studentConsumer1));
    }

    public static void printNameAndActivtiesUsingCondition() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer2.andThen(studentConsumer1));

        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 3) {
                studentConsumer2.andThen(studentConsumer1).accept(student);
                studentConsumer2.andThen(studentConsumer1).andThen(studentConsumer).accept(student);

            }

        });
    }
}
