package PracticeIt.Chapter4;

import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What color do you want? ");
        String color = scanner.next();

        switch (color.toLowerCase()){
            case "b":
                System.out.println("You have chosen Blue.");
                break;
            case "r":
                System.out.println("You have chosen Red.");
                break;
            case "g":
                System.out.println("You have chosen Green.");
                break;
            default:
                System.out.println("Unknown color: " + color);

        }
    }
}
