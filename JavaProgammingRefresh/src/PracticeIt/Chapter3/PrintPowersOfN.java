package PracticeIt.Chapter3;

public class PrintPowersOfN {
    public static void main(String[] args) {

        printPowersOfN(5, 6);

    }

    public static void printPowersOfN(int base, int exponent){

        for (int i = 0; i <= exponent; i++){
            System.out.print((int) Math.pow(base, i) + " ");
        }
    }
}
