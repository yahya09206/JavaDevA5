package day19_forloops;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String word = "ababababab";
        String result = "";

        for (int i = 0; i <= word.length() - 1; i++){

            if (!result.contains("" + word.charAt(i))){
                result += word.charAt(i);
            }
        }
    }
}
