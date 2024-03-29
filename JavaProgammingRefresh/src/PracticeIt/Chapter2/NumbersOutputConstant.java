package PracticeIt.Chapter2;

public class NumbersOutputConstant {
    public static final int LENGTH = 6;
    public static final int WIDTH = 10;
    public static void main(String[] args) {

        for (int i = 1; i <= LENGTH; i++){
            for (int j = 1; j < WIDTH; j++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 1; i <= LENGTH; i++){
            for (int j = 1; j <= WIDTH; j++){
                System.out.print(j%WIDTH);
            }
        }
    }
}
