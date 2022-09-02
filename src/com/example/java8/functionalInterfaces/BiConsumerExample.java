package com.example.java8.functionalInterfaces;

import com.example.java8.data.Student;
import com.example.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivites() {
        List<Student> studentList = StudentDataBase.getAllStudents();

        BiConsumer<String,List<String>> biConsumer = (name, activities) -> System.out.println(name + ":" + activities);

        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));

    }

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer= (a,b) -> {
            System.out.println("a:" +a +",b: "+b );
        };

        biConsumer.accept("java7","java8");

        BiConsumer<Integer, Integer> mutlply = (a,b) -> {
            System.out.println("a*b : " + a*b);
        };

        BiConsumer<Integer, Integer> division = (a,b) -> {
            System.out.println("a/b : " + a/b);
        };

        mutlply.andThen(division).accept(10,5);
        nameAndActivites();
    }
}
