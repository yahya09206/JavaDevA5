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

        // loop through numbers that were entered by user
        for (int i = 0; i <= nums.length - 1; i++){
            System.out.println("Enter a number");
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        System.out.println("sum = " + sum);
        double average = (double) sum / nums.length;
        System.out.println("average = " + average);
    }
}
