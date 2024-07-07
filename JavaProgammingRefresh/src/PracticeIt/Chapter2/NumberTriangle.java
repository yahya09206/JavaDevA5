package PracticeIt.Chapter2;

public class NumberTriangle {
    public static void main(String[] args) {

        // Draw the first star on a line
        // Make sure that it spans 5 lines
        for (int i = 1; i <= 7; i++){
            // Inner for loop will be the amount of stars on each line
            for (int j = 1; j <= i; j++){
                // draw a start that corresponds to the index number
                System.out.print(i);
            }
            // jump to new line
            System.out.println();
        }
    }
}
