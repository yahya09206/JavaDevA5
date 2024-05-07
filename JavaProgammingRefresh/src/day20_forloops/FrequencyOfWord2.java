package day20_forloops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {


        String word = "Python Python";
        int count = 0;

        for (int i = 0; i <= word.length() - 6; i++){
            String each = word.substring(i, i + 6);
            System.out.println(each);
            if (each.equals("Python")){
                count++;
            }
        }

        System.out.println("The frequency of the word Python = " + count);
    }
}
