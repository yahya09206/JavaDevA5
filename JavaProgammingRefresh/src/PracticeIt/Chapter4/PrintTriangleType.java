package PracticeIt.Chapter4;

public class PrintTriangleType {
    public static void main(String[] args) {
        printTriangleType(2, 2, 2);
        printTriangleType(2, 2, 3);
        printTriangleType(1, 2, 3);
    }
    public static void printTriangleType(int a, int b, int c){

        if (a == b && b == c){
            System.out.println("equilateral");
        }else if (a == b || a == c || b == c){
            System.out.println("isosceles");
        }else {
            System.out.println("scalene");
        }

    }
}
