package PracticeIt.Chapter1;

public class Lanterns {
    public static void main(String[] args) {

        five();
        middle();
        bottom();
        System.out.println();
        five();
        middle();
        bottom();
        light();
        bottom();
        five();
        middle();
        bottom();
        System.out.println();
        five();
        middle();
        bottom();
        five();
        light();
        light();
        five();
        five();


    }

    public static void five(){
        System.out.println("    *****    ");
    }

    public static void middle(){
        System.out.println("  ********* ");
    }

    public static void bottom(){
        System.out.println("*************");
    }

    public static void light(){
        System.out.println("* | | | | | *");
    }
}
