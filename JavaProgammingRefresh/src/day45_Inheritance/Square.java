package day45_Inheritance;

public class Square {

    private double side;

    public Square(){
        setSide(side);
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        if (side < 0){
            return;
        }
        this.side = side;
    }


}
