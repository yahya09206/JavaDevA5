package PracticeIt.Chapter2;

public class NumbersOutput60 {
    public static final int RANGE_OF_NUMBERS = 5;
    public static final int NUMBER_OF_REPITITIONS = 7;


    public static void main(String[] args) {

        // repeat 6 times on same line
        for (int i = 0; i < 6; i++){
            // after every 10 spaces print out a |
            for (int j = 0; j < 9; j++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 1; i <= 60; i++){
            System.out.print(i%10);
        }
    }
}
