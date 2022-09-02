package com.example.java8.functionalInterfaces;

import com.example.java8.data.Student;
import com.example.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activites) -> System.out.println(name + " : " + activites);

    BiPredicate<Integer,Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa >=3.9;

    Consumer<Student> studentConsumer = (student) -> {

        if (p1.and(p2).test(student))
            studentBiConsumer.accept(student.getName(), student.getActivities());
    };

    // Consumer biPredicate
    Consumer<Student> studentConsumer1 = (student) -> {

        if (biPredicate.test(student.getGradeLevel(),student.getGpa()))
            studentBiConsumer.accept(student.getName(), student.getActivities());
    };

    public void nameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);

    }

        // with Bipredicate
    public void nameAndActivitiesWithBiPredicate(List<Student> studentList) {
        studentList.forEach(studentConsumer1);

    }
    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().nameAndActivities(studentList);

        new PredicateAndConsumerExample().nameAndActivitiesWithBiPredicate(studentList);

    }
}
