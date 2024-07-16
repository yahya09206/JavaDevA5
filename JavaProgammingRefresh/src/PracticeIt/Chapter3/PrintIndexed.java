package PracticeIt.Chapter3;

public class PrintIndexed {
    public static void main(String[] args) {
        printIndexed("zelda");
    }
    public static void printIndexed(String word){

        String result = "";

        for (int i = 0; i <= word.length() - 1; i++){
            char currentChar = word.charAt(i);
            int reverseIndex = word.length() - 1 - i;
            result += "" + currentChar + "" + reverseIndex;
        }

        System.out.println(result);
    }
}
