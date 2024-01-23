package day16_string;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two words");

        String word1 = scanner.next();
        String word2 = scanner.next();

        String result = word1.substring(1) + word2.substring(1);

        System.out.println("result = " + result);
    }
}
