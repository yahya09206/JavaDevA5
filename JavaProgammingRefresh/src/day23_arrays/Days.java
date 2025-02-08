package day23_arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; // size of 7

        System.out.println("Enter a number: ");
        int n = new Scanner(System.in).nextInt();

        System.out.println(days[n-1]);
    }
}
