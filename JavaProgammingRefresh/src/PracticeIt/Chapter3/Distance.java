package PracticeIt.Chapter3;

public class Distance {
    public static void main(String[] args) {
        System.out.println(distance(1, 0, 4, 4));

    }
    public static double distance(int x1, int y1, int x2, int y2){

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
