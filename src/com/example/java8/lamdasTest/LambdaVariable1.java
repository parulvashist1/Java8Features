package com.example.java8.lamdasTest;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {

        int i=0;
        Consumer<Integer> c1 = (i1) -> { // cant use local variable as "i"
            //int i =2; // can;t define same local variable
            System.out.println("Integer value is " + i);
        };


    }
}
