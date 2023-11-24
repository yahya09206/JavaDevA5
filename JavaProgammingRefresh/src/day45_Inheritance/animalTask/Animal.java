package day45_Inheritance.animalTask;

public class Animal {

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;

    public Animal(String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public static boolean breathe = true;

}
