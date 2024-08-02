package day25_arrays;

import java.util.Arrays;

public class ForeachLoopPractice {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C", "D"},
                arr2 = {"E", "F", "G"};
        String[] arr3 = new String[arr1.length + arr2.length];

        int j = 0;
        for (String each : arr1) {
            arr3[j++] = each;
        }

        for (String each : arr2) {
            arr3[j++] = each;
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------------");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int countOdd = 0,
                countEven = 0;

        for (int number : numbers) {
            if (number % 2 == 0){
                countEven++;
            }else {
                countOdd++;
            }
        }

        System.out.println(countEven);
        System.out.println(countOdd);
    }
}
