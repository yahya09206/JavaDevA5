package PracticeIt.Chapter3;

public class LargerAbsVal {
    public static void main(String[] args) {

        System.out.println(largerAbsVal(4, -5));
    }

    public static int largerAbsVal(int a, int b){

        return Math.max(Math.abs(a), Math.abs(b));
    }
}
