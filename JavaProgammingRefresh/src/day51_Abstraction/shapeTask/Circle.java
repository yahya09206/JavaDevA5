package day51_Abstraction.shapeTask;

public class Circle extends Shape{

    public double r;
    public final static double PI = 3.14;

    public Circle(double r) {
        super("Cirlce");
        setR(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area(){
        return r * r * PI;
    }

    @Override
    public double perimeter(){
        return 2 * r * PI;
    }
}
