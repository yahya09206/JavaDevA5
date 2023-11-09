package day12_scanner;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Length");
        int length = scan.nextInt();
        System.out.println("Enter width");
        int width = scan.nextInt();

        double area = (2 * length) * (2 * width);

        System.out.println("area = " + area);
    }
}
