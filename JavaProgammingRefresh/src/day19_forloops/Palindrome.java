package day19_forloops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String word = new Scanner(System.in).next();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }

        boolean isPalindrome = reversedWord.equals(word);

        System.out.println("isPalindrome = " + isPalindrome);
    }
}
