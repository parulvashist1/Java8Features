package com.example.java8.ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7);

        /**
         * Imperative
         */
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : integerList) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }
        System.out.println("unique list : " + uniqueList);

        /**
         * Declarative
         */
        List<Integer> uniqueList1 = integerList.stream()
                .distinct().collect(Collectors.toList());
        System.out.println("Unique list " + uniqueList1);
    }
}
