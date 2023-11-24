package day45_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog("Lucy", "Bull Terrier", 'M', "Tiny", 2, "White");
        dog.bark();
        dog.eat("dog food");
        dog.drink("water");
        dog.sleep();
    }
}
