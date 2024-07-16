package PracticeIt.Chapter3;

public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(-947));
    }
    public static int lastDigit(int num){

        return  Math.abs(num % 10);
    }
}
