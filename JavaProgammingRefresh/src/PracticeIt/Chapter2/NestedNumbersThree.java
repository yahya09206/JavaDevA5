package PracticeIt.Chapter2;

public class NestedNumbersThree {
    public static void main(String[] args) {

        // print out rows 3 times
        for (int k = 1; k <= 4; k++){
            // print out from 0-9
            for (int i = 9; i >= 0; i--){
                //print each number 3 times
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
