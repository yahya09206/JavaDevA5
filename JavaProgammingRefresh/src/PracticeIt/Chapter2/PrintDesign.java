package PracticeIt.Chapter2;

public class PrintDesign {
    public static void main(String[] args) {
        printDesign();

    }
    public static void printDesign(){

        for (int line = 1; line <= 5; line++){
            for (int i = 1; i <= -1 * line + 6; i++){
                System.out.print("-");
            }
            for (int j = 1; j <= 2 * line - 1; j++){
                System.out.print(line);
            }
            for (int j = 1; j <= -1 * line + 6; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
