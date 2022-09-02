package com.example.java8.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicate = (i) -> {return i%2==0;};
    static Predicate<Integer> predicate1 = (i) -> i%2==0;
    static Predicate<Integer> predicate2 = (i) -> i%5==0;

    public static void predicateAdd(){
        System.out.println("Result of predicate add : " + predicate1.and(predicate2).test(10));
        System.out.println("Result of predicate add : " + predicate1.and(predicate2).test(8));
    }

    public static void predicateOr(){
        System.out.println("Result of predicate or : " + predicate1.or(predicate2).test(10));
        System.out.println("Result of predicate or : " + predicate1.or(predicate2).test(8));
    }

    public static void predicateNegate(){
        System.out.println("Result of predicate negate : " + predicate1.or(predicate2).negate().test(10));
        System.out.println("Result of predicate or : " + predicate1.or(predicate2).negate().test(8));
    }
    public static void main(String[] args) {

        System.out.println(predicate.test(4));

        System.out.println(predicate1.test(4));
        predicateAdd();
        predicateOr();
        predicateNegate();
    }
}
