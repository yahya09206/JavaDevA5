package PracticeIt.Chapter1;

public class TwoRockets {
    public static void main(String[] args) {
        arrow();
        box();
        unitedStates();
        box();
        arrow();
    }

    public static void arrow(){

        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void box(){

        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    public static void unitedStates(){
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
