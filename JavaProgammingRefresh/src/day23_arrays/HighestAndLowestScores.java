package day23_arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] scores = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tonny", "John", "Amy"};

        // variables to store max score and name with the highest score
        int maxScore = scores[0];
        String maxName = "";

        for (int i = 0; i <= scores.length - 1; i++){
            // Variables to represent names and scores
            String eachName = names[i];
            int eachScore = scores[i];

            if (eachScore > maxScore){
                maxScore = eachScore;
                maxName = eachName;
            }
        }

        System.out.println(maxScore);
        System.out.println(maxName);
    }
}
