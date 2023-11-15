package day25_arrays;

public class ForeachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("-----------------------------");

        String[] names = {"Ahmet", "Boburbek", "Farid", "Robinson"};

        for (String each : names) {
            System.out.println(each);
        }
    }
}
