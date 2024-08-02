package day23_arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int[] numbers = new int[scanner.nextInt()];
        int sum = 0;

        for (int i = 0; i <= numbers.length - 1; i++){
            System.out.println("Enter a number");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println(sum);
        double average = (double) sum / numbers.length;
        System.out.println(average);
    }
}
