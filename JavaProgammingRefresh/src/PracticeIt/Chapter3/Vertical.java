package PracticeIt.Chapter3;

public class Vertical {
    public static void main(String[] args) {

        vertical("hey now");
    }
    public static void vertical(String string){

        for (int i = 0; i <= string.length() - 1; i++){
            System.out.println(string.charAt(i));
        }
    }
}
