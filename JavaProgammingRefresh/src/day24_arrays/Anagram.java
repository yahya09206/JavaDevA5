package day24_arrays;

import java.util.Arrays;

// will be reviewing
public class Anagram {
    public static void main(String[] args) {

        String word1 = "heart";
        String word2 = "whoa";

        // split letters and then sort
        char[] split1 = word1.toCharArray();
        char[] split2 = word2.toCharArray();

        Arrays.sort(split1);
        Arrays.sort(split2);

        // verify with boolean
        boolean isAnagram = Arrays.equals(split1, split2);

        System.out.println("isAnagram = " + isAnagram);
    }
}
