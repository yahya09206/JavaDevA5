package PracticeIt.Chapter1;

public class EggStop {
    public static void main(String[] args) {

        top();
        bottom();
        System.out.println();
        top();
        bottom();
        middle();
        System.out.println();
        top();
        stop();
        bottom();
        middle();

    }

    public static void top(){
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void middle(){
        System.out.println("+--------+");
    }

    public static void bottom(){
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    public static void stop(){
        System.out.println("|  STOP  |");
    }
}
