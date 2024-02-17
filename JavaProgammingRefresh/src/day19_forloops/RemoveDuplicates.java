package day19_forloops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String word = "churro";
        String result = "";

        for (int i = 0; i <= word.length() - 1; i++){
            // check to see if result contains character
            if (!result.contains(""+word.charAt(i))){
                // add character to result variable
                result += word.charAt(i);
            }
        }

        System.out.println("result = " + result);
    }
}
