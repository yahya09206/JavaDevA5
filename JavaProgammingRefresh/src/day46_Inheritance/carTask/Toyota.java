package day46_Inheritance.carTask;

public class Toyota extends Car{

    public static boolean isReliable = true;

    // starting java shorts soon
    public Toyota(String model, int year, double price, String color, long miles) {
        super("Toyota", model, year, price, color, miles);
    }


}
