package day12_scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        int number = 5;

        switch (number){

            case 3:
            case 6:
            case 9:
                System.out.println("Fizz");
                break;

            case 5:
            case 10:
                System.out.println("Buzz");
                break;

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
