package com.example.java8.ImperativeVsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /**
         * Imperative - how style of programming
         */
        int sum = 0;
        for(int i=0; i<=100; i++){
            sum +=i;
        }

        System.out.println("Sum of Imperative approach :" + sum);
        /**
         * Declarative - what style of programming
         */
        int sum1 = IntStream.rangeClosed(0,100)
                .parallel() // for multithreaded env as it splits the value and gives results
                .sum();
        System.out.println("Sum of Declarative approach :" + sum1);




    }
}
