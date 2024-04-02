package PracticeIt.Chapter2;

public class NestedNumbers3 {
    public static void main(String[] args) {

        //how many lines
        for (int i = 1; i <= 4; i++){
            // how many numbers
            for (int j = 9; j >= 0; j--){
                // how many times the numbers are repeated
                for (int k = 1; k <= j; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
