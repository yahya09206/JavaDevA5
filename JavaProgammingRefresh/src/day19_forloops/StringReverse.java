package day19_forloops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.next();
        String reversedName = "";

        for (int i = name.length() - 1; i >= 0; i--){
            reversedName += name.charAt(i);
        }

        System.out.println("reversedName = " + reversedName);

    }
}
