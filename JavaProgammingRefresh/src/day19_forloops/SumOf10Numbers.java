package day19_forloops;

import java.util.Scanner;

public class SumOf10Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int result = 0;

        for (int i = 0; i <= 10; i++){
            System.out.println("Enter number: " + i);
            result += scanner.nextInt();
        }

        System.out.println("result = " + result);
    }
}
