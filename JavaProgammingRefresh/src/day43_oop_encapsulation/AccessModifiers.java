package day43_oop_encapsulation;

public class AccessModifiers {

    public static int publicVariable = 100;
    protected static int protectedVariable = 1000;
    static int defaultVariable = 200;
    private static int privateVariable = 200;

    public static void main(String[] args) {
        // starting final tomorrow
        System.out.println(privateVariable);
        System.out.println(defaultVariable);
        System.out.println(publicVariable);
    }
}
