package PracticeIt.Chapter2;

public class NestedNumbers {
    public static void main(String[] args) {

        //how many lines
        for (int i = 0; i < 3; i++){
            // how many numbers
            for (int j = 0; j <= 9; j++){
                // how many times the numbers are repeated
                for (int k = 0; k < 3; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
