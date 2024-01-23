package day16_string;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();

        if (word.length() == 0){
            System.out.println("String is empty");
        } else if (word.length() > 3){
            System.out.println(word.substring(word.length() - 3));
        } else {
            System.out.println(word);
        }

        scan.close();
    }
}
/**
 * Write a method that asks user to enter a string.
 * if the string is empty, print: string is empty
 * if the string has more than 3 character, print the last 3 characters
 * if the string has less than or equal to 3 characters, print the string itself
 */