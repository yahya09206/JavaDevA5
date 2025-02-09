package day24_arrays;

import java.util.Arrays;

// will be reviewing
public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        // use toCharArray to split by characters
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        // sort characters
        Arrays.sort(char1);
        Arrays.sort(char2);

        // boolean to compare values using Arrays.equals
        boolean isAnagram = Arrays.equals(char1, char2);
        System.out.println("isAnagram = " + isAnagram);
    }
}
