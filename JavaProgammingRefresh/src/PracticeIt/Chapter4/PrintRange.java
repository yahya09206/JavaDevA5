package PracticeIt.Chapter4;

public class PrintRange {
    public static void main(String[] args) {

        printRange(2, 7);
        System.out.println();
        printRange(19, 11);
        System.out.println();
        printRange(5, 5);
    }

    public static void printRange(int a, int b){

        if (a < b){
            for (int i = a; i <= b; i++){
                System.out.print(i + " ");
            }
        }else if (a > b){
            for (int i = a; i >= b; i--){
                System.out.print(i + " ");
            }
        }else {
            System.out.println(a);
        }
    }
}
