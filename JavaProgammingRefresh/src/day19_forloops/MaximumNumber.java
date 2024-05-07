package day19_forloops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // min number allowed in java
        int max = -214748364;

        // ask user for a number 5 times
        for (int i = 0; i < 5; i++){
            System.out.println("Enter a number");
            // store number in a variable
            int num = scanner.nextInt();

            // check whether the user number is greater than the max number, if so then store it in the num variable
            if (num > max){
                max = num;
            }
        }

        System.out.println("Maximum number is " + max);
    }
}
