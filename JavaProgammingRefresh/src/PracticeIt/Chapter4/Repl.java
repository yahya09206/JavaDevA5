package PracticeIt.Chapter4;

public class Repl {
    public static void main(String[] args) {
        System.out.println(repl("hello", 3));

    }
    public static String repl(String word, int n){


        String concatenation = "";
        for (int i = 0; i < n; i++){
            concatenation += word;
        }
        return concatenation;
    }
}
