package day45_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        // new instance of dog
        Dog dog = new Dog("Lucy", "Bull Terrier", 'M', "Tiny", 2, "White");
        dog.bark();
        dog.eat("dog food");
        dog.drink("water");
        dog.sleep();
        System.out.println(dog);

        // new instance of cat object
        System.out.println("----------------------------");
        Cat cat = new Cat("Garfield", "Siamese", 'F', "Tiny", 3, "Orange");
        cat.meow();
        cat.eat("cat food");
        cat.drink("milk");
        cat.sleep();
        System.out.println(cat);

        // new tiger object
        System.out.println("----------------------------");
        Tiger tiger = new Tiger("Tarzan", "Bengal", 'M', "Large", 15, "White");
        tiger.roar();
        tiger.eat("tiger food");
        tiger.drink("water");
        tiger.sleep();
        System.out.println(tiger);

    }
}
