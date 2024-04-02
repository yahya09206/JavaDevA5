package PracticeIt.Chapter2;

public class PrintDesign {
    public static void main(String[] args) {

    }
    public static void printDesign(){
        //how many lines
        for (int i = 1; i <= 9; i+=2){
            for (int j = 0; j < (11 - i) / 2; j++){
                System.out.print("-");
            }
            // how many times the numbers are repeated
            // in this case it would be 1 = 1 time, 3 = 3 times etc
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            for (int j = 0; j < (11 - i) / 2; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
