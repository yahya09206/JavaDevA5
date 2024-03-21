package PracticeIt.Chapter1;

public class StarFigures {
    public static void main(String[] args) {

        twoRows();
        star();
        System.out.println();
        twoRows();
        star();
        twoRows();
        System.out.println();
        straight();
        twoRows();
        star();

    }

    public static void twoRows(){
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void star(){
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");
    }

    public static void straight(){
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
    }
}
