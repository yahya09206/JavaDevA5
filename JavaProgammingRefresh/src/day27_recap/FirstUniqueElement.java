package day27_recap;

public class FirstUniqueElement {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4};
        // store first unique element in variable
        int firstUniqueElement = 0;


        // outer loop to keep repeating inner loop
//        for (int j = 0; j <= nums.length - 1; j++){
//            // inner loop to count freq of one number
//            int frequency = 0;
//            for (int i = 0; i <= nums.length - 1; i++){
//                if (nums[i] == nums[j]){
//                    frequency++;
//                }
//            }
//
//            if (frequency == 1){
//                firstUniqueElement = nums[j];
//            }
//        }

        // using for each loop
        for (int each : nums){
            // inner loop to count freq of one number
            int frequency = 0;
            for (int element : nums){
                if (element == each){
                    frequency++;
                }
            }

            if (frequency == 1){
                firstUniqueElement = each;
            }
        }

        System.out.println("firstUniqueElement = " + firstUniqueElement);
    }
}
