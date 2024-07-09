package PracticeIt.Chapter2;

public class DollarFigure {
    public static void main(String[] args) {

        for (int line = 1; line <= 7; line++){
            for (int  i = 1; i <=  2 * line - 2; i++){
                System.out.print("*");
            }
            for (int i = 1; i <= -1 * line + 8; i++){
                System.out.print("$");
            }
            for (int i = 1; i <= -2 * line + 16; i++){
                System.out.print("*");
            }
            for (int i = 1; i <= -1 * line + 8; i++){
                System.out.print("$");
            }
            for (int  i = 1; i <=  2 * line - 2; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
