package PracticeIt.Chapter2;

public class WaveNumbers40 {
    public static void main(String[] args) {

        // print dashes
        for (int i = 1; i <= 40; i++){
            System.out.print("-");
        }
        System.out.println();
        // print waves
        for (int i = 1; i <= 10; i++){
            System.out.print("_-^-");
        }
        System.out.println();
        // print numbers
        for(int j = 0; j < 2; j++) {
            for(int i = 1; i <= 10; i++) {
                System.out.print(i%10);
                System.out.print(i%10);
            }
        }
        System.out.println();
        for (int i = 1; i <= 40; i++){
            System.out.print("-");
        }

    }
}
