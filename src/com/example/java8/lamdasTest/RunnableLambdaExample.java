package com.example.java8.lamdasTest;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        /**
         * prior to Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable");
            }
        };

        new Thread(runnable).start();

        // java 8 lambda  () -> {}

        Runnable runnableLambda = () -> {
            System.out.println("inside runnable lambda");
        };

        new Thread(runnableLambda).start();

        Runnable runnableLambda1 = () -> System.out.println("inside runnable lambda2");

        new Thread(runnableLambda1).start();

        new Thread(()-> System.out.println("inside runnable lambda 4"));

    }
}
