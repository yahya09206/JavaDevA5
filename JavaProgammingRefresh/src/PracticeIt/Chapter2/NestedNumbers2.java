package PracticeIt.Chapter2;

public class NestedNumbers2 {
    public static void main(String[] args) {

        //how many lines
        for (int i = 0; i < 5; i++){
            // how many numbers
            for (int j = 9; j >= 0; j--){
                // how many times the numbers are repeated
                for (int k = 0; k <= 4; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
