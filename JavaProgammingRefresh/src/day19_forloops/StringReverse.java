package day19_forloops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.next();
        String reversedName = "";

        for (int i = name.length() - 1; i >= 0; i--){
            char each = name.charAt(i);
            reversedName += each;
        }

        System.out.println(reversedName);

    }
}
