package PracticeIt.Chapter2;

public class DollarFigureTwo {
    public static final int HEIGHT = 3;
        public static void main(String[] args) {

            for (int line = 1; line <= HEIGHT; line++){
                for (int  i = 1; i <=  2 * line - 2; i++){
                    System.out.print("*");
                }
                for (int i = 1; i <= -1 * HEIGHT + 8; i++){
                    System.out.print("$");
                }
                for (int i = 1; i <= -2 * HEIGHT + 16; i++){
                    System.out.print("*");
                }
                for (int i = 1; i <= -1 * HEIGHT + 8; i++){
                    System.out.print("$");
                }
                for (int  i = 1; i <=  2 * line - 2; i++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
