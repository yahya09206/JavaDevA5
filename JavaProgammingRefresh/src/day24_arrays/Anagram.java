package day24_arrays;

import java.util.Arrays;

// will be reviewing
public class Anagram {
    public static void main(String[] args) {

        String word1 = "heart";
        String word2 = "earth";

        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        boolean isAnagram = Arrays.equals(str1, str2);

        System.out.println("isAnagram = " + isAnagram);
    }
}
