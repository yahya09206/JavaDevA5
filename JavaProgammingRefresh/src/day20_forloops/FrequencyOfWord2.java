package day20_forloops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = "Python wow wow wow Python Python Python";
        String word = "wow";
        int count = 0;

        // generalize for any string
        for (int i = 0; i <= sentence.length() - 6; i++){
            String each = sentence.substring(i, i+ word.length());
            if (each.equals(word)){
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
