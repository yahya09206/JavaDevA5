package PracticeIt.Chapter1;

public class EggStop {
    public static void main(String[] args) {

        topHalf();
        bottomHalf();
        System.out.println();
        topHalf();
        bottomHalf();
        middle();
        System.out.println();
        topHalf();
        System.out.println("|  STOP  |");
        bottomHalf();
        middle();

    }

    public static void topHalf(){

        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void bottomHalf(){

        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    public static void middle(){

        System.out.println("+--------+");
    }

}
