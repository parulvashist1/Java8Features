package com.example.java8.lamdasTest;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value = 4;
    public static void main(String[] args) {
        //int value = 4;
        Consumer<Integer> c1 = (i) -> {

            //value++; // you are not allow to change local variable i.e.final or effectively final
            value++; // allow to change instance variable i.e.final or effectively final
            System.out.println(value+i);
        };

        // value = 5 // // you are not allow to change local variable i.e.final or effectively final
        value =5; // // allow to change instance variable i.e.final or effectively final

        c1.accept(4);
    }
}
