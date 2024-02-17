package day19_forloops;

import java.util.Scanner;

public class SumOf10Numbers {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);

        System.out.println();
        System.out.println("-----------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int sum2 = 0;


        for (int i = 1; i <= num; i++){
            sum2 += i;
        }

        System.out.println("sum2 = " + sum2);
    }
}
