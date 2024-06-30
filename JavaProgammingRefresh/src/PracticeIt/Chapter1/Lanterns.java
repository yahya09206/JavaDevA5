package PracticeIt.Chapter1;

public class Lanterns {
    public static void main(String[] args) {

        topHalf();
        System.out.println();
        topHalf();
        middle();
        straight();
        topHalf();
        System.out.println();
        topHalf();
        shortLine();
        middle();
        middle();
        shortLine();
        shortLine();
    }

    public static void topHalf(){

        System.out.println("    *****    ");
        System.out.println("  *********  ");
        System.out.println("*************");
    }

    public static void middle(){

        System.out.println("* | | | | | *");
    }

    public static void straight(){

        System.out.println("*************");
    }

    public static void shortLine(){

        System.out.println("    *****    ");
    }
}
