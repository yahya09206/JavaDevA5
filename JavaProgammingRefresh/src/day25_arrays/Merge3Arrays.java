package day25_arrays;

import java.util.Arrays;

public class Merge3Arrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3},
                arr2 = {4, 5, 6},
                arr3 = {7, 8, 9, 12, 13, 14};

        int[] arr4 = new int[arr1.length + arr2.length + arr3.length];

        int j = 0;
        for (int i = 0; i <= arr1.length - 1; i++){
            arr4[j++] = arr1[i];
        }

        for (int i = 0; i <= arr2.length - 1; i++){
            arr4[j++] = arr2[i];
        }

        for (int i = 0; i <= arr3.length - 1; i++){
            arr4[j++] = arr3[i];
        }

        System.out.println(Arrays.toString(arr4));
    }
}
