package day25_arrays;

import java.util.Arrays;

public class ForeachLoopPractice {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E"};
        String[] arr3 = new String[arr1.length + arr2.length];

        int j = 0;
        for (String a1 : arr1) {
            arr3[j++] = a1;
        }

        for (String a2 : arr2) {
            arr3[j++] = a2;
        }

        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));


        System.out.println("------------------");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int countOdd = 0,
                countEven = 0;

        for (int number : numbers) {
            if (number % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println(countEven);
        System.out.println(countOdd);
    }
}
