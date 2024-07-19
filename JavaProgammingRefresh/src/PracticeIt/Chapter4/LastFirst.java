package PracticeIt.Chapter4;

public class LastFirst {
    public static void main(String[] args) {

        System.out.println(lastFirst("Theon Greyjoy"));

    }

    public static String lastFirst(String name){

        int space = name.indexOf(" ");
        String lastName = name.substring(space + 1);
        String firstInitial = name.substring(0,1);
        return lastName + ", " + firstInitial + ".";

    }
}
