package day15_string;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence = "Java Programming Language";
        String name = sentence.substring(0, 3 + 1);
        System.out.println(name);

        String s2 = "Cybertek School";

        // Substring to print out cybertek
        String name2 = s2.substring(0, 7 + 1);
        System.out.println(name2);

        String name3 = s2.substring(9, 15);
        System.out.println(name3);
    }
}
