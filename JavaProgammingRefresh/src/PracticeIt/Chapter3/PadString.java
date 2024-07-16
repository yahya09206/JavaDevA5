package PracticeIt.Chapter3;

public class PadString {
    public static void main(String[] args) {
        System.out.println(padString("hello", 8));
    }
    public static String padString(String string, int length){

        int wordLength = string.length();

        for (int space = 1; space <= length - wordLength; space++) {
            string = " " + string;
        }

        return string;

    }
}
