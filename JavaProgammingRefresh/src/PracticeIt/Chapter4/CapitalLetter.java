package PracticeIt.Chapter4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.next();
        if (Character.isUpperCase(phrase.charAt(0))){
            System.out.println("capital");
        } else {
            System.out.println("not capital");
        }
    }
}
