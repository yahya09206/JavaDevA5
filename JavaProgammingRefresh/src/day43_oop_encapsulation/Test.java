package day43_oop_encapsulation;

public class Test {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        System.out.println(AccessModifiers.protectedVariable);

        Encapsulation encapsulation = new Encapsulation();
        System.out.println(encapsulation.username);
        System.out.println(encapsulation.password);

        encapsulation.username = "H";
        encapsulation.password = "123";

        System.out.println(encapsulation.username);
        System.out.println(encapsulation.password);



    }
}
