package day45_Inheritance.animalTask;

// cat class extending from Animal to practice inheritance
public class Cat extends Animal{

    // cat constructor
    public Cat(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    // method to call meow
    public void meow(){
        System.out.println(name + " is meowing");
    }
}
