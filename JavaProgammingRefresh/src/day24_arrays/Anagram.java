package day24_arrays;

import java.util.Arrays;

// will be reviewing
public class Anagram {
    public static void main(String[] args) {

        String word1 = "care";
        String word2 = "race";

        char[] newWord1 = word1.toCharArray();
        char[] newWord2 = word2.toCharArray();

        Arrays.sort(newWord1);
        Arrays.sort(newWord2);

        System.out.println(Arrays.equals(newWord1, newWord2));
    }
}
