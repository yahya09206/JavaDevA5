package day51_Abstraction.shapeTask;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //abstract methods
    public abstract double area();
    public abstract double perimeter();

}
