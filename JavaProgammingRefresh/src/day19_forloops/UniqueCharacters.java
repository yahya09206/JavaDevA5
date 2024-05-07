package day19_forloops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String uniqueChars = "ababababbaewlbbaa";
        String result = "";

        // use firstIndexOf() and lastIndexOf() methods
        for (int i = 0; i <= uniqueChars.length() - 1; i++){
            // get the starting and ending points of index by using boolean
            char ch = uniqueChars.charAt(i); // get character at each index
            boolean isUnique = uniqueChars.indexOf(ch) == uniqueChars.lastIndexOf(ch);

            if (isUnique){
                // store unique characters into result variable
                result += ch;
            }
        }

        System.out.println("result = " + result);
    }
}
