package day37_classintro;

public class DogPark {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Mikey";
        dog1.gender = "Male";
        dog1.breed = "bull terrier";
        dog1.size = "tiny";
        dog1.age = 32;
        dog1.color = "yellowish brown";

        System.out.println(dog1.name);
        System.out.println(dog1.gender);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);

        Dog dog2 = new Dog();
        dog2.setInfo("Bobby", "Bull Terrier", "Female", "Brown", "Tiny", 33);
        System.out.println(dog2.name);
    }
}
