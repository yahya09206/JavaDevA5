package PracticeIt.Chapter3;

public class Scientific {
    public static void main(String[] args) {
        System.out.println(scientific(6.23, 5.0));

    }
    public static double scientific(double base, double exponent){

        return base * Math.pow(10, exponent);
    }
}
