package day20_forloops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int result = 1; // assign 1 because you can't multiply by 0

        for (int i = number; i >= 1; i--){
            result *= i;
        }

        System.out.println("result = " + result);
    }
}
