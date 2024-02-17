package day19_forloops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String word = "abababababa";
        String result = "";

        for (int i = 0; i <= word.length(); i++){
            // check to see if result contains character
            if (!result.contains(""+word.charAt(i))){
                result += word.charAt(i);
            }
        }
    }
}
