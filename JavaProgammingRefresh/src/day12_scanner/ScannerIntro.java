package day12_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println("addition = " + addition);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);


    }
}
