package day19_forloops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word = "aabcc";
        String result = "";


        for (int i = 0; i <= word.length() - 1; i++){
            // break the string up into individual chars
            char ch = word.charAt(i);
            // comparing the char with the first time and last time it was read
            boolean isUnique = word.indexOf(ch) == word.lastIndexOf(ch);

            // check if char is unique
            if (isUnique){
                // if so, add it to the list of chars
                result += ch;
            }
        }

        System.out.println("result = " + result);
//        boolean isUnique = word.indexOf('a') == word.lastIndexOf('a');
//
//        System.out.println("isUnique = " + isUnique);
    }
}
