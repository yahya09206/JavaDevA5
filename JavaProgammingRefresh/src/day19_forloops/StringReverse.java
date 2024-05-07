package day19_forloops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Declare empty string to store reversed version
        String reversed = "";
        System.out.println("Enter a word");
        String word = scanner.next();

        // loop thru the word
        for (int i = word.length() - 1; i >= 0; i--) {
            // concat each letter of the word backwards into reversed variable
            reversed += word.charAt(i);
        }

        System.out.println(reversed);
    }
}
