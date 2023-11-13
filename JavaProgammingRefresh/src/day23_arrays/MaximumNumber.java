package day23_arrays;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 400, 50, 0, -1};
        int max = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++){
            int each = numbers[i];
            if (each > max){ // if any greater number is checked
                max = each;
            }
        }
    }
}
