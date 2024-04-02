package PracticeIt.Chapter2;

public class DollarFigure {
    public static void main(String[] args) {

        for (int line = 1; line <= 7; line++){
            for (int i = 0; i < 2 * line -2; i++){
                System.out.print("*");
            }
            for (int i = 7; i > line - 1; i--){
                System.out.print("$");
            }
            for (int i = 0; i < -2 * line + 16; i++){
                System.out.print("*");
            }
            for (int i = 7; i > line - 1; i--){
                System.out.print("$");
            }
            for (int i = 0; i < 2 * line -2; i++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
