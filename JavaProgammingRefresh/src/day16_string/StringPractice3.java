package day16_string;

import java.util.Scanner;

public class StringPractice3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word with 3 characters");
        String word = scanner.next();

        if (word.length() == 3){
            if (word.charAt(1) == 'a'){
                System.out.println("cool word");
            } else {
                System.out.println("okay word");
            }
        } else {
            if (word.length() < 3){
                System.out.println("Word is too short");
            }else {
                System.out.println("Word is too long");
            }
        }
        scanner.close();
    }
}
