package day23_arrays;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers = {1, 34, -5, 1000, 3343, 3};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++){
            int each = numbers[i];

            if (max < each){
                max = each;
            }

            if (min > each){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
