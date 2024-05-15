package Day37_CustomClasses;

public class DogPark {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Mikey";
        dog1.gender = "Male";
        dog1.breed = "Pit Terrier";
        dog1.age = 5;
        dog1.size = "Large";
        dog1.color = "White";

        System.out.println(dog1.name);
        System.out.println(dog1.gender);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.size);
        System.out.println(dog1.color);


    }
}
