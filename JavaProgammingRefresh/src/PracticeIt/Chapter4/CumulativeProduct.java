package PracticeIt.Chapter4;

import java.util.Scanner;

public class CumulativeProduct {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int nums = scanner.nextInt();
        int product = 1;
        for (int i = 1; i <= nums; i++){
            System.out.print("Next number --> ");
            int num = scanner.nextInt();
            product *= num;
        }

        System.out.println("Product = " + product);
    }
}


