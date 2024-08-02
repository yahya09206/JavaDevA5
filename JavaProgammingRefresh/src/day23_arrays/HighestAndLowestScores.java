package day23_arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] scores = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tony", "John", "Amy"};
        int maxScore = scores[0];
        String maxName = "";

        int minScore = scores[0];
        String minName = "";

        for (int i = 0; i <= scores.length - 1; i++){
            String eachName = names[i];
            int eachScore = scores[i];

            if (eachScore > maxScore){
                maxScore = eachScore;
                maxName = eachName;
            }

            if (eachScore < minScore){
                minScore = eachScore;
                minName = eachName;
            }
        }

        System.out.println("High score of " + maxScore + " belongs to " + maxName);
        System.out.println("Low score of " + minScore + " belongs to " + minName);
    }
}
