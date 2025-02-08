package day23_arrays;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] nums = {4,34,3,45,32,6,18};
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i <= nums.length - 1; i++){
            int each = nums[i];
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
