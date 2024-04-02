package PracticeIt.Chapter2;

public class SlashFigure {
    public static void main(String[] args) {


        for (int line = 1; line <= 6; line++){
            for (int i = 0; i < 2 * line - 2; i++){
                System.out.print("\\");
            }
            for (int j = 0; j < -4 * line + 26; j++){
                System.out.print("!");
            }
            for (int i = 0; i < 2 * line - 2; i++){
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
