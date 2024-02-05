package day20_forloops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java Java";
        // keep track of count
        int count = 0;

        // loop through word ending with length of word
        for (int i = 0; i <= sentence.length() - 4; i++){
            // start with beginning of word until the end of its length
            String each = sentence.substring(i, i + 4);
            if (each.equals("Java")){
                count++;
            }
        }
        // print out count
        System.out.println("count = " + count);
    }
}
