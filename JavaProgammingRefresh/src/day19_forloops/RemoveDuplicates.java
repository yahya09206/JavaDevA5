package day19_forloops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String word = "ababababab";
        // variable for storing "ab"
        String result = "";
        // variable to keep track of occurrences
        int count = 0;

        // loop thru word
        for (int i = 0; i <= word.length() - 1; i++){
            // use contains() method
            // use results variable to check if the character is already in there --> if it is not contained, then add it to result
            if (!result.contains("" + word.charAt(i))){
                result += word.charAt(i);
            }
        }

        System.out.println(result);
    }
}
