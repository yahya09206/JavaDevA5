package PracticeIt.Chapter3;

public class LargestAbsVal {
    public static void main(String[] args) {
        System.out.println(largestAbsVal(7, 2, -11));

    }

    public static int largestAbsVal(int a, int b, int c){

        return Math.max((Math.abs(a)), Math.max(Math.abs(b), Math.abs(c)));

    }
}
