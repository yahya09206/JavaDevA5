package day24_arrays;

public class StringMethods {
    public static void main(String[] args) {

        // split method
        String sentence  = "I love java programming language";
        String[] splitWords = sentence.split(" ");

        for (int i = splitWords.length - 1; i >= 0; i--){
            System.out.print(splitWords[i] + " ");
        }
    }
}
