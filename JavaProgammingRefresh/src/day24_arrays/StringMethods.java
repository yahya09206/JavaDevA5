package day24_arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String sentence = "I love learning java programming language";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
    }
}
