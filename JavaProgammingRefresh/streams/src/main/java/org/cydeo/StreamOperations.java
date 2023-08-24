package org.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 2, 3, 9, 6, 15);
        myList.forEach(System.out::println);

        System.out.println("Filter");
        myList.stream().filter(i -> i % 3 == 0)
                .distinct()
                .forEach(System.out::println);

        // Limit
        System.out.println("Limit");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);

        // Skip
        System.out.println("Skip");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .skip(2)
                .forEach(System.out::println);
    }
}
