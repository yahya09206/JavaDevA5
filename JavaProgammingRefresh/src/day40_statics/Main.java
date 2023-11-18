package day40_statics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Address address = new Address();

        System.out.println("Enter your building number");
        String building = scanner.next();

        scanner.nextLine();
        System.out.println("Enter your street name");
        String street = scanner.nextLine();

        System.out.println("Enter your city name");
        String city = scanner.nextLine();

        System.out.println("Enter your state name");
        String state = scanner.nextLine();

        System.out.println("Enter your zipcode");
        int zipCode = scanner.nextInt();

        address.setInfo(building, street, city, state, zipCode);

        System.out.println(address);
    }
}
