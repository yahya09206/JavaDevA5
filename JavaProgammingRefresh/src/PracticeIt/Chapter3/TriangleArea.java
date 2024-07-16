package PracticeIt.Chapter3;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println(triangleArea(8, 5.2, 7.1));
    }
    public static double triangleArea(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt((s * (s-a) * (s-b) * (s-c)));
    }
}
