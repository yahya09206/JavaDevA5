package day24_arrays;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {

        String[] classmates = {"Gulistan", "Feruza", "Ahmet", "Memet", "Tamara", "Abbos"};
        System.out.println(Arrays.toString(classmates));

        for (int i = 0; i <= classmates.length - 1; i++){
            String each = classmates[i];
            System.out.println(each.substring(0, 3));
        }
    }
}
