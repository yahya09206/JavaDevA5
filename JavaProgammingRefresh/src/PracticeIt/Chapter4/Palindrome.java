package PracticeIt.Chapter4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

    }
    public static void printPalindrome(Scanner scanner){

        System.out.print("Type one or more words: ");
        String word = scanner.nextLine();
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        System.out.println();
        if (reversed.equalsIgnoreCase(word)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
