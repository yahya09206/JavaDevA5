package PracticeIt.Chapter4;

import java.util.Scanner;

public class EvenSumMax {
    public static void main(String[] args) {

        evenSum();
    }
    public static void evenSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many integers? ");
        int nums = scanner.nextInt();
        int sum = 0;
        int max = -2147483648;

        for (int i = 0; i < nums; i++){
            System.out.print("next integer? ");
            int num = scanner.nextInt();
            if (num % 2 == 0){
                sum += num;
                if (max < num){
                    max = num;
                }
            }
        }
        System.out.println("even sum = " + sum);
        System.out.println("even max = " + max);
    }
}
