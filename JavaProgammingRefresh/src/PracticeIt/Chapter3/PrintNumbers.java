package PracticeIt.Chapter3;

public class PrintNumbers {
    public static void main(String[] args) {

        printNumbers(5);
    }

    public static void printNumbers(int max){


        for (int i = 1; i <= max; i++){
            System.out.print("[" + i + "] " );
        }

    }
}
