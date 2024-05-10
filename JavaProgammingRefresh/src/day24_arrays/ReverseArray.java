package day24_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        // new array to store reversed values
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--){
            // need to iterate through reversed array
            reversedArray[j++] += array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));

    }
}
