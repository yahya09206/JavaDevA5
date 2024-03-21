package PracticeIt.Chapter1;

public class TwoRockets {
    public static void main(String[] args) {

        top();
        box();
        unitedStates();
        box();
        top();
    }

    public static void top(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\ ");
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
