package PracticeIt.Chapter4;

public class Pow {
    public static void main(String[] args) {

        System.out.println(pow(3, 4));
    }

    public static int pow(int base, int exp){

        int product = 1;
        for (int i = 1; i <= exp; i++){
            product *= base;
        }

        return product;

    }
}
