package PracticeIt.Chapter4;

public class SecondHalfLetters {
    public static void main(String[] args) {

        System.out.println(secondHalfLetters("ruminates"));
    }
    public static int secondHalfLetters(String word){

        int count = 0;
        for (int i = 0; i <= word.length() - 1; i++){
            if (Character.toLowerCase(word.charAt(i)) >= 'n'){
                count++;
            }
        }
        return count;
    }
}
