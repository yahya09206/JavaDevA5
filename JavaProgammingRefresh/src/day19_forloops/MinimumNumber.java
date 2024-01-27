package day19_forloops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 2147483647;

        for (int i = 0; i < 5; i++){
            System.out.println("Enter a number");
            int num = scanner.nextInt();

            if (num < min){
                min = num;
            }
        }

        System.out.println("max = " + min);
        scanner.close();
    }
}
