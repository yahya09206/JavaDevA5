package day23_arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("Enter a number: ");
        int n = new Scanner(System.in).nextInt();

        System.out.println(months[n - 1]);
    }
}
