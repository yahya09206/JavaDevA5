package PracticeIt.Chapter1;

public class StarFigures {
    public static void main(String[] args) {

        top();
        bigX();
        System.out.println();
        top();
        bigX();
        top();
        System.out.println();
        straight();
        top();
        bigX();

    }

    public static void top(){

        System.out.println("*****");
        System.out.println("*****");
    }

    public static void bigX(){

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
