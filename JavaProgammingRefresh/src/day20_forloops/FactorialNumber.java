package day20_forloops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 1;

        for (int i = num; i >= 1; i--){
            result *= i;
        }

        System.out.println("result = " + result);
    }
}
