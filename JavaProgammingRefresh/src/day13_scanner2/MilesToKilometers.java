package day13_scanner2;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Miles");
        double miles = scan.nextDouble();
        double km = miles * 1.609;

        System.out.println(miles + " miles equal to " + km + " kilometers");
    }
}
