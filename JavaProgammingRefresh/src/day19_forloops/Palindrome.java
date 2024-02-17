package day19_forloops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String name = scanner.next();
        String reversedName = "";
        boolean isPalindrome = false;

        for (int i = name.length() - 1; i >= 0; i--){
            char each = name.charAt(i);
            reversedName += each;

            if (reversedName.equals(name)){
                isPalindrome = true;
            }
        }

        System.out.println(isPalindrome);
    }
}
