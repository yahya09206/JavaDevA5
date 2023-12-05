package day46_Inheritance;

public class Car {

    private String brand;
    private String model;
    private int year;
    private String color;
    private double miles;

    public Car(String brand, String model, int year, String color, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.miles = miles;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public void start(){

    }

    public void drive(){

    }


}
