package PracticeIt.Chapter2;

public class SpacedNumbers {
    public static void main(String[] args) {

        // Now this might need 3 nested for loops, but I will start with 2
        // First loop will make it run 5 times
        for (int i = 1; i <= 5; i++){
            // Second for loop will print the spaces and then the number
            for (int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            //print out number and go to a new line
            System.out.print(i);
            System.out.println();
        }
    }
}
