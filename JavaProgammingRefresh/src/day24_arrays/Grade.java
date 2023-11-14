package day24_arrays;

public class Grade {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        int score = scores[i];
        if (scores[0] >= 90){
            grades[0] = 'A';
        }else if (scores[0] >= 80){
            grades[0] = 'B';
        }else if (scores[0] >= 70){
            grades[0] = 'C';
        } else if (scores[0] >= 60) {
            grades[0] = 'D';
        }else {
            grades[0] = 'F';
        }
    }
}
