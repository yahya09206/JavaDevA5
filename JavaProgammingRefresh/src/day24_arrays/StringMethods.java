package day24_arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "I love learning java programming language";
        // split it up into an array
        String[] words = str.split(" ");

        System.out.println("Arrays.toString(str) = " + Arrays.toString(words));
        System.out.println("words.length = " + words.length);


        // loop through split up array
        for (int i = words.length - 1; i >= 0; i--){
            // print each word with space in between
            System.out.print(words[i] + " ");
        }
    }
}
