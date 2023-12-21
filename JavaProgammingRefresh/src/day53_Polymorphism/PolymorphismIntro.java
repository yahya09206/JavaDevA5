package day53_Polymorphism;

import day51_Abstraction.shapeTask.Circle;
import day51_Abstraction.shapeTask.Shape;
import day51_Abstraction.shapeTask.Square;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape square = new Square(10);
    }
}
