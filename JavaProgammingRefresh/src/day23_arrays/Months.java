package day23_arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
        System.out.println("Please select a number 1 - 12");
        int selection = scanner.nextInt();

        System.out.println(months[selection - 1]);


    }
}
