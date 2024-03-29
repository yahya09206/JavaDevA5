package PracticeIt.Chapter2;

public class WaveNumbers40 {
    public static void main(String[] args) {

        for (int i = 1; i <= 40; i++){
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++){
            System.out.print("_-^-");
        }
        System.out.println();
        for (int i = 0; i < 2; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(j%10);
                System.out.print(j%10);
            }
        }
        System.out.println();
        for (int i = 1; i <= 40; i++){
            System.out.print("-");
        }
    }
}
