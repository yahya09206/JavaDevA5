package PracticeIt.Chapter1;

public class Egg2 {
    public static void main(String[] args) {

        topHalf();
        bottomHalf();
        middle();

        topHalf();
        bottomHalf();
        middle();
        bottomHalf();

        topHalf();
        middle();
        bottomHalf();

    }

    public static void topHalf(){

        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void bottomHalf(){

        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

    public static void middle(){

        System.out.println("-\"-'-\"-'-\"-");
    }
}
