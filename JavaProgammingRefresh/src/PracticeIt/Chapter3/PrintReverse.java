package PracticeIt.Chapter3;

public class PrintReverse {
    public static void main(String[] args) {
        printReverse("hello there!");
    }
    public static void printReverse(String string){

        for (int i = string.length() - 1; i >= 0; i--){
            System.out.print(string.charAt(i));
        }
    }
}
