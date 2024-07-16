package PracticeIt.Chapter3;

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        processName(new Scanner("Sammy Jankis"));
    }
    public static void processName(Scanner scanner){

        System.out.print("Please enter your full name: ");
        String name = scanner.nextLine();

        String lastName = name.substring(name.indexOf(" "), name.length());
        String fullName = lastName + ", " + name.substring(0, name.indexOf(" "));
        System.out.println("Your name in reverse order is" + fullName);

    }
}
