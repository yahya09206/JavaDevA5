package org.cydeo;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        System.out.println("***********************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        // Print the length of the name of each dish
        System.out.println("***********************");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        // Print the three highest caloric dish names(>300)
        System.out.println("***********************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);
    }
}
