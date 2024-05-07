package day20_forloops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java Java";
        // variable to store occurrences
        int count = 0;

        // stop loop at end of the length of the word or you will get stringindexoutofbounds exception
        for (int i = 0; i <= sentence.length() - 4; i++){
            // get substring from beginning of word until the end of it
            String each = sentence.substring(i, i + 4);

            if (each.equals("Java")){
                count++;
            }
        }

        System.out.println("The frequency of the word Java = " + count);
    }
}
