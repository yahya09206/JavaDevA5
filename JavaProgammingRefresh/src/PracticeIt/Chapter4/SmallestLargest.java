package PracticeIt.Chapter4;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        smallestLargest();
    }

    public static void smallestLargest(){

        int min = 2147483647;
        int max = -2147483648;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int numEnter = scanner.nextInt();

        for (int i = 1; i <= numEnter; i++){
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();

            if (num < min){
                min = num;
            }
            if (max < num){
                max = num;
            }
        }
        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
    }
}
