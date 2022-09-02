package com.example.java8.lamdasTest;

import java.util.Comparator;

public class ComparatorLamdaExample {

    public static void main(String[] args) {

        /**
         * prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 if o1 =02
            }                           // 1 if o1 >02
        };                              // -1 if o1 <02


        System.out.println("result of comparator : " + comparator.compare(3,2));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("result of comparator lambda: " + comparatorLambda.compare(3,2));

        Comparator<Integer> comparatorLambda1 = ( a, b) -> a.compareTo(b);

        System.out.println("result of comparator lambda: " + comparatorLambda1.compare(3,2));
    }
}
