package day23_arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "March", "April", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 1 && n <= 12){
            System.out.println(months[n-1]);
        } else {
            System.out.println("Invalid Number");
        }
    }
}
