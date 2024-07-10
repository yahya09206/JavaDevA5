package PracticeIt.Chapter3;

public class PrintPowersOfTwo {
    public static void main(String[] args) {

        printPowersOf2(10);
    }
    public static void printPowersOf2(int max){

        for (int i = 1; i <= max; i++){
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }
}
