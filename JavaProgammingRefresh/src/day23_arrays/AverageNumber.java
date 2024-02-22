package day23_arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        // assign size of array to be what the user enters
        int[] nums = new int[scanner.nextInt()];
        // variable to count
        int sum = 0;

        for (int i = 0; i <= nums.length - 1; i++){
            // Prompt user for input
            System.out.println("Enter a number");
            // go through index for each number
            nums[i] = scanner.nextInt();
            // add numbers to sum variable
            sum += nums[i];
        }

        System.out.println("sum = " + sum);
        // find average by dividing sum by length of array
        double average = (double) sum / nums.length;
        System.out.println("average = " + average);
    }
}
