package PracticeIt.Chapter3;

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        processName(new Scanner("Sammy Jankis"));
    }
    public static void processName(Scanner scanner){

        System.out.println("Please enter your full name: ");
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.print("Your name in reverse order is " + lastName + ", " + firstName);

    }
}
