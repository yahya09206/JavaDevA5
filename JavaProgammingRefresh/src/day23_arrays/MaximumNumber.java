package day23_arrays;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] maxNumber = {1, -4, 33, 2, 45};
        int max = -2147483648;
        int min = 2147483647;

        for (int i = 0; i <= maxNumber.length - 1; i++){
            if (maxNumber[i] > max){
                max = maxNumber[i];
            }

            if (maxNumber[i] < min){
                min = maxNumber[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
