package PracticeIt.Chapter3;

import java.util.Scanner;

public class InputBirthday {
    public static void main(String[] args) {

    }
    public static void inputBirthday(Scanner scanner){

        System.out.print("On what day of the month were you born? ");
        int day = scanner.nextInt();
        System.out.print("What is the name of the month in which you were born? ");
        String month = scanner.next();
        System.out.print("During what year were you born? ");
        int year = scanner.nextInt();

        System.out.println("You were born on " + month + " " + day + ", " + year + ". You're mighty old!");
    }
}
