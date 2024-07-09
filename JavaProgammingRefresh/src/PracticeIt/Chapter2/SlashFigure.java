package PracticeIt.Chapter2;

public class SlashFigure {
    public static void main(String[] args) {

        for (int line = 1; line <= 6; line++){
            for (int i = 1; i <= 2 * line - 2; i++){
                System.out.print("\\");
            }
            for (int i = 1; i <= -4 * line + 26; i++){
                System.out.print("!");
            }
            for (int i = 1; i <= 2 * line - 2; i++){
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
