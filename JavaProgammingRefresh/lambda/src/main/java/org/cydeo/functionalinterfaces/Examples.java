package org.cydeo.functionalinterfaces;

import java.util.function.Predicate;

public class Examples {
    public static void main(String[] args) {

        Predicate<Integer> lesserThan = a -> a < 18;
        Boolean result = lesserThan.test(50);
        System.out.println(result);
    }
}
