package day24_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int[] reversed = new int[nums.length];

        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++){
            reversed[j] += nums[i];
        }

        System.out.println("reversed = " + Arrays.toString(reversed));

    }
}
