package org.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 70);
        // toCollection(Supplier) : is used to create a collection using collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> (x & 2) == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

//        List<Integer> numberSet = numbers.stream()
//                .filter(x -> x % 2 == 0)
//                .collect(Collectors.toCollection(HashSet::new));

    }
}
