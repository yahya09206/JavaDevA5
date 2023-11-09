package day13_scanner2;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        // import scanner
        Scanner scan = new Scanner(System.in);

        // Cents to Dollars
        System.out.println("Enter Cents");
        int cents = scan.nextInt();
        int dollarAmount = cents / 100;
        int remainder = cents % 100;

        if (remainder >= 0){
            if (remainder == 0){
                System.out.println(cents + " is equal to " + dollarAmount + " dollars");
            }else {
                System.out.println(cents + "  cents is equal to " + dollarAmount + " dollars and " + remainder + " cents");
            }
        }else {
            System.out.println("Invalid Amount");
        }

    }
}
