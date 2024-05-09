package day23_arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("Please enter a number");
        int num = new Scanner(System.in).nextInt();

        // Subtract one from users input to print out the correct month
        // Verify first that user is entering correct number
        if (num >= 1 && num <= 12){
            System.out.println(months[num - 1]);
        } else {
            System.out.println("Invalid number");
        }
    }
}
