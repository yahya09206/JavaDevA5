package day23_arrays;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers = {1, -4, 33, 2, 45, 54, 3, 62, 3, 22, 4, -11};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++){

            if (numbers[i] > max){
                max = numbers[i];
            }

            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
