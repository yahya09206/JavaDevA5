package day23_arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] scores = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tony", "John", "Amy"};
        int max = scores[0];
        String nameOfHighestScore = "";

        for (int i = 0; i <= scores.length - 1; i++){
            String eachName = names[i];
            int eachScore = scores[i];
            if (eachScore > max){
                max = eachScore;
                nameOfHighestScore = eachName;
            }
        }

        System.out.println("max = " + max);
        System.out.println("nameOfHighestScore = " + nameOfHighestScore);
    }
}
