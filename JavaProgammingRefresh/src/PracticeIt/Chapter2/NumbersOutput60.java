package PracticeIt.Chapter2;

public class NumbersOutput60 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++){
            for (int j = 1; j < 10; j++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(j%10);
            }
        }
    }
}
