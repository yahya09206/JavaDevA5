package PracticeIt.Chapter3;

public class SphereVolume {
    public static void main(String[] args) {
        System.out.println(sphereVolume(2.0));
    }
    public static double sphereVolume(double radius){

        return ((double)4/3) * Math.PI * (radius * radius * radius);
    }
}
