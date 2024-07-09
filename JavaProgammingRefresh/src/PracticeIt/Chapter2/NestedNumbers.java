package PracticeIt.Chapter2;

public class NestedNumbers {
    public static void main(String[] args) {

        // print out rows 3 times
        for (int k = 1; k <= 3; k++){
            // print out from 0-9
            for (int i = 0; i <= 9; i++){
                //print each number 3 times
                for (int j = 1; j <= 3; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
