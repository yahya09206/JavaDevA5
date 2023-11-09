package day13_scanner2;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        // import scanner
        Scanner scan = new Scanner(System.in);

        // Cents to Dollars
        System.out.println("Enter Cents");
        int cents = scan.nextInt();
        double dollarAmount = cents / 100;
        int remainder = cents % 100;

        if (remainder == 0){
            System.out.println(cents + " is equal to " + dollarAmount + " dollars");
        }

    }
}
