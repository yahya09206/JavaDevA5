package PracticeIt.Chapter4;

public class FractionSum {
    public static void main(String[] args) {
        System.out.println(fractionSum(10));

    }
    public static double fractionSum(int n){

        double sum = 0.0;
        for (double i = 1.0; i <= n; i++){
            sum += 1/i;
        }
        return sum;
    }
}
