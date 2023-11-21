package day43_oop_encapsulation;

public class Test {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable); // reachable within same package
        System.out.println(AccessModifiers.defaultVariable);// reachable within same package
        // System.out.println(AccessModifiers.privateVariable); // not reachable within same package

    }
}
