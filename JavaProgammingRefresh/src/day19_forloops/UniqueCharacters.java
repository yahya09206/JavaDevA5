package day19_forloops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word = "aabcc";
        boolean isUnique = word.indexOf('a') == word.lastIndexOf('a');

        System.out.println("isUnique = " + isUnique);
    }
}
