package org.cydeo;

import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {

        // All Match
        boolean isHealth = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealth);

        System.out.println("******************************");
        // Any Match
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is veggie friendly");
        }

        System.out.println("******************************");
        // None Match
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        System.out.println("******************************");
        // Find Any
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish);
    }
}
