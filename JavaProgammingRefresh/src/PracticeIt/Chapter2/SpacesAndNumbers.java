package PracticeIt.Chapter2;

public class SpacesAndNumbers {
    public static void main(String[] args) {

        // Now this might need 3 nested for loops, but I will start with 2
        // First loop will make it run 5 times
        for (int i = 1; i <= 5; i++){
            // print spaces
            for (int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            // print number i, i times
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            // go to new line
            System.out.println();
        }
    }
}
