package day24_arrays;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {

        String[] classmates = {"Gulistan", "Feruza", "Ahmet", "Memet"};

        System.out.println("Arrays.toString(classmates) = " + Arrays.toString(classmates));

            for (int i = 0; i <= classmates.length - 1; i++) {
                System.out.println(classmates[i].substring(0, 3));
        }
    }
}
