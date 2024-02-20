package day23_arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] numbers = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tonny", "John", "Amy"};

        for (int i = 0; i <= numbers.length - 1; i++){
            System.out.println(names[i] + " Grade: " + numbers[i]);
        }
    }
}
