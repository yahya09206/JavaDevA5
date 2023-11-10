package day15_string;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first Number:");
        double num1 = scan.nextDouble();

        System.out.println("Enter a math operator");
        char mathOperator = scan.next().charAt(0);

        System.out.println("Enter your second number");
        double num2 = scan.nextDouble();

        double result = 0;
        switch (mathOperator){

            case '-':
                result = num1 - num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.err.println("Invalid Operator");
        }

        System.out.println("result = " + result);
    }
}
