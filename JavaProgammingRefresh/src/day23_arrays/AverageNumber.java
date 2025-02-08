package day23_arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter? ");
        int[] nums = new int[scanner.nextInt()];
        int sum = 0;

        for (int i = 0; i <= nums.length - 1; i++){
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        System.out.println("sum = " + sum);
        double average = (double) sum / nums.length;
        System.out.println("average = " + average);
    }
}
