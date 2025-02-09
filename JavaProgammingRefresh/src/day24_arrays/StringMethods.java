package day24_arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "I love learning java programming language";
        String[] words = str.split(" ");

        System.out.println("Arrays.toString(str) = " + Arrays.toString(words));
        System.out.println("words.length = " + words.length);


        for (int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
    }
}
