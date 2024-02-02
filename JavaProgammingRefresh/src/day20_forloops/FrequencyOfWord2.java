package day20_forloops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        // Sentence to check
        String sentence = "Python wow wow wow Python Python Python";
        String word = "wow";
        int count = 0;

        // generalize for any string
        for (int i = 0; i <= sentence.length() - 6; i++){
            // start at beginning of word up until it's length
            String each = sentence.substring(i, i+ word.length());
            if (each.equals(word)){
                count++;
            }
        }

        // print out count
        System.out.println("count = " + count);
    }
}
