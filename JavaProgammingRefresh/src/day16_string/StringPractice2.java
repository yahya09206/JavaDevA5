package day16_string;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two words");

        String word1 = scanner.next();
        String word2 = scanner.next();

        if (word1.length() >= 2 && word2.length() >= 2){
            String result = word1.substring(1) + word2.substring(1);
            System.out.println(result);
        } else {
            System.out.println("Too short");
        }

        scanner.close();
    }
}
