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
    }
}
