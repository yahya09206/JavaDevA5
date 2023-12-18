package day51_Abstraction.shapeTask;

public class Square {

    private double s;

    public double getS() {
        return s;
    }

    public void setS(double s) {
        if (s <= 0){
            throw new RuntimeException("Invalid Side: " + s);
        }
        this.s = s;
    }
}
