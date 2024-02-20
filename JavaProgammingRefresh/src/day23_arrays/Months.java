package day23_arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] months = {"Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.print("Please select a Number: ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12){
            System.out.println(months[month - 1]);
        } else {
            System.out.println("Invalid Number");
        }

    }
}
