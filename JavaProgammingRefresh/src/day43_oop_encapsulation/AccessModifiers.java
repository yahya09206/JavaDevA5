package day43_oop_encapsulation;

public class AccessModifiers {

    public static int publicVariable = 100; // visible to every class
    protected static int protectedVariable = 1000; //
    private static int privateVariable = 200; // only in class visibility

    public static void main(String[] args) {

        System.out.println(privateVariable);
        System.out.println(publicVariable);
    }

}
