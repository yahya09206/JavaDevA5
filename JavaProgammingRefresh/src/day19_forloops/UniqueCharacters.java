package day19_forloops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word = "aadddwddffffbcc";
        // Store unique character inside result
        String result = "";

        for (int i = 0; i <= word.length() - 1; i++){
            // split into chars
            char ch = word.charAt(i);
            // check if boolean will return true or false based on the first occurrence and its last occurrence
            boolean isUnique = word.indexOf(ch) == word.lastIndexOf(ch);
            // check if char only appears one time
            if (isUnique){
                // add unique char to result variable
                result += ch;
            }
        }

        System.out.println("result = " + result);
    }
}
